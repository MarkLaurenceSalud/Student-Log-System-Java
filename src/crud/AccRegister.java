/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author qr_monitor
 */
public class AccRegister extends javax.swing.JFrame {
Connection conn;
PreparedStatement ps;
ResultSet rs;
    /**
     * Creates new form AccRegister
     */
    public AccRegister() {
        initComponents();
    }public AccRegister(String msg){
        initComponents();
        lblRole.setText(msg);
        txtAccId.setVisible(false);
        load_acc_info();
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
        btnStudReg = new javax.swing.JButton();
        btnAccReg = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnProceed = new javax.swing.JButton();
        cmbRole = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtUname = new javax.swing.JTextField();
        txtPass = new javax.swing.JTextField();
        txtNum = new javax.swing.JTextField();
        btnHome = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        lblRole = new javax.swing.JLabel();
        btnLogs = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAcc = new javax.swing.JTable();
        btnDelete = new javax.swing.JButton();
        txtAccId = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 1366, 760));

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setMinimumSize(new java.awt.Dimension(596, 300));
        jPanel1.setPreferredSize(new java.awt.Dimension(1366, 760));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnStudReg.setBackground(new java.awt.Color(204, 255, 204));
        btnStudReg.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnStudReg.setText("Student Register");
        btnStudReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStudRegActionPerformed(evt);
            }
        });
        jPanel1.add(btnStudReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 170, -1));

        btnAccReg.setBackground(new java.awt.Color(51, 255, 102));
        btnAccReg.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnAccReg.setText("Account Register");
        btnAccReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAccRegActionPerformed(evt);
            }
        });
        jPanel1.add(btnAccReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 170, -1));

        btnClear.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        jPanel1.add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 600, -1, 30));

        btnProceed.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnProceed.setText("Proceed");
        btnProceed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProceedActionPerformed(evt);
            }
        });
        jPanel1.add(btnProceed, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 600, -1, 30));

        cmbRole.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cmbRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "------------", "Professor", "Admin" }));
        jPanel1.add(cmbRole, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 560, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel2.setText("Full Name:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel3.setText("Username:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel4.setText("Password:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel5.setText("Contact Number:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 490, -1, -1));

        txtName.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jPanel1.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 280, 30));
        jPanel1.add(txtUname, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 280, 30));
        jPanel1.add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, 280, 30));

        txtNum.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNumKeyPressed(evt);
            }
        });
        jPanel1.add(txtNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 520, 280, 30));

        btnHome.setBackground(new java.awt.Color(204, 255, 204));
        btnHome.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnHome.setText("Home");
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });
        jPanel1.add(btnHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 170, -1));

        btnLogout.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 10, -1, -1));
        jPanel1.add(lblRole, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 10, 70, 20));

        btnLogs.setBackground(new java.awt.Color(204, 255, 204));
        btnLogs.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnLogs.setText("Logs");
        btnLogs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogsActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogs, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 170, -1));

        tblAcc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Account ID", "Role", "Name", "Username", "Password", "Contact Number"
            }
        ));
        tblAcc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblAccMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblAcc);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 30, 860, 640));

        btnDelete.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel1.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 600, -1, -1));
        jPanel1.add(txtAccId, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, 70, -1));

        jButton2.setBackground(new java.awt.Color(204, 255, 204));
        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton2.setText("Create Barcode");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 170, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        txtName.setText("");
        txtUname.setText("");
        txtPass.setText("");
        txtNum.setText("");
        txtName.setEnabled(true);
        txtAccId.setText("");
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnProceedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProceedActionPerformed
      
       
    String name = txtName.getText();
    String uname= txtUname.getText();
    String pass = txtPass.getText();
    String num = txtNum.getText();
    String aid = txtAccId.getText();
    String r = cmbRole.getSelectedItem().toString();
    

