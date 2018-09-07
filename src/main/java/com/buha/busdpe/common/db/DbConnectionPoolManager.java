package com.buha.busdpe.common.db;

import com.alibaba.druid.pool.DruidDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by moon on 2018/8/17.
 */
public class DbConnectionPoolManager {

    private static ConcurrentHashMap<String,DataSource> dsMap = new ConcurrentHashMap<>();

    public static DbConnectionPoolManager getInstance(){
        return dbConnectionPoolManager;
    }
    private static final DbConnectionPoolManager dbConnectionPoolManager = new DbConnectionPoolManager();
    private DbConnectionPoolManager(){

    }

    /**
     * 根据dbName获取数据库连接
     * @param dbInfo
     * @return
     * @throws SQLException
     */
    public Connection getConnection(CatalogInspect dbInfo) throws SQLException{

        DataSource ds = dsMap.get(dbInfo.getDbName());
        if (ds==null){
            ds = createDs(dbInfo);
            dsMap.put(dbInfo.getDbName(),ds);
        }

        Connection conn = ds.getConnection();
        return conn;
    }

    /**
     * 创建数据源
     * @param dbInfo
     * @return
     */
    private DataSource createDs(CatalogInspect dbInfo){


        DruidDataSource ds = new DruidDataSource();
        ds.setUsername(dbInfo.getDbUsername());
        ds.setPassword(dbInfo.getDbPassword());
        ds.setUrl(dbInfo.getDbUrl());
        if(dbInfo.getDbType().equals("oracle")){
            ds.setDriverClassName(null);
        }else if(dbInfo.getDbType().equals("mysql")){
            ds.setDriverClassName("com.mysql.jdbc.Driver");
        }else if(dbInfo.getDbType().equals("mssql")){
            ds.setDriverClassName(null);
        }

        //****
        //...配置连接属性

        return ds;
    }


}
