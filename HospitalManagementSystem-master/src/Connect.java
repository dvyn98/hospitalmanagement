/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Raj
 */
import java.sql.*;
import javax.swing.*;
public class Connect {
     Connection con=null;
   
        public static Connection ConnectDB(){
             try{
           
          Class.forName("com.mysql.cj.jdbc.Driver");
         //Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hms_db","root","mysql");
         Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hms_db","root","divyanshu"); 
         return con;
            
        }catch(ClassNotFoundException | SQLException e)
            {
            JOptionPane.showMessageDialog(null, e);
            return null;
    }      
}
}
