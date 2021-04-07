package com.portalstudy.connection;

import java.sql.*;

public class ConnectionFactory {

    public static Connection getConnection(){
        String url = "jdbc:mysql://localhost:3306/portal_study";
        String user = "root";
        String password = "";

        try {
            return DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void close(Connection connection){
        try{
            if(connection != null){
                connection.close();
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public static void close(Connection connection, PreparedStatement pst){
        close(connection);
        try{
            if(pst != null){
                pst.close();
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public static void close(Connection connection, PreparedStatement pst, ResultSet rs) {
        close(connection, pst);

        try {
            if (rs != null) {
                rs.close();
            }
        } catch (SQLException var4) {
            var4.printStackTrace();
        }

    }
}

