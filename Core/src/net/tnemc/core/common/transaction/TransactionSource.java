package net.tnemc.core.common.transaction;

/**
 * An object that represents the source of an {@link Transaction transaction}.
 *
 * @see Transaction
 * @since 0.1.1.17
 * @author creatorfromhell
 */
public interface TransactionSource {

  /**
   * The human-friendly identifier of the cause of the {@link Transaction transaction}.
   * @return The human-friendly identifier of the cause of the {@link Transaction transaction}.
   */
  String source();
}