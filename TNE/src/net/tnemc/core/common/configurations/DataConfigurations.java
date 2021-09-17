package net.tnemc.core.common.configurations;

import net.tnemc.config.CommentedConfiguration;
import net.tnemc.core.TNE;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * The New Economy Minecraft Server Plugin
 * <p>
 * Created by creatorfromhell on 9/15/2021.
 * <p>
 * This work is licensed under the Creative Commons Attribution-NonCommercial-NoDerivatives 4.0 International License.
 * To view a copy of this license, visit http://creativecommons.org/licenses/by-nc-nd/4.0/ or send a letter to
 * Creative Commons, PO Box 1866, Mountain View, CA 94042, USA.
 * Created by creatorfromhell on 06/30/2017.
 */
public class DataConfigurations extends Configuration {
  @Override
  public CommentedConfiguration getConfiguration() {
    return TNE.instance().dataConfigurations();
  }

  @Override
  public List<String> node() {
    List<String> nodes = new ArrayList<>();
    nodes.add("Data");
    return nodes;
  }

  @Override
  public File getFile() {
    return new File(TNE.instance().getDataFolder(), "data.yml");
  }

  @Override
  public void load(CommentedConfiguration configurationFile) {

    super.load(configurationFile);
  }
}