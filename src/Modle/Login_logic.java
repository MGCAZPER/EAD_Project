
package Modle;
import Modle.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import View.Dashboard;

public class Login_logic {
    public String Login(String username,String password){
        if (username == null||username.trim().equals("") || password == null|| password.trim().equals("")){
            return "EF";
        }
         String sql = "SELECT * FROM login WHERE username = ? AND password = ?";
         try{
            Connection con = (Connection) DBConnection.getInstance();
            PreparedStatement pst = con.prepareStatement(sql);

            pst.setString(1, username);
            pst.setString(2, password);

            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                
               Dashboard dash=new Dashboard();
                       dash.setVisible(true);
               return "LS";
            } else {
                return "LF";
            }
         }catch(Exception e){
             return "DE";
         }
    }
}
