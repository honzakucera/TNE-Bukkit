package net.tnemc.core.common.currency.item;

import net.tnemc.core.common.currency.Currency;

/**
 * Represents a {@link Currency currency} that is able to be represented by physical items in game.
 *
 * @see Currency
 * @since 0.1.1.17
 * @author creatorfromhell
 */
public class ItemCurrrency extends Currency {

  protected boolean enderChest;
  protected boolean consolidate;

  public boolean canEnderChest() {
    return enderChest;
  }

  public void setEnderChest(boolean enderChest) {
    this.enderChest = enderChest;
  }

  public boolean isConsolidate() {
    return consolidate;
  }

  public void setConsolidate(boolean consolidate) {
    this.consolidate = consolidate;
  }
}