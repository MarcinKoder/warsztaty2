package pl.zadania;

import java.sql.*;

public class zad1 {
   static Connection conn = null;
   static Statement statement = null;
static String createDatabase = "create database if not exists workshop ; ";
final static String DATABASE_URL = "jdbc:mysql://localhost:3306/";
    private static void createDatabse(String createDatabase) throws SQLException{

        statement = conn.createStatement();
        statement.executeUpdate(createDatabase);
        System.out.println("workshop has successfully been created");
    }

    public static void main(String[] args) {

        try {conn = DriverManager.getConnection( DATABASE_URL,
                "root","coderslab");

            createDatabse(createDatabase);

        }catch (SQLException e) {
            e.printStackTrace();
        } finally {
              if  (conn!=null){
            try{ conn.close();}
            catch (SQLException ex){
                ex.printStackTrace();}
            }
            System.out.println("***************************************");
        }
    }
    public static Connection getConnection()throws SQLException{

        System.out.println(getConnection());

        return getConnection();
    }

}
