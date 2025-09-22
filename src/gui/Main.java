package gui;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main{
    public  static void main(String[] args){
        //Database connectivity
         String url="jdbc:postgresql://localhost:5432/BestImages";
         String username="postgres";
         String password="Uhirwashami54.";
         try {
             Connection db = DriverManager.getConnection(url, username, password);
         }
         catch(SQLException e){
             System.out.println("Failing connnecting to database");
             e.printStackTrace();

         }
        new MyFrame();





    }
}
