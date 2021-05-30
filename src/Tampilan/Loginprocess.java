/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tampilan;

import DB.DBConnection;

import Tampilan.Adminonly;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class Loginprocess implements Login1{
    Connection conn;
    PreparedStatement ps;
    ResultSet rs;
    public boolean stat_log1 = false;
    private String Username;
    private String Password;
    private String sql1;

    public Loginprocess() {
        conn = new DBConnection().setConnection();
    }
    
    public boolean getStatusLogin() {
        return stat_log1;
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
    public void cek(String U, String P) {
     
        LoginAdmin LA = new LoginAdmin();
        try{
            sql1 = "SELECT * FROM registeradmin WHERE Username = ? AND Password = ? AND Role = ?";
            ps = conn.prepareStatement(sql1);
            ps.setString(1, U);
            ps.setString(2, P);
            ps.setString(3, "Admin");
            rs = ps.executeQuery();
            if(rs.next()){
                this.stat_log1 = true;
                JOptionPane.showMessageDialog(null, "Login Success");
                Adminonly AO = new Adminonly();
                AO.setVisible(true);
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

    void cek(Pattern MyPattern, Pattern MyPattern1) {
      
}
}