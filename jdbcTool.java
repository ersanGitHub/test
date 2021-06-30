package com.practice.jdbc.userManager.utils;

import java.sql.*;


public class jdbcTool {
    public static void main(String [] args){ }
    /**
     * 工具类中的方法都是私有的，
     * 因为工具类中的方法都是静态的，不需要new一个对象，直接采用类名去钓友
     *
     */
    private  jdbcTool(){}
    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection()throws  SQLException{

        return DriverManager.getConnection("jdbc:mysql://localhost:3306/test_bd","root","ROOT");
    }


    public static  void close(Connection conn , Statement ps , ResultSet rs ){
        if (rs != null ){ try {rs.close();}catch (SQLException e ){ e.printStackTrace();}}
        if (ps != null ){ try {ps.close();}catch (SQLException e ){ e.printStackTrace();}}
        if (conn != null ){ try {conn.close();}catch (SQLException e ){ e.printStackTrace();}}
    }
    public static  void close(Connection conn , Statement ps ){

        if (ps != null ){ try {ps.close();}catch (SQLException e ){ e.printStackTrace();}}
        if (conn != null ){ try {conn.close();}catch (SQLException e ){ e.printStackTrace();}}
    }



}

