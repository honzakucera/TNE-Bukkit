package net.tnemc.core.common.transaction;

import java.math.BigDecimal;

/**
 * An object that represents a charge during any form of financial transaction.
 *
 * @see Transaction
 * @since 0.1.1.17
 * @author creatorfromhell
 */
public class Charge {

  /**
   * The identifier of the currency involved.
   */
  private String currency;

  /**
   * The name of the world involved.
   */
  private String world;

  /**
   * The {@link BigDecimal amount} that this charge is for.
   */
  private BigDecimal amount;

  /**
   * Constructs an object that represents a charge during a financial transaction.
   * @param currency The identifier of the currency involved.
   * @param world The name of the world involved.
   * @param amount The {@link BigDecimal amount} that this charge is for.
   */
  public Charge(String currency, String world, BigDecimal amount) {
    this.currency = currency;
    this.world = world;
    this.amount = amount;
  }

  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public String getWorld() {
    return world;
  }

  public void setWorld(String world) {
    this.world = world;
  }

  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }
}