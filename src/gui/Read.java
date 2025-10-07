package gui;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Read {
    public static ResultSet read(Connection conn){
        try {
            PreparedStatement stm1 = conn.prepareStatement("SELECT * FROM images");
            ResultSet res=stm1.executeQuery();
            return res;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }



    }
}
