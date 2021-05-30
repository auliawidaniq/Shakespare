/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tampilan;

import DB.DBConnection;
import MODEL.Pembelian;
import static Tampilan.LihatData.sql;
import java.awt.Checkbox;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.ComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.ListSelectionModel;
import javax.swing.table.TableModel;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Victoria
 */
public class LihatData extends javax.swing.JFrame {
    static Connection conn;
    static Statement st;
    static String sql;
    PreparedStatement ps;
    static ResultSet rs;
    Pembelian pembelian;
    /**
     * Creates new form LihatData
     */
    public LihatData() {
        conn = new DBConnection().setConnection();
        initComponents();
        tampilData();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backgroundSearch8 = new Background.BackgroundSearch();
        jLabel1 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        btnCetak = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblData = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 0));
        jLabel1.setText("Data Pembelian");

        btnBack.setBackground(new java.awt.Color(182, 153, 173));
        btnBack.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnBack.setText("BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnCetak.setBackground(new java.awt.Color(182, 153, 173));
        btnCetak.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnCetak.setText("PRINT");
        btnCetak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCetakActionPerformed(evt);
            }
        });

        tblData.setBackground(new java.awt.Color(255, 153, 102));
        tblData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Pembeli", "Book ID", "Book Name", "Total Item", "Price", "Total Payment"
            }
        ));
        jScrollPane1.setViewportView(tblData);

        javax.swing.GroupLayout backgroundSearch8Layout = new javax.swing.GroupLayout(backgroundSearch8);
        backgroundSearch8.setLayout(backgroundSearch8Layout);
        backgroundSearch8Layout.setHorizontalGroup(
            backgroundSearch8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundSearch8Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(btnCetak, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                .addGap(296, 296, 296))
            .addGroup(backgroundSearch8Layout.createSequentialGroup()
                .addGroup(backgroundSearch8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundSearch8Layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(jLabel1))
                    .addGroup(backgroundSearch8Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 553, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        backgroundSearch8Layout.setVerticalGroup(
            backgroundSearch8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundSearch8Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(backgroundSearch8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(btnCetak))
                .addGap(49, 49, 49))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundSearch8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundSearch8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        Adminonly Ao = new Adminonly();
        Ao.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnCetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCetakActionPerformed
        String text;
        int rowsClicked = tblData.getSelectedRow();
        try{
            FileWriter fw = new FileWriter("D:/ShakeSpareNIO/ShakeSpareData.txt");
            fw.write("ID Pembeli"); fw.append(": ");
            fw.write(tblData.getValueAt(rowsClicked, 0).toString());fw.append(", ");
            fw.write("\n");
            fw.write("Book ID"); fw.append(": ");
            fw.write(tblData.getValueAt(rowsClicked, 1).toString());fw.append(", ");
            fw.write("\n");
            fw.write("Book Name"); fw.append(": ");
            fw.write(tblData.getValueAt(rowsClicked, 2).toString());fw.append(", ");
            fw.write("\n");
            fw.write("Total Item"); fw.append(": ");
            fw.write(tblData.getValueAt(rowsClicked, 3).toString());fw.append(", ");
            fw.write("\n");
            fw.write("Price"); fw.append(": ");
            fw.write(tblData.getValueAt(rowsClicked, 4).toString());fw.append(", ");
            fw.write("\n");
            fw.write("TotalPayment"); fw.append(": ");
            fw.write(tblData.getValueAt(rowsClicked, 5).toString());fw.append(". ");
            fw.write("\n");
            
            fw.flush();
            fw.close();
            System.out.println("Tersimpan");
        }catch(IOException e){
            System.out.println(e);
        }
    }//GEN-LAST:event_btnCetakActionPerformed

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
            java.util.logging.Logger.getLogger(LihatData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LihatData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LihatData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LihatData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LihatData().setVisible(true);
            }
        });
    }
    
    
    
    public void tampilData(){
        ArrayList<Pembelian> daftar = daftarPembelian();
        DefaultTableModel model = (DefaultTableModel) tblData.getModel();
        Object[] row = new Object[6];
        
        for(int i=0; i<daftar.size(); i++){
            row[0] = daftar.get(i).getID_User();
            row[1] = daftar.get(i).getBookID();
            row[2] = daftar.get(i).getBookName();
            row[3] = daftar.get(i).getTotal_Item();
            row[4] = daftar.get(i).getPrice();
            row[5] = daftar.get(i).getTotal_Payment();
            model.addRow(row);
        }
    }
    
    public ArrayList<Pembelian> daftarPembelian(){
        ArrayList<Pembelian> daftarPembelian = new ArrayList<>();
        
        try{
            sql = "SELECT * FROM payment ORDER BY Book_Id ASC";
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            
            while(rs.next()){
                pembelian = new Pembelian(rs.getInt("ID_User"),
                        rs.getInt("Book_ID"),
                        rs.getString("Book_Name"),
                        rs.getInt("Total_Item"),
                        rs.getString("Price"),
                        rs.getString("Total_Payment"));
                daftarPembelian.add(pembelian);
            }
        }catch(Exception e){
            System.out.println("Error" + e.getMessage());
        }
        return daftarPembelian;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Background.BackgroundSearch backgroundSearch8;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCetak;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblData;
    // End of variables declaration//GEN-END:variables
}
