package dao;

import java.sql.Connection;
import config.IDBConfig;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MSSQLConnection {

    /**
     *
     * get Conection Database
     *
     *
     * @return con
     */
    public static Connection getConection() {
        Connection con = null;
        String connectionUrl = "jdbc:sqlserver://" + IDBConfig.HOSTNAME
                + ":" + IDBConfig.PORT + ";"
                + "databaseName=" + IDBConfig.DBNAME + ";"
                + "integratedSecurity=" + IDBConfig.INTEGRATED_SECURITY + ";";

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch (ClassNotFoundException ex) {
            System.err.println("Where is your MySQL JDBC Driver?");
            return con;
        }
        System.out.println("MySQL JDBC Driver Registered!");

        try {
            con = DriverManager.getConnection(connectionUrl, IDBConfig.USERNAME, IDBConfig.PASSWORD);
        } catch (SQLException ex) {
            System.err.println("Connection Failed! Check output console");
            return con;
        }
        return con;
    }

    /**
    * Close connection to MSSQL Server
    * @param connection
    */
    public static void closeConnection(Connection connection){
        if(connection != null){
            try {
                connection.close();
            } catch (SQLException ex) {
                System.out.println("Close connection failed!");
            }
        }
    }

    /**
     *
     * close connection
     *
     * @param con
     */
    public static void closePrepareStatement(PreparedStatement ps) {
        if (ps != null) {
            try {
                ps.close();
            } catch (SQLException e) {
                System.out.println("Close PreparedStatement failed!");
            }
        }
    }
    /**
     *
     * close connection
     *
     * @param rs
     */
    public static void closeResultSet(ResultSet rs) {
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                System.out.println("Close ResultSet failed!");
            }
        }
    }
}
