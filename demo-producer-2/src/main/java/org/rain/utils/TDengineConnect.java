package org.rain.utils;

import com.taosdata.jdbc.TSDBDriver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * @author ZhangYu
 * @date 2022/9/6
 */
public class TDengineConnect {

//    public static void main(String[] args) throws SQLException {
//        String jdbcUrl = "jdbc:TAOS-RS://192168.15.152:6030?user=root&password=taosdata";
//        Properties connProps = new Properties();
//        connProps.setProperty(TSDBDriver.PROPERTY_KEY_BATCH_LOAD, "true");
//        Connection conn = DriverManager.getConnection(jdbcUrl, connProps);
//        System.out.println("Connected");
//        conn.close();
//    }
}
