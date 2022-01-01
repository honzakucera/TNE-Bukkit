package net.tnemc.core.common.menu.api;

/**
 * The New Economy Minecraft Server Plugin
 * <p>
 * Created by creatorfromhell on 12/18/2021.
 * <p>
 * This work is licensed under the Creative Commons Attribution-NonCommercial-NoDerivatives 4.0 International License.
 * To view a copy of this license, visit http://creativecommons.org/licenses/by-nc-nd/4.0/ or send a letter to
 * Creative Commons, PO Box 1866, Mountain View, CA 94042, USA.
 * Created by creatorfromhell on 06/30/2017.
 */
public interface Menu {

  /**
   * The unique identifier for this menu.
   * @return The unique identifier for this menu.
   */
  String identifier();

  /**
   * The size of this menu in slots, must be divisible by 9.
   * @return The size of this menu in slots, must be divisible by 9.
   */
  int size();

  /**
   * The title of this menu.
   * @return  The title of this menu.
   */
  String title();
}