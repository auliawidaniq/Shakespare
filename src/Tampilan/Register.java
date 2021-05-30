/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tampilan;

import DB.DBConnection;
import static Tampilan.Payment.conn;
import static Tampilan.Payment.sql;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author hp proBook
 */
public class Register extends javax.swing.JFrame {
    static Connection conn;
    static PreparedStatement ps;
    static ResultSet rs;
    static String sql;
    
     String ID_User;
     String Fullname;
     String Email;
     String Username;
     String Password;
    private boolean user;
    
    
    public Register() {
       conn = new DBConnection().setConnection(); 
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backgroundRegister1 = new Background.BackgroundRegister();
        backgroundRegister2 = new Background.BackgroundRegister();
        jPanel1 = new javax.swing.JPanel();
        backgroundRegister3 = new Background.BackgroundRegister();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tfUserId = new javax.swing.JTextField();
        tfFullname = new javax.swing.JTextField();
        tfEmail = new javax.swing.JTextField();
        tfUsername = new javax.swing.JTextField();
        btnStarted = new javax.swing.JButton();
        persetujuan = new javax.swing.JCheckBox();
        tfPassword = new javax.swing.JPasswordField();
        back = new javax.swing.JButton();

        javax.swing.GroupLayout backgroundRegister1Layout = new javax.swing.GroupLayout(backgroundRegister1);
        backgroundRegister1.setLayout(backgroundRegister1Layout);
        backgroundRegister1Layout.setHorizontalGroup(
            backgroundRegister1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        backgroundRegister1Layout.setVerticalGroup(
            backgroundRegister1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout backgroundRegister2Layout = new javax.swing.GroupLayout(backgroundRegister2);
        backgroundRegister2.setLayout(backgroundRegister2Layout);
        backgroundRegister2Layout.setHorizontalGroup(
            backgroundRegister2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        backgroundRegister2Layout.setVerticalGroup(
            backgroundRegister2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 0, 0));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/icons8-registration-32.png"))); // NOI18N
        jLabel3.setText("ID_User");

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 0, 0));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/icons8-autograph-filled-24.png"))); // NOI18N
        jLabel2.setText("FullName");

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 0, 0));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/icons8-secured-letter-filled-24.png"))); // NOI18N
        jLabel5.setText("Email");

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 0, 0));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/icons8-user-male-24.png"))); // NOI18N
        jLabel6.setText("Username");

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 0, 0));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/icons8-key-24.png"))); // NOI18N
        jLabel7.setText("Password");

        tfFullname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfFullnameActionPerformed(evt);
            }
        });

        btnStarted.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        btnStarted.setText("Get Started");
        btnStarted.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartedActionPerformed(evt);
            }
        });

        persetujuan.setBackground(new java.awt.Color(213, 153, 96));
        persetujuan.setText("i agree all term of service");
        persetujuan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                persetujuanActionPerformed(evt);
            }
        });

        back.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout backgroundRegister3Layout = new javax.swing.GroupLayout(backgroundRegister3);
        backgroundRegister3.setLayout(backgroundRegister3Layout);
        backgroundRegister3Layout.setHorizontalGroup(
            backgroundRegister3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundRegister3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(backgroundRegister3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundRegister3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(backgroundRegister3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tfFullname)
                    .addComponent(tfEmail)
                    .addComponent(tfUsername)
                    .addComponent(tfUserId)
                    .addComponent(persetujuan, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                    .addComponent(tfPassword)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundRegister3Layout.createSequentialGroup()
                        .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnStarted)
                        .addGap(9, 9, 9)))
                .addContainerGap(336, Short.MAX_VALUE))
        );
        backgroundRegister3Layout.setVerticalGroup(
            backgroundRegister3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundRegister3Layout.createSequentialGroup()
                .addContainerGap(80, Short.MAX_VALUE)
                .addGroup(backgroundRegister3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfUserId, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(26, 26, 26)
                .addGroup(backgroundRegister3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfFullname, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(35, 35, 35)
                .addGroup(backgroundRegister3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(33, 33, 33)
                .addGroup(backgroundRegister3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tfUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(backgroundRegister3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(tfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(persetujuan)
                .addGap(26, 26, 26)
                .addGroup(backgroundRegister3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnStarted)
                    .addComponent(back))
                .addGap(88, 88, 88))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundRegister3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(backgroundRegister3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfFullnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfFullnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfFullnameActionPerformed

    private void btnStartedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartedActionPerformed
   getStarted();
    }//GEN-LAST:event_btnStartedActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
         Adminonly ao = new Adminonly();
        ao.setVisible(true);
    }//GEN-LAST:event_backActionPerformed

    private void persetujuanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_persetujuanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_persetujuanActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private Background.BackgroundRegister backgroundRegister1;
    private Background.BackgroundRegister backgroundRegister2;
    private Background.BackgroundRegister backgroundRegister3;
    private javax.swing.JButton btnStarted;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JCheckBox persetujuan;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfFullname;
    private javax.swing.JPasswordField tfPassword;
    private javax.swing.JTextField tfUserId;
    private javax.swing.JTextField tfUsername;
    // End of variables declaration//GEN-END:variables

     private void getStarted() {
   ID_User = tfUserId.getText();
    Fullname = tfFullname.getText();
    Email = tfEmail.getText();
    Username = tfUsername.getText();
    Password = tfPassword.getText();
    if( persetujuan.isSelected()==true)
        {
            Register B = new Register();
            B.method(ID_User,Fullname,Email,Username,Password);
            this.dispose();
            B.setVisible(true);
             save();
        }
        else
    {
        JOptionPane.showMessageDialog(null,"Checklist Agreemen"
                + " First","Warning",JOptionPane.WARNING_MESSAGE);
    }
            
                          }
          private void save() {
        getField();
        int iD_User = Integer.parseInt(tfUserId.getText());
        String fullname = tfFullname.getText();
        String email = tfEmail.getText();
        String username = tfUsername.getText();
        String password = tfPassword.getText();
        try{
                sql = "INSERT INTO registeradmin VALUES (?, ?, ?, ?, ?)";
                ps = conn.prepareStatement(sql);
                ps.setInt(1, iD_User);
                ps.setString(2, fullname);
                ps.setString(3, email);
                ps.setString(4, username);
                ps.setString(5, password);
               
               
                int rt = ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Data berhasil ditambahkan!"
                        ,"informasi", JOptionPane.INFORMATION_MESSAGE);
        }catch(Exception e){
            System.out.println("Error"+e.getMessage());
                Awal a = new Awal();
                    a.setVisible(true);
                    dispose();
                  
            JOptionPane.showMessageDialog(null, "Error"+e.getMessage());
            Register r = new Register();
            r.setVisible(true);
            dispose();
                    
        }   }
     private void getField() {
        
        ID_User = tfUserId.getText();
        Fullname = tfFullname.getText();
        Email = tfEmail.getText();
        Username = tfUsername.getText();
        Password = tfPassword.getText();
        
     }

    private void method(String ID_User, String Fullname, String Email, String Username, String Password) {
       
    }
          
}