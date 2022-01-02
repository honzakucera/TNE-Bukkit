package net.tnemc.core.common;

import net.tnemc.core.common.account.Account;
import net.tnemc.core.common.account.NonPlayerAccount;
import net.tnemc.core.common.account.SharedAccount;
import net.tnemc.core.common.io.cache.RefreshConcurrentMap;
import net.tnemc.core.common.io.cache.listeners.AccountMapListener;

import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;

/**
 * Represents the manager for everything in our economy system. This class is the core of everything
 * that happens in TNE.
 *
 * @since 0.1.1.17
 * @author creatorfromhell
 */
public class EconomyManager {

  //Constants
  public static final Pattern UUID_MATCHER_PATTERN = Pattern.compile("(\\w{8})(\\w{4})(\\w{4})(\\w{4})(\\w{12})");

  private final RefreshConcurrentMap<String, Account> accounts;

  /**
   * Instance of the Economy manager.
   */
  private static EconomyManager instance;

  private CurrencyManager currencyManager;

  private boolean consolidate = false;
  private boolean cache = true;

  public EconomyManager() {
    instance = this;
    this.currencyManager = new CurrencyManager();

    accounts = new RefreshConcurrentMap<>(true, 300, new AccountMapListener());
  }

  public ConcurrentHashMap<String, NonPlayerAccount> findNonPlayers() {
    return null;
  }

  public ConcurrentHashMap<String, SharedAccount> findShared() {
    return null;
  }

  public static EconomyManager instance() {
    return instance;
  }

  public CurrencyManager currencyManager() {
    return currencyManager;
  }

  public boolean canConsolidate() {
    return consolidate;
  }

  public void setConsolidate(boolean consolidate) {
    this.consolidate = consolidate;
  }

  public boolean canCache() {
    return cache;
  }

  public void setCache(boolean cache) {
    this.cache = cache;
  }
}