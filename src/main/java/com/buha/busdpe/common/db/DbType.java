package com.buha.busdpe.common.db;

public enum  DbType {

    ORACLE("oracle","oracle.jdbc.driver.OracleDriver"),MYSQL("mysql","com.mysql.jdbc.Driver"),MSSQL("mssql","com.microsoft.sqlserver.jdbc.SQLServerDriver");

    private String name;
    private String className;

    private DbType(String name,String className)

    {
        this.name=name;
        this.className=className;
    }

    public String GetClassName()
    {
        return className;
    }
    public String GetName()
    {
        return name;
    }
}
