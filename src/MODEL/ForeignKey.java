/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODEL;

import DB.DBConnection;
import java.sql.*;
public class ForeignKey{
     static Connection conn;
    static Statement st;
    static String sql;

    public static void main(String[] args) throws SQLException {
        conn = new DBConnection().setConnection();
        try {
            sql = "ALTER TABLE pembelian ADD FOREIGN KEY (User_ID) references registcustomer (User_ID)";
        } catch (Exception e) {
            System.out.println("Error" + e.getMessage());

        }
        st = conn.createStatement();
        st.execute(sql);
    }
}