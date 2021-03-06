/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tampilan;

import DB.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import MODEL.MODEL;

/**
 *
 * @author hp proBook
 */
public class Delete extends javax.swing.JFrame {
static Connection conn;
    static Statement st;
    static String sql;
    PreparedStatement ps;
    static ResultSet rs;
    MODEL MODEL;
    /**
     * Creates new form Delete
     */
    public Delete() {
        conn = new DBConnection().setConnection();

        initComponents();
        tampilData();
        
    }
    public void tabel(){
   DefaultTableModel dtm = (DefaultTableModel) tabel.getModel();
 
            conn = new DBConnection().setConnection();
            try{
                sql = "SELECT *FROM pembelian";
            
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while(rs.next()){
                dtm.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4)});
                  
            }
            }catch(Exception e){
                System.out.println("Error "+e.getMessage());
            }
    }
public void tampilData(){
         ArrayList<MODEL> daftar = (ArrayList<MODEL>) shakespare();
         DefaultTableModel model = (DefaultTableModel) tabel.getModel();
         Object[] row = new Object[5];
         
          for(int i=0; i<daftar.size(); i++){
             row[0] = false;
             row[1] = daftar.get(i).getBook_ID();
             row[2] = daftar.get(i).getBook_Name();
             row[3] = daftar.get(i).getPrice();
             row[4] = daftar.get(i).getStock();
             
         
             model.addRow(row);
         }
      }
      
    public ArrayList<MODEL> shakespare(){
          ArrayList<MODEL> shakespare = new ArrayList<>();
          
            try{
            sql = "SELECT * FROM databuku ORDER BY BOOK_ID DESC";        
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            
             while(rs.next()){
                    MODEL = new MODEL(rs.getInt("Book_ID"),
                            rs.getString("Book_Name"), 
                            rs.getInt("Price"),
                            rs.getInt("Stock"));
                    shakespare.add(MODEL);
                }
                
            }catch(Exception e){
                System.out.println("Error" + e.getMessage());
            }
            
            return shakespare;
          
      }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        backgroundDelete1 = new Background.BackgroundDelete();
        backgroundDelete2 = new Background.BackgroundDelete();
        backgroundDelete3 = new Background.BackgroundDelete();
        backgroundDelete4 = new Background.BackgroundDelete();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfBookId = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 0));
        jLabel1.setText("DELETE RECORD");

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 0, 0));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/icons8-registration-32.png"))); // NOI18N
        jLabel2.setText("Book ID");

        tfBookId.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        tfBookId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfBookIdActionPerformed(evt);
            }
        });

        tabel.setBackground(new java.awt.Color(255, 153, 102));
        tabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", "Book ID", "Book Name", "Price", "Stock"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Boolean.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabel);
        tabel.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        btnBack.setBackground(new java.awt.Color(173, 148, 148));
        btnBack.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnBack.setText("BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(220, 71, 71));
        btnDelete.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnDelete.setText("DELETE");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout backgroundDelete4Layout = new javax.swing.GroupLayout(backgroundDelete4);
        backgroundDelete4.setLayout(backgroundDelete4Layout);
        backgroundDelete4Layout.setHorizontalGroup(
            backgroundDelete4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundDelete4Layout.createSequentialGroup()
                .addGroup(backgroundDelete4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundDelete4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(backgroundDelete4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(backgroundDelete4Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfBookId))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(backgroundDelete4Layout.createSequentialGroup()
                                .addGap(93, 93, 93)
                                .addComponent(jLabel1))))
                    .addGroup(backgroundDelete4Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(195, Short.MAX_VALUE))
        );
        backgroundDelete4Layout.setVerticalGroup(
            backgroundDelete4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundDelete4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addGroup(backgroundDelete4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfBookId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(backgroundDelete4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(btnDelete))
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout backgroundDelete3Layout = new javax.swing.GroupLayout(backgroundDelete3);
        backgroundDelete3.setLayout(backgroundDelete3Layout);
        backgroundDelete3Layout.setHorizontalGroup(
            backgroundDelete3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundDelete4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        backgroundDelete3Layout.setVerticalGroup(
            backgroundDelete3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundDelete3Layout.createSequentialGroup()
                .addComponent(backgroundDelete4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout backgroundDelete2Layout = new javax.swing.GroupLayout(backgroundDelete2);
        backgroundDelete2.setLayout(backgroundDelete2Layout);
        backgroundDelete2Layout.setHorizontalGroup(
            backgroundDelete2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundDelete3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        backgroundDelete2Layout.setVerticalGroup(
            backgroundDelete2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundDelete2Layout.createSequentialGroup()
                .addComponent(backgroundDelete3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout backgroundDelete1Layout = new javax.swing.GroupLayout(backgroundDelete1);
        backgroundDelete1.setLayout(backgroundDelete1Layout);
        backgroundDelete1Layout.setHorizontalGroup(
            backgroundDelete1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundDelete2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        backgroundDelete1Layout.setVerticalGroup(
            backgroundDelete1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundDelete1Layout.createSequentialGroup()
                .addComponent(backgroundDelete2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundDelete1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(backgroundDelete1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfBookIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfBookIdActionPerformed
 DefaultTableModel Table = new DefaultTableModel();
    Table.addColumn("Book_ID");
    Table.addColumn("Book_Name ");
    Table.addColumn("Price ");
    Table.addColumn("Stock ");
        try{                
            sql="select * from databuku where Book_ID='"+tfBookId.getText()+"'";

             st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
            Table.addRow(new Object[]{
            rs.getString(1),
            rs.getString(2),
            rs.getString(3),
            rs.getString(4),
            });
            }
            tabel.setModel(Table);

                }catch (Exception e){
            JOptionPane.showMessageDialog(null,"Data yang Anda cari Tidak dapat Ditemukan");
            }
       
    }//GEN-LAST:event_tfBookIdActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
 int n = JOptionPane.showConfirmDialog(null, "Ingin menghapus data?",
                                                     "Yakin ingin menghapus data?",
                                                     JOptionPane.YES_NO_CANCEL_OPTION,
                                                     JOptionPane.QUESTION_MESSAGE,null);
            if (n == 0)
        {
                    for (int i = 0; i < tabel.getRowCount(); i++){
                        Boolean chkDel = Boolean.valueOf(tabel.getValueAt(i,0).toString());
                    if (chkDel)
                    {
                        String Book_ID = tabel.getValueAt(i, 1).toString();
                        hapusData(Book_ID);            
                    }        
              }
                    JOptionPane.showMessageDialog(null, "Data berhasil dihapus");
                    bersihTabel();
                    tampilData();
                    
    }       }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        Adminonly Ao = new Adminonly();
        Ao.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnBackActionPerformed
private void hapusData(String Book_ID){
    
        try{
            st = conn.createStatement();
            sql = "DELETE FROM databuku WHERE "+"Book_ID ="+Book_ID;
            st.execute(sql);
    } catch (Exception e){
        JOptionPane.showConfirmDialog(null, e.getMessage());
        e.printStackTrace();
        
    }
}
    public void bersihTabel(){
    DefaultTableModel model = (DefaultTableModel) tabel.getModel();
    model.setRowCount(0);
}
    
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
            java.util.logging.Logger.getLogger(Delete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Delete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Delete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Delete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Delete().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Background.BackgroundDelete backgroundDelete1;
    private Background.BackgroundDelete backgroundDelete2;
    private Background.BackgroundDelete backgroundDelete3;
    private Background.BackgroundDelete backgroundDelete4;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabel;
    public static javax.swing.JTextField tfBookId;
    // End of variables declaration//GEN-END:variables
}
