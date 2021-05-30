/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tampilan;

import DB.DBConnection;

import Tampilan.Adminonly;
import Tampilan.Menu;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import org.eclipse.persistence.internal.oxm.mappings.Login;

public class Loginuser implements Login2{
    Connection conn;
    PreparedStatement ps;
    ResultSet rs;
    public boolean stat_log = false;
    private String Username;
    private String Password;
    private String sql;

    public Loginuser() {
        conn = new DBConnection().setConnection();
    }
    
    public boolean getStatusLogin() {
        return stat_log;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
    
    public static void main(String[] args) {
      
    }

    @Override
    public void cek1(String uname, String pass) {
     
        Loginuser LA = new Loginuser();
        try{
            sql = "SELECT * FROM registerdmin WHERE Username = ? AND Password = ? AND Role = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, uname);
            ps.setString(2, pass);
            ps.setString(3, "User");
            rs = ps.executeQuery();
            if(rs.next()){
                this.stat_log = true;
                JOptionPane.showMessageDialog(null, "Login Success");
                Menu m = new Menu();
                m.setVisible(true);
            }else{
                JOptionPane.showMessageDialog(null, "Login Fail!\nPlease check again your username or password.");
               LA.setVisible(true);
                
            }
        }catch(Exception e){
            System.out.println("Error" + e.getMessage());
        }
    }

    private void setVisible(boolean b) {
     
    }

    void cek1(Pattern MyPattern, Pattern MyPattern1) {
       
    }
}