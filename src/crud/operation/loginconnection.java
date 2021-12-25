package crud.operation;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
 
public class loginconnection {
    
    public static Connection connection(){
    Connection con=null; 
         try{
           Class.forName("com.mysql.cj.jdbc.Driver"); 
         con=DriverManager.getConnection("jdbc:mysql://localhost:3306/umesh","root","");
              //JOptionPane.showMessageDialog(null, "connection is created in connectition class ");

                }
    catch(Exception e)
    {
    
            Logger.getLogger(" Get Connection -> " + loginconnection.class.getName()).log(Level.SEVERE, null, e);    }
    
        return con;
    }
    
}
