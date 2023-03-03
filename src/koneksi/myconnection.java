package koneksi;

import java.sql.Connection;
import java.sql.*;
import javax.swing.JOptionPane;

public class myconnection {
    public Statement getConnection() throws ClassNotFoundException{
        Statement stat = null;
        try {
            String driver = "com.mysql.jdbc.Driver";
            Class.forName(driver);
            
            String db = "db_bengkelbaru";
            String sv = "jdbc:mysql://localhost:3306/"+db;
            
            Connection cn = DriverManager.getConnection(sv, "root", "");
            Statement st = cn.createStatement();
            return st;
        }
        
        catch (SQLException e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "Koneksi Mysql Error..");
            return null;
        }
        
        catch (Exception e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "Koneksi Mysql Error..");
            return null;
      }
    }  
  }
    

