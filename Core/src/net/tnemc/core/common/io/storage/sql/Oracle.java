package net.tnemc.core.common.io.storage.sql;

import net.tnemc.core.common.io.storage.SQLStorage;


public class Oracle extends SQLStorage {

  @Override
  public String getDriver() {
    return "oracle.jdbc.driver.OracleDriver";
  }

  @Override
  public Boolean dataSource() {
    return true;
  }

  @Override
  public String dataSourceURL() {
    return "oracle.jdbc.pool.OracleDataSource";
  }

  @Override
  public String getURL(String file, String host, int port, String database) {
    return "jdbc:oracle:thin:@" + host + ":" + port + ":" + database;
  }
}