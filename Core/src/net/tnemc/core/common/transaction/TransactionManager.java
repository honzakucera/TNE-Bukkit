package net.tnemc.core.common.transaction;

import net.tnemc.core.common.account.history.TransactionLog;
import net.tnemc.core.common.transaction.type.TransactionType;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Used to manage everything transaction-related.
 *
 * @see Transaction
 * @since 0.1.1.17
 * @author creatorfromhell
 */
public class TransactionManager {

  Map<String, TransactionType> types = new HashMap<>();

  ConcurrentHashMap<UUID, TransactionLog> history = new ConcurrentHashMap<>();


}