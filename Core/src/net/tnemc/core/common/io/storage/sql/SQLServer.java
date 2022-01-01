package net.tnemc.core.common.io.storage.sql;

import net.tnemc.core.common.io.storage.SQLStorage;

public class SQLServer extends SQLStorage {

  @Override
  public String getDriver() {
    return "com.microsoft.sqlserver.jdbc.SQLServerDriver";
  }

  @Override
  public Boolean dataSource() {
    return true;
  }

  @Override
  public String dataSourceURL() {
    return "com.microsoft.sqlserver.jdbc.SQLServerDataSource";
  }

  @Override
  public String getURL(String file, String host, int port, String database) {
    return "jdbc:sqlserver://" + host + ":" + port + ";databaseName=" + database + ";";
  }
}
