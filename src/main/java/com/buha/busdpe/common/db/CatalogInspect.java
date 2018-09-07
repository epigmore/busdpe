package com.buha.busdpe.common.db;

/**
 * Created by moon on 2018/8/17.
 */
public interface CatalogInspect {

    public String getDbName();
    public DbType getDbType();
    public String getDbUrl();
    public String getDbUsername();
    public String getDbPassword();

}