try {
    // Validate input fields
    if (name.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Enter Name!");
        return;
    } else if (uname.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Enter Username!");
        return;
    } else if (pass.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Enter Password!");
        return;
    } else if (num.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Enter Contact Number!");
        return;
    } 

    conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/crudv2_db", "root", "");

    // Check if student ID exists
    ps = conn.prepareStatement("SELECT name FROM account WHERE name = ?");
    ps.setString(1, name);
    rs = ps.executeQuery();

    boolean nameExists = rs.next();

    if (nameExists && aid.isEmpty()) {
        
        JOptionPane.showMessageDialog(this, "Name  already registered");
    } else if (nameExists && !aid.isEmpty()) {
        // Update existing record
        ps = conn.prepareStatement("UPDATE account SET role = ?, username = ?, password = ?, contact_number = ? WHERE name = ?");
        ps.setString(1, r);
        ps.setString(2, uname);
        ps.setString(3, pass);
        ps.setString(4, num);
        ps.setString(5, name);
        

        int rowsUpdated = ps.executeUpdate();
        if (rowsUpdated > 0) {
            DefaultTableModel tbl = (DefaultTableModel) tblAcc.getModel();
            int selectedRow = tblAcc.getSelectedRow();
            if (selectedRow != -1) {
                tbl.setValueAt(r, selectedRow, 1);
                tbl.setValueAt(name, selectedRow, 2);
                tbl.setValueAt(uname, selectedRow, 3);
                tbl.setValueAt(pass, selectedRow, 4);
                tbl.setValueAt(num, selectedRow, 5);
                JOptionPane.showMessageDialog(null, "Data Updated Successfully");
                cmbRole.setSelectedItem("");
        txtName.setText("");
        txtUname.setText("");
        txtPass.setText("");
        txtNum.setText("");
            } else {
                JOptionPane.showMessageDialog(null, "Select a row to update");
            }
        }
    } else {
        // Insert new record
        ps = conn.prepareStatement("INSERT INTO account (role, name, username, password, contact_number) VALUES (?, ?, ?, ?, ?)", Statement.RETURN_GENERATED_KEYS);
        ps.setString(1, r);
        ps.setString(2, name);
        ps.setString(3, uname);
        ps.setString(4, pass);
        ps.setString(5, num);
        ps.executeUpdate();

        ResultSet generatedKeys = ps.getGeneratedKeys();
        int newId = -1;
        if (generatedKeys.next()) {
            newId = generatedKeys.getInt(1);
        }

        DefaultTableModel tbl = (DefaultTableModel) tblAcc.getModel();
        tbl.addRow(new Object[]{newId, r, name, uname, pass, num});

        cmbRole.setSelectedItem("");
        txtName.setText("");
        txtUname.setText("");
        txtPass.setText("");
        txtNum.setText("");

        JOptionPane.showMessageDialog(null, "Data Inserted Successfully");
    }
} catch (SQLException ex) {
    Logger.getLogger(StudentRegister.class.getName()).log(Level.SEVERE, null, ex);
} finally {
    // Close resources
    try {
        if (rs != null) rs.close();
        if (ps != null) ps.close();
        if (conn != null) conn.close();
    } catch (SQLException e) {
        e.printStackTrace();
    }
} 
    }//GEN-LAST:event_btnProceedActionPerformed

    private void btnStudRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStudRegActionPerformed
        // TODO add your handling code here:
        /*StudentRegister sr = new StudentRegister();
        sr.show();
        dispose();*/
        String msg=lblRole.getText();
        
        new StudentRegister(msg).setVisible(true);
            setVisible(false);
    }//GEN-LAST:event_btnStudRegActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        // TODO add your handling code here:
        /*Homepage hp = new Homepage();
        hp.show();
        dispose();*/
        String msg=lblRole.getText();
        
        new Homepage(msg).setVisible(true);
            setVisible(false);
    }//GEN-LAST:event_btnHomeActionPerformed

    private void txtNumKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumKeyPressed
        // TODO add your handling code here:
         char c = evt.getKeyChar();
        if (Character.isLetter(c)){
            txtNum.setEditable(false);
        }else if (Character.isLetter(c)){
            txtNum.setEditable(false);
        }else {
            txtNum.setEditable(true);
        }
    }//GEN-LAST:event_txtNumKeyPressed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        Login l = new Login();
        l.show();
        dispose();
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnAccRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAccRegActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAccRegActionPerformed

    private void btnLogsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogsActionPerformed
        // TODO add your handling code here:
        String msg=lblRole.getText();
        
        new logs(msg).setVisible(true);
            setVisible(false);
    }//GEN-LAST:event_btnLogsActionPerformed

    private void tblAccMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAccMouseClicked
        // TODO add your handling code here:
        int selectedRow = tblAcc.getSelectedRow();
        DefaultTableModel tbl = (DefaultTableModel) tblAcc.getModel();
        txtAccId.setText(tbl.getValueAt(selectedRow, 0).toString());
        cmbRole.setSelectedItem(tbl.getValueAt(selectedRow, 1).toString());
        txtName.setText(tbl.getValueAt(selectedRow, 2).toString());
        txtUname.setText(tbl.getValueAt(selectedRow, 3).toString());
        txtPass.setText(tbl.getValueAt(selectedRow, 4).toString());
        txtNum.setText(tbl.getValueAt(selectedRow, 5).toString());
        txtName.setEnabled(false);
    }//GEN-LAST:event_tblAccMouseClicked

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        txtName.setEnabled(true);
         String name = txtName.getText();
        try {
            // TODO add your handling code here

            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/crudv2_db", "root", "");
            ps=conn.prepareStatement("DELETE FROM account WHERE name=?");

            ps.setString(1,(name));
            ps.executeUpdate();

            DefaultTableModel tbl = (DefaultTableModel) tblAcc.getModel();
            int SelectedRowIndex = tblAcc.getSelectedRow();
            tbl.removeRow(SelectedRowIndex);
            cmbRole.setSelectedItem("");
            txtName.setText("");
            txtUname.setText("");
            txtPass.setText("");
            txtNum.setText("");
            txtAccId.setText("");
            JOptionPane.showMessageDialog(null ,"Data Deleted Succesfully!" );

        } catch (SQLException ex) {
            Logger.getLogger(View.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         String msg=lblRole.getText();
          new Barcode(msg).setVisible(true);
            setVisible(false); 
    }//GEN-LAST:event_jButton2ActionPerformed
    private void load_acc_info(){
        try {
        conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/crudv2_db", "root", "");     
        ps=conn.prepareStatement("SELECT * FROM account");
        
        
         rs=ps.executeQuery();
         rs=ps.executeQuery();
         while (rs.next()){
             String aid = rs.getString("account_id");
             String role = rs.getString("role");
             String name2 = rs.getString("name");
             String username = rs.getString("username");
             String pass = rs.getString("password");
             String num2 = rs.getString("contact_number");
             
             String tbData[] = {aid,role,name2,username,pass,num2};
             DefaultTableModel tbl2 = (DefaultTableModel) tblAcc.getModel();
             
             tbl2.addRow(tbData);
        
             
         
       }
         
    } catch (SQLException ex) {
        Logger.getLogger(View.class.getName()).log(Level.SEVERE, null, ex);
        
    }
     
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
            java.util.logging.Logger.getLogger(AccRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AccRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AccRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AccRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AccRegister().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAccReg;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnLogs;
    private javax.swing.JButton btnProceed;
    private javax.swing.JButton btnStudReg;
    private javax.swing.JComboBox<String> cmbRole;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblRole;
    private javax.swing.JTable tblAcc;
    private javax.swing.JTextField txtAccId;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtNum;
    private javax.swing.JTextField txtPass;
    private javax.swing.JTextField txtUname;
    // End of variables declaration//GEN-END:variables
}
