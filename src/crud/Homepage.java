/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.ImageIcon;
import javax.swing.JTextField;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author qr_monitor
 */
public class Homepage extends javax.swing.JFrame {
Connection conn;
PreparedStatement ps,ps1;
ResultSet rs;
    /**
     * Creates new form Homepage
     */
    public Homepage() {
        initComponents();
        
        
        
    }public Homepage(String msg){
        initComponents();
        i1.setVisible(false);
        i2.setVisible(false);
        i3.setVisible(false);
        i4.setVisible(false);
        i5.setVisible(false);
        i6.setVisible(false);
        i7.setVisible(false);
        i8.setVisible(false);
        i9.setVisible(false);
        i10.setVisible(false);
        i11.setVisible(false);
        i12.setVisible(false);
        i13.setVisible(false);
        i14.setVisible(false);
        i15.setVisible(false);
        i16.setVisible(false);
        i17.setVisible(false);
        i18.setVisible(false);
        i19.setVisible(false);
        i20.setVisible(false);
        i21.setVisible(false);
        i22.setVisible(false);
        i23.setVisible(false);
        i24.setVisible(false);
        i25.setVisible(false);
        i26.setVisible(false);
        i27.setVisible(false);
        i28.setVisible(false);
        i29.setVisible(false);
        i30.setVisible(false);
        txtAccIdd.setVisible(false);
        lblSeatId.setVisible(false);
        lblRole.setText(msg);
        getSeatPlanId();
        
        
        
        
        try {
        conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/crudv2_db", "root", "");
        ps=conn.prepareStatement("SELECT * FROM seat_plan WHERE seat_plan_id=1");
        
        rs=ps.executeQuery();
      
         while (rs.next()){
             String p1 = rs.getString("pc1_name1");
             String p2 = rs.getString("pc2_name2");
             String p3 = rs.getString("pc3_name3");
             String p4 = rs.getString("pc4_name4");
             String p5 = rs.getString("pc5_name5");
             String p6 = rs.getString("pc6_name6");
             String p7 = rs.getString("pc7_name7");
             String p8 = rs.getString("pc8_name8");
             String p9 = rs.getString("pc9_name9");
             String p10 = rs.getString("pc10_name10");
             String p11 = rs.getString("pc11_name11");
             String p12 = rs.getString("pc12_name12");
             String p13 = rs.getString("pc13_name13");
             String p14 = rs.getString("pc14_name14");
             String p15 = rs.getString("pc15_name15");
             String p16 = rs.getString("pc16_name16");
             String p17 = rs.getString("pc17_name17");
             String p18 = rs.getString("pc18_name18");
             String p19 = rs.getString("pc19_name19");
             String p20 = rs.getString("pc20_name20");
             String p21 = rs.getString("pc21_name21");
             String p22 = rs.getString("pc22_name22");
             String p23 = rs.getString("pc23_name23");
             String p24 = rs.getString("pc24_name24");
             String p25 = rs.getString("pc25_name25");
             String p26 = rs.getString("pc26_name26");
             String p27 = rs.getString("pc27_name27");
             String p28 = rs.getString("pc28_name28");
             String p29 = rs.getString("pc29_name29");
             String p30 = rs.getString("pc30_name30");
            
             txt1.setText(p1);
             txt2.setText(p2);
             txt3.setText(p3);
             txt4.setText(p4);
             txt5.setText(p5);
             txt6.setText(p6);
             txt7.setText(p7);
             txt8.setText(p8);
             txt9.setText(p9);
             txt10.setText(p10);
             txt11.setText(p11);
             txt12.setText(p12);
             txt13.setText(p13);
             txt14.setText(p14);
             txt15.setText(p15);
             txt16.setText(p16);
             txt17.setText(p17);
             txt18.setText(p18);
             txt19.setText(p19);
             txt20.setText(p20);
             txt21.setText(p21);
             txt22.setText(p22);
             txt23.setText(p23);
             txt24.setText(p24);
             txt25.setText(p25);
             txt26.setText(p26);
             txt27.setText(p27);
             txt28.setText(p28);
             txt29.setText(p29);
             txt30.setText(p30);
             
             
         updateColor();
         getDate();
        getTime();
       
         }
         
         
         
         
    } catch (SQLException ex) {
        Logger.getLogger(View.class.getName()).log(Level.SEVERE, null, ex);
        
    }
      
        
    }
    public void getDate(){
        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String dat = sdf.format(d);
        lblDate.setText(dat);
    }
    public void getTime(){
        new Timer(0, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
               Date d = new Date();
                SimpleDateFormat sdf = new SimpleDateFormat("hh-mm-ss");
                String tim = sdf.format(d);
                lblTime.setText(tim);
                
                
            }
        
    
    }).start();
   
    }
    public void getSeatPlanId(){
    try {
        conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/crudv2_db", "root", "");
        ps=conn.prepareStatement("SELECT seat_plan_id FROM seat_plan WHERE account_id=?");
        
        ps.setString(1, txtAccIdd.getText());
         rs=ps.executeQuery();
         while(rs.next()){
             String acc = rs.getString("seat_plan_id");
             lblSeatId.setText(acc);
         }
        
        
    } catch (SQLException ex) {
        Logger.getLogger(Homepage.class.getName()).log(Level.SEVERE, null, ex);
    }
        
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
        lblPassword = new javax.swing.JLabel();
        btnLogout = new javax.swing.JButton();
        lblRole = new javax.swing.JLabel();
        btnLogs = new javax.swing.JButton();
        txtName = new javax.swing.JTextField();
        lblName = new javax.swing.JLabel();
        txtStudId = new javax.swing.JTextField();
        lblStudId = new javax.swing.JLabel();
        txtSid = new javax.swing.JTextField();
        lblSid = new javax.swing.JLabel();
        pnlSeat = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        pc1 = new javax.swing.JLabel();
        txt2 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        pc2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        pc3 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        pc13 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        pc12 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        pc11 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        pc21 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        pc22 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        pc23 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        pc24 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        pc14 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        pc4 = new javax.swing.JLabel();
        jPanel30 = new javax.swing.JPanel();
        pc27 = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        pc26 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        pc25 = new javax.swing.JLabel();
        pnl15 = new javax.swing.JPanel();
        pc15 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        pc16 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        pc6 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        pc5 = new javax.swing.JLabel();
        jPanel23 = new javax.swing.JPanel();
        pc7 = new javax.swing.JLabel();
        jPanel26 = new javax.swing.JPanel();
        pc17 = new javax.swing.JLabel();
        jPanel22 = new javax.swing.JPanel();
        pc8 = new javax.swing.JLabel();
        jPanel24 = new javax.swing.JPanel();
        pc18 = new javax.swing.JLabel();
        jPanel28 = new javax.swing.JPanel();
        pc28 = new javax.swing.JLabel();
        jPanel29 = new javax.swing.JPanel();
        pc30 = new javax.swing.JLabel();
        jPanel31 = new javax.swing.JPanel();
        pc29 = new javax.swing.JLabel();
        jPanel27 = new javax.swing.JPanel();
        pc19 = new javax.swing.JLabel();
        jPanel25 = new javax.swing.JPanel();
        pc20 = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        pc10 = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        pc9 = new javax.swing.JLabel();
        txt1 = new javax.swing.JTextField();
        txt3 = new javax.swing.JTextField();
        txt4 = new javax.swing.JTextField();
        txt8 = new javax.swing.JTextField();
        txt6 = new javax.swing.JTextField();
        txt7 = new javax.swing.JTextField();
        txt5 = new javax.swing.JTextField();
        txt14 = new javax.swing.JTextField();
        txt12 = new javax.swing.JTextField();
        txt13 = new javax.swing.JTextField();
        txt11 = new javax.swing.JTextField();
        txt24 = new javax.swing.JTextField();
        txt22 = new javax.swing.JTextField();
        txt23 = new javax.swing.JTextField();
        txt21 = new javax.swing.JTextField();
        txt18 = new javax.swing.JTextField();
        txt16 = new javax.swing.JTextField();
        txt17 = new javax.swing.JTextField();
        txt15 = new javax.swing.JTextField();
        txt28 = new javax.swing.JTextField();
        txt26 = new javax.swing.JTextField();
        txt27 = new javax.swing.JTextField();
        txt25 = new javax.swing.JTextField();
        txt30 = new javax.swing.JTextField();
        txt29 = new javax.swing.JTextField();
        txt20 = new javax.swing.JTextField();
        txt19 = new javax.swing.JTextField();
        txt10 = new javax.swing.JTextField();
        txt9 = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        i1 = new javax.swing.JLabel();
        i2 = new javax.swing.JLabel();
        i3 = new javax.swing.JLabel();
        i4 = new javax.swing.JLabel();
        i5 = new javax.swing.JLabel();
        i6 = new javax.swing.JLabel();
        i7 = new javax.swing.JLabel();
        i8 = new javax.swing.JLabel();
        i9 = new javax.swing.JLabel();
        i10 = new javax.swing.JLabel();
        i11 = new javax.swing.JLabel();
        i12 = new javax.swing.JLabel();
        i13 = new javax.swing.JLabel();
        i14 = new javax.swing.JLabel();
        i15 = new javax.swing.JLabel();
        i16 = new javax.swing.JLabel();
        i17 = new javax.swing.JLabel();
        i18 = new javax.swing.JLabel();
        i19 = new javax.swing.JLabel();
        i20 = new javax.swing.JLabel();
        i21 = new javax.swing.JLabel();
        i22 = new javax.swing.JLabel();
        i23 = new javax.swing.JLabel();
        i24 = new javax.swing.JLabel();
        i25 = new javax.swing.JLabel();
        i26 = new javax.swing.JLabel();
        i27 = new javax.swing.JLabel();
        i28 = new javax.swing.JLabel();
        i29 = new javax.swing.JLabel();
        i30 = new javax.swing.JLabel();
        txtAccIdd = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        lblTime = new javax.swing.JLabel();
        lblSeatId = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        pic = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 1366, 760));

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setMinimumSize(new java.awt.Dimension(1380, 540));
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

        btnAccReg.setBackground(new java.awt.Color(204, 255, 204));
        btnAccReg.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnAccReg.setText("Account Register");
        btnAccReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAccRegActionPerformed(evt);
            }
        });
        jPanel1.add(btnAccReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 170, -1));

        lblPassword.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(lblPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, -1, -1));

        btnLogout.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 10, -1, -1));
        jPanel1.add(lblRole, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 10, 80, 20));

        btnLogs.setBackground(new java.awt.Color(204, 255, 204));
        btnLogs.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnLogs.setText("Logs");
        btnLogs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogsActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogs, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 170, -1));

        txtName.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtName.setEnabled(false);
        jPanel1.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 170, 200, 30));

        lblName.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblName.setText("Name:");
        jPanel1.add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 170, 130, 30));

        txtStudId.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtStudId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStudIdActionPerformed(evt);
            }
        });
        txtStudId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtStudIdKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtStudIdKeyTyped(evt);
            }
        });
        jPanel1.add(txtStudId, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 130, 200, 30));

        lblStudId.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblStudId.setText("Student ID:");
        jPanel1.add(lblStudId, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 130, 130, 30));

        txtSid.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtSid.setEnabled(false);
        jPanel1.add(txtSid, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 210, 200, 30));

        lblSid.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblSid.setText("SID:");
        jPanel1.add(lblSid, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 210, -1, -1));

        pnlSeat.setBackground(new java.awt.Color(153, 255, 153));
        pnlSeat.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setPreferredSize(new java.awt.Dimension(70, 1000));
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel3MouseClicked(evt);
            }
        });
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setText("jLabel3");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 156, -1, -1));

        pc1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        pc1.setText("PC 1");
        pc1.setOpaque(true);
        jPanel3.add(pc1, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 13, 40, 23));

        pnlSeat.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 90, 50));

        txt2.setEditable(false);
        txt2.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        txt2.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txt2.setEnabled(false);
        txt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt2ActionPerformed(evt);
            }
        });
        pnlSeat.add(txt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 110, 30));

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setPreferredSize(new java.awt.Dimension(70, 100));
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel2MouseClicked(evt);
            }
        });
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pc2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        pc2.setText("PC 2");
        pc2.setOpaque(true);
        jPanel2.add(pc2, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 14, 40, 23));

        pnlSeat.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 90, 50));

        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.setPreferredSize(new java.awt.Dimension(70, 100));
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel4MouseClicked(evt);
            }
        });
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pc3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        pc3.setText("PC 3");
        pc3.setOpaque(true);
        jPanel4.add(pc3, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 14, -1, 23));

        pnlSeat.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, 90, 50));

        jPanel10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel10.setPreferredSize(new java.awt.Dimension(70, 100));
        jPanel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel10MouseClicked(evt);
            }
        });
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pc13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        pc13.setText("PC 13");
        pc13.setOpaque(true);
        jPanel10.add(pc13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 13, -1, -1));

        pnlSeat.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 160, 90, 50));

        jPanel9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel9.setPreferredSize(new java.awt.Dimension(70, 100));
        jPanel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel9MouseClicked(evt);
            }
        });
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pc12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        pc12.setText("PC 12");
        pc12.setOpaque(true);
        jPanel9.add(pc12, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 13, -1, 23));

        pnlSeat.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 90, 50));

        jPanel8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel8.setPreferredSize(new java.awt.Dimension(70, 100));
        jPanel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel8MouseClicked(evt);
            }
        });
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pc11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        pc11.setText("PC 11");
        pc11.setOpaque(true);
        jPanel8.add(pc11, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 13, -1, 23));

        pnlSeat.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 90, 50));

        jPanel12.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel12.setPreferredSize(new java.awt.Dimension(70, 100));
        jPanel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel12MouseClicked(evt);
            }
        });
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pc21.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        pc21.setText("PC 21");
        pc21.setOpaque(true);
        jPanel12.add(pc21, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 15, -1, -1));

        pnlSeat.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, 90, 50));

        jPanel13.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel13.setPreferredSize(new java.awt.Dimension(70, 100));
        jPanel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel13MouseClicked(evt);
            }
        });
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pc22.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        pc22.setText("PC 22");
        pc22.setOpaque(true);
        jPanel13.add(pc22, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 13, -1, -1));

        pnlSeat.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, 90, 50));

        jPanel14.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel14.setPreferredSize(new java.awt.Dimension(70, 100));
        jPanel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel14MouseClicked(evt);
            }
        });
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pc23.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        pc23.setText("PC 23");
        pc23.setOpaque(true);
        jPanel14.add(pc23, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 13, -1, -1));

        pnlSeat.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 300, 90, 50));

        jPanel15.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel15.setPreferredSize(new java.awt.Dimension(70, 100));
        jPanel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel15MouseClicked(evt);
            }
        });
        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pc24.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        pc24.setText("PC 24");
        pc24.setOpaque(true);
        jPanel15.add(pc24, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 15, -1, -1));

        pnlSeat.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 300, 90, 50));

        jPanel11.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel11.setPreferredSize(new java.awt.Dimension(70, 100));
        jPanel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel11MouseClicked(evt);
            }
        });
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pc14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        pc14.setText("PC 14");
        pc14.setOpaque(true);
        jPanel11.add(pc14, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 13, -1, -1));

        pnlSeat.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 160, 90, 50));

        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel5.setPreferredSize(new java.awt.Dimension(70, 100));
        jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel5MouseClicked(evt);
            }
        });
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pc4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        pc4.setText("PC 4");
        pc4.setOpaque(true);
        jPanel5.add(pc4, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 13, 40, 23));

        pnlSeat.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 20, 90, 50));

        jPanel30.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel30.setPreferredSize(new java.awt.Dimension(70, 100));
        jPanel30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel30MouseClicked(evt);
            }
        });
        jPanel30.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pc27.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        pc27.setText("PC 27");
        pc27.setOpaque(true);
        jPanel30.add(pc27, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 13, -1, -1));

        pnlSeat.add(jPanel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 300, 90, 50));

        jPanel19.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel19.setPreferredSize(new java.awt.Dimension(70, 100));
        jPanel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel19MouseClicked(evt);
            }
        });
        jPanel19.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pc26.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        pc26.setText("PC 26");
        pc26.setOpaque(true);
        jPanel19.add(pc26, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 13, -1, -1));

        pnlSeat.add(jPanel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 300, 90, 50));

        jPanel18.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel18.setPreferredSize(new java.awt.Dimension(70, 100));
        jPanel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel18MouseClicked(evt);
            }
        });
        jPanel18.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pc25.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        pc25.setText("PC 25");
        pc25.setOpaque(true);
        jPanel18.add(pc25, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 13, -1, -1));

        pnlSeat.add(jPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 300, 90, 50));

        pnl15.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pnl15.setPreferredSize(new java.awt.Dimension(70, 100));
        pnl15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnl15MouseClicked(evt);
            }
        });
        pnl15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pc15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        pc15.setText("PC 15");
        pc15.setOpaque(true);
        pnl15.add(pc15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 13, -1, -1));

        pnlSeat.add(pnl15, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 160, 90, 50));

        jPanel17.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel17.setPreferredSize(new java.awt.Dimension(70, 100));
        jPanel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel17MouseClicked(evt);
            }
        });
        jPanel17.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pc16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        pc16.setText("PC 16");
        pc16.setOpaque(true);
        jPanel17.add(pc16, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 15, -1, -1));

        pnlSeat.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 160, 90, 50));

        jPanel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel7.setPreferredSize(new java.awt.Dimension(70, 100));
        jPanel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel7MouseClicked(evt);
            }
        });
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pc6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        pc6.setText("PC 6");
        pc6.setOpaque(true);
        jPanel7.add(pc6, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 13, 40, 23));

        pnlSeat.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 20, 90, 50));

        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel6.setPreferredSize(new java.awt.Dimension(70, 100));
        jPanel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel6MouseClicked(evt);
            }
        });
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pc5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        pc5.setText("PC 5");
        pc5.setOpaque(true);
        jPanel6.add(pc5, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 13, -1, 23));

        pnlSeat.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 20, 90, 50));

        jPanel23.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel23.setPreferredSize(new java.awt.Dimension(70, 100));
        jPanel23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel23MouseClicked(evt);
            }
        });
        jPanel23.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pc7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        pc7.setText("PC 7");
        pc7.setOpaque(true);
        jPanel23.add(pc7, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 13, 40, 23));

        pnlSeat.add(jPanel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 20, 90, 50));

        jPanel26.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel26.setPreferredSize(new java.awt.Dimension(70, 100));
        jPanel26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel26MouseClicked(evt);
            }
        });
        jPanel26.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pc17.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        pc17.setText("PC 17");
        pc17.setOpaque(true);
        jPanel26.add(pc17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 13, -1, -1));

        pnlSeat.add(jPanel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 160, 90, 50));

        jPanel22.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel22.setPreferredSize(new java.awt.Dimension(70, 100));
        jPanel22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel22MouseClicked(evt);
            }
        });
        jPanel22.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pc8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        pc8.setText("PC 8");
        pc8.setOpaque(true);
        jPanel22.add(pc8, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 13, 40, 23));

        pnlSeat.add(jPanel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 20, 90, 50));

        jPanel24.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel24.setPreferredSize(new java.awt.Dimension(70, 100));
        jPanel24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel24MouseClicked(evt);
            }
        });
        jPanel24.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pc18.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        pc18.setText("PC 18");
        pc18.setOpaque(true);
        jPanel24.add(pc18, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 15, -1, -1));

        pnlSeat.add(jPanel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 160, 90, 50));

        jPanel28.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel28.setPreferredSize(new java.awt.Dimension(70, 100));
        jPanel28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel28MouseClicked(evt);
            }
        });
        jPanel28.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pc28.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        pc28.setText("PC 28");
        pc28.setOpaque(true);
        jPanel28.add(pc28, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 15, -1, -1));

        pnlSeat.add(jPanel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 300, 90, 50));

        jPanel29.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel29.setPreferredSize(new java.awt.Dimension(70, 100));
        jPanel29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel29MouseClicked(evt);
            }
        });
        jPanel29.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pc30.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        pc30.setText("PC 30");
        pc30.setOpaque(true);
        jPanel29.add(pc30, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 15, -1, -1));

        pnlSeat.add(jPanel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 300, 90, 50));

        jPanel31.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel31.setPreferredSize(new java.awt.Dimension(70, 100));
        jPanel31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel31MouseClicked(evt);
            }
        });
        jPanel31.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pc29.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        pc29.setText("PC 29");
        pc29.setOpaque(true);
        jPanel31.add(pc29, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 13, -1, -1));

        pnlSeat.add(jPanel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 300, 90, 50));

        jPanel27.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel27.setPreferredSize(new java.awt.Dimension(70, 100));
        jPanel27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel27MouseClicked(evt);
            }
        });
        jPanel27.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pc19.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        pc19.setText("PC 19");
        pc19.setOpaque(true);
        jPanel27.add(pc19, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 13, -1, -1));

        pnlSeat.add(jPanel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 160, 90, 50));

        jPanel25.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel25.setPreferredSize(new java.awt.Dimension(70, 100));
        jPanel25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel25MouseClicked(evt);
            }
        });
        jPanel25.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pc20.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        pc20.setText("PC 20");
        pc20.setOpaque(true);
        jPanel25.add(pc20, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 13, -1, -1));

        pnlSeat.add(jPanel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 160, 90, 50));

        jPanel20.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel20.setPreferredSize(new java.awt.Dimension(70, 100));
        jPanel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel20MouseClicked(evt);
            }
        });
        jPanel20.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pc10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        pc10.setText("PC 10");
        pc10.setOpaque(true);
        jPanel20.add(pc10, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 13, -1, 23));

        pnlSeat.add(jPanel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 20, 90, 50));

        jPanel21.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel21.setPreferredSize(new java.awt.Dimension(70, 100));
        jPanel21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel21MouseClicked(evt);
            }
        });
        jPanel21.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pc9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        pc9.setText("PC 9");
        pc9.setOpaque(true);
        jPanel21.add(pc9, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 13, 40, 23));

        pnlSeat.add(jPanel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 20, 90, 50));

        txt1.setEditable(false);
        txt1.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        txt1.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txt1.setEnabled(false);
        txt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt1ActionPerformed(evt);
            }
        });
        pnlSeat.add(txt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 110, 30));

        txt3.setEditable(false);
        txt3.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        txt3.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txt3.setEnabled(false);
        txt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt3ActionPerformed(evt);
            }
        });
        pnlSeat.add(txt3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 70, 110, 30));

        txt4.setEditable(false);
        txt4.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        txt4.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txt4.setEnabled(false);
        txt4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt4ActionPerformed(evt);
            }
        });
        pnlSeat.add(txt4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 70, 110, 30));

        txt8.setEditable(false);
        txt8.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        txt8.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txt8.setEnabled(false);
        txt8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt8ActionPerformed(evt);
            }
        });
        pnlSeat.add(txt8, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 70, 110, 30));

        txt6.setEditable(false);
        txt6.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        txt6.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txt6.setEnabled(false);
        txt6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt6ActionPerformed(evt);
            }
        });
        pnlSeat.add(txt6, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 70, 110, 30));

        txt7.setEditable(false);
        txt7.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        txt7.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txt7.setEnabled(false);
        txt7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt7ActionPerformed(evt);
            }
        });
        pnlSeat.add(txt7, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 70, 110, 30));

        txt5.setEditable(false);
        txt5.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        txt5.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txt5.setEnabled(false);
        txt5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt5ActionPerformed(evt);
            }
        });
        pnlSeat.add(txt5, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 70, 110, 30));

        txt14.setEditable(false);
        txt14.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        txt14.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txt14.setEnabled(false);
        txt14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt14ActionPerformed(evt);
            }
        });
        pnlSeat.add(txt14, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 210, 110, 30));

        txt12.setEditable(false);
        txt12.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        txt12.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txt12.setEnabled(false);
        txt12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt12ActionPerformed(evt);
            }
        });
        pnlSeat.add(txt12, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 110, 30));

        txt13.setEditable(false);
        txt13.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        txt13.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txt13.setEnabled(false);
        txt13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt13ActionPerformed(evt);
            }
        });
        pnlSeat.add(txt13, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 210, 110, 30));

        txt11.setEditable(false);
        txt11.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        txt11.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txt11.setEnabled(false);
        txt11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt11ActionPerformed(evt);
            }
        });
        pnlSeat.add(txt11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 110, 30));

        txt24.setEditable(false);
        txt24.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        txt24.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txt24.setEnabled(false);
        txt24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt24ActionPerformed(evt);
            }
        });
        pnlSeat.add(txt24, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 350, 110, 30));

        txt22.setEditable(false);
        txt22.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        txt22.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txt22.setEnabled(false);
        txt22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt22ActionPerformed(evt);
            }
        });
        pnlSeat.add(txt22, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 350, 110, 30));

        txt23.setEditable(false);
        txt23.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        txt23.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txt23.setEnabled(false);
        txt23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt23ActionPerformed(evt);
            }
        });
        pnlSeat.add(txt23, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 350, 110, 30));

        txt21.setEditable(false);
        txt21.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        txt21.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txt21.setEnabled(false);
        txt21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt21ActionPerformed(evt);
            }
        });
        pnlSeat.add(txt21, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 110, 30));

        txt18.setEditable(false);
        txt18.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        txt18.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txt18.setEnabled(false);
        txt18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt18ActionPerformed(evt);
            }
        });
        pnlSeat.add(txt18, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 210, 110, 30));

        txt16.setEditable(false);
        txt16.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        txt16.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txt16.setEnabled(false);
        txt16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt16ActionPerformed(evt);
            }
        });
        pnlSeat.add(txt16, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 210, 110, 30));

        txt17.setEditable(false);
        txt17.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        txt17.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txt17.setEnabled(false);
        txt17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt17ActionPerformed(evt);
            }
        });
        pnlSeat.add(txt17, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 210, 110, 30));

        txt15.setEditable(false);
        txt15.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        txt15.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txt15.setEnabled(false);
        txt15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt15ActionPerformed(evt);
            }
        });
        pnlSeat.add(txt15, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 210, 110, 30));

        txt28.setEditable(false);
        txt28.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        txt28.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txt28.setEnabled(false);
        txt28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt28ActionPerformed(evt);
            }
        });
        pnlSeat.add(txt28, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 350, 110, 30));

        txt26.setEditable(false);
        txt26.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        txt26.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txt26.setEnabled(false);
        txt26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt26ActionPerformed(evt);
            }
        });
        pnlSeat.add(txt26, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 350, 110, 30));

        txt27.setEditable(false);
        txt27.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        txt27.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txt27.setEnabled(false);
        txt27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt27ActionPerformed(evt);
            }
        });
        pnlSeat.add(txt27, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 350, 110, 30));

        txt25.setEditable(false);
        txt25.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        txt25.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txt25.setEnabled(false);
        txt25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt25ActionPerformed(evt);
            }
        });
        pnlSeat.add(txt25, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 350, 110, 30));

        txt30.setEditable(false);
        txt30.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        txt30.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txt30.setEnabled(false);
        txt30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt30ActionPerformed(evt);
            }
        });
        pnlSeat.add(txt30, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 350, 110, 30));

        txt29.setEditable(false);
        txt29.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        txt29.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txt29.setEnabled(false);
        txt29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt29ActionPerformed(evt);
            }
        });
        pnlSeat.add(txt29, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 350, 110, 30));

        txt20.setEditable(false);
        txt20.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        txt20.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txt20.setEnabled(false);
        txt20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt20ActionPerformed(evt);
            }
        });
        pnlSeat.add(txt20, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 210, 110, 30));

        txt19.setEditable(false);
        txt19.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        txt19.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txt19.setEnabled(false);
        txt19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt19ActionPerformed(evt);
            }
        });
        pnlSeat.add(txt19, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 210, 110, 30));

        txt10.setEditable(false);
        txt10.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        txt10.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txt10.setEnabled(false);
        txt10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt10ActionPerformed(evt);
            }
        });
        pnlSeat.add(txt10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 70, 110, 30));

        txt9.setEditable(false);
        txt9.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        txt9.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txt9.setEnabled(false);
        txt9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt9ActionPerformed(evt);
            }
        });
        pnlSeat.add(txt9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 70, 110, 30));

        btnSave.setBackground(new java.awt.Color(102, 255, 153));
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        pnlSeat.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 400, -1, -1));
        pnlSeat.add(i1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, -1, -1));
        pnlSeat.add(i2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, -1, -1));
        pnlSeat.add(i3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, -1, -1));
        pnlSeat.add(i4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 100, -1, -1));
        pnlSeat.add(i5, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 110, -1, -1));
        pnlSeat.add(i6, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 120, -1, -1));
        pnlSeat.add(i7, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 120, -1, -1));
        pnlSeat.add(i8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 110, -1, -1));
        pnlSeat.add(i9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 100, -1, -1));
        pnlSeat.add(i10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 110, -1, -1));
        pnlSeat.add(i11, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, -1, -1));
        pnlSeat.add(i12, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, -1, -1));
        pnlSeat.add(i13, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 240, -1, -1));
        pnlSeat.add(i14, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 240, -1, -1));
        pnlSeat.add(i15, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 240, -1, -1));
        pnlSeat.add(i16, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 240, -1, -1));
        pnlSeat.add(i17, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 240, -1, -1));
        pnlSeat.add(i18, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 240, -1, -1));
        pnlSeat.add(i19, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 240, -1, -1));
        pnlSeat.add(i20, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 240, -1, -1));
        pnlSeat.add(i21, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 380, -1, -1));
        pnlSeat.add(i22, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 380, -1, -1));
        pnlSeat.add(i23, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 380, -1, -1));
        pnlSeat.add(i24, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 380, -1, -1));
        pnlSeat.add(i25, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 390, -1, -1));
        pnlSeat.add(i26, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 380, -1, -1));
        pnlSeat.add(i27, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 390, -1, -1));
        pnlSeat.add(i28, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 380, -1, -1));
        pnlSeat.add(i29, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 380, -1, -1));
        pnlSeat.add(i30, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 380, -1, -1));

        jPanel1.add(pnlSeat, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 1380, 450));
        jPanel1.add(txtAccIdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 100, 60, -1));

        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jLabel1.setText("TIME:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 200, 60, 40));

        jLabel2.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jLabel2.setText("DATE:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 160, 60, 40));

        lblDate.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jPanel1.add(lblDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 160, 140, 40));

        lblTime.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jPanel1.add(lblTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 200, 140, 40));
        jPanel1.add(lblSeatId, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 150, 50, 20));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 2, 48)); // NOI18N
        jLabel4.setText("Student Log System");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 10, -1, -1));

        jButton1.setBackground(new java.awt.Color(51, 255, 102));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1.setText("Home");
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 170, 30));

        jButton2.setBackground(new java.awt.Color(204, 255, 204));
        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton2.setText("Create Barcode");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 170, 30));
        jPanel1.add(pic, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, 230, 200));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 716, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAccRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAccRegActionPerformed
      if(lblRole.getText().equals("Professor")){
            JOptionPane.showMessageDialog(this, "Access Denied!");
           
        
           
      }else {
          String msg=lblRole.getText();
          new AccRegister(msg).setVisible(true);
            setVisible(false);     
      }
        
    }//GEN-LAST:event_btnAccRegActionPerformed

    private void btnStudRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStudRegActionPerformed
      String msg=lblRole.getText();
        
        new StudentRegister(msg).setVisible(true);
            setVisible(false);
            
        /*StudentRegister sr = new StudentRegister();
        sr.show();
        dispose();*/
    }//GEN-LAST:event_btnStudRegActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        Login l = new Login();
        l.show();
        dispose();
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnLogsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogsActionPerformed
        // TODO add your handling code here:
        String msg=lblRole.getText();
        
        new logs(msg).setVisible(true);
            setVisible(false);
    }//GEN-LAST:event_btnLogsActionPerformed

    private void txtStudIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtStudIdKeyTyped
    /*try {
        // TODO add your handling code here:
        conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/crudv2_db", "root", "");
        ps=conn.prepareStatement("SELECT name FROM student_info WHERE studentID=?");
        ps.setString(1, txtStudId.getText());
        
        rs=ps.executeQuery();
       while(rs.next()){
       
        String r = rs.getString("name");
        txtName.setText(r);
       }
    } catch (SQLException ex) {
        Logger.getLogger(Homepage.class.getName()).log(Level.SEVERE, null, ex);
    }*/
    /*try {
            // Initialize connection
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/crudv2_db", "root", "");
            
            // Prepare SQL statement
            ps = conn.prepareStatement("SELECT name FROM student_info WHERE studentID = ?");
            ps.setString(1, txtStudId.getText());
            
            // Execute query
            rs = ps.executeQuery();
            
            if (rs.next()) { // Check if the result set has a row
                String name = rs.getString("name");
                txtName.setText(name);
            } else {
                // No result found
                txtName.setText("No student found");
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Homepage.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            // Clean up resources
            try {
                if (rs != null) rs.close();
                if (ps != null) ps.close();
                if (conn != null) conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(Homepage.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    */

    }//GEN-LAST:event_txtStudIdKeyTyped

    private void txt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt2ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txt2ActionPerformed

    private void txtStudIdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtStudIdKeyPressed
        // TODO add your handling code here:
         // TODO add your handling code here:
     if(evt.getKeyCode()==KeyEvent.VK_ENTER){
       
       loadstudentdetails();
       loadPicture();
       
    }
    }//GEN-LAST:event_txtStudIdKeyPressed

    private void txtStudIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStudIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStudIdActionPerformed

    private void jPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseClicked
        // TODO add your handling code here:
        
        if(pc1.getBackground().equals(RED)){
        
        JOptionPane.showMessageDialog(null, "Seat Already Taken");
        }else if (pc1.getBackground().equals(GREEN)){
            String p1 = txtName.getText();
            txt1.setText(p1);
            String i = txtSid.getText();
            i1.setText(i);
            
 

try {
    conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/crudv2_db", "root", "");
    ps = conn.prepareStatement("INSERT INTO logs (account_id, seat_plan_id, student_info_id, studentID, date, time_in, seat) VALUES (?,?,?,?,?,?,?)");

    // Set String values
    ps.setString(1, txtAccIdd.getText());
    ps.setString(2, lblSeatId.getText());
    ps.setString(3, txtSid.getText());
    ps.setString(4, txtStudId.getText());

    // Convert and set Date
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd"); // Adjust format as per your date format
    java.util.Date utilDate = dateFormat.parse(lblDate.getText());
    java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
    ps.setDate(5, sqlDate);

    // Convert and set Time (Only Time, without Date)
    SimpleDateFormat timeFormat = new SimpleDateFormat("HH-mm-ss"); // Adjust format as per your time format
    java.util.Date utilTime = timeFormat.parse(lblTime.getText());
    java.sql.Time sqlTime = new java.sql.Time(utilTime.getTime());
    ps.setTime(6, sqlTime);

    // Set other String value
    ps.setString(7, pc1.getText());

    ps.executeUpdate();

    txtStudId.setText("");
    txtName.setText("");
    txtSid.setText("");
} catch (SQLException | ParseException ex) {
    Logger.getLogger(Homepage.class.getName()).log(Level.SEVERE, null, ex);
} finally {
    // Ensure resources are closed
    try {
        if (ps != null) ps.close();
        if (conn != null) conn.close();
    } catch (SQLException e) {
        e.printStackTrace();
    }
}
            
        }else if(txtName.getText().equals("No student found")){
            JOptionPane.showMessageDialog(null, "No student");
        
        }
    }//GEN-LAST:event_jPanel3MouseClicked

    private void txt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt1ActionPerformed

    private void txt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt3ActionPerformed

    private void txt4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt4ActionPerformed

    private void txt8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt8ActionPerformed

    private void txt6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt6ActionPerformed

    private void txt7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt7ActionPerformed

    private void txt5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt5ActionPerformed

    private void txt14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt14ActionPerformed

    private void txt12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt12ActionPerformed

    private void txt13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt13ActionPerformed

    private void txt11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt11ActionPerformed

    private void txt24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt24ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt24ActionPerformed

    private void txt22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt22ActionPerformed

    private void txt23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt23ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt23ActionPerformed

    private void txt21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt21ActionPerformed

    private void txt18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt18ActionPerformed

    private void txt16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt16ActionPerformed

    private void txt17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt17ActionPerformed

    private void txt15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt15ActionPerformed

    private void txt28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt28ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt28ActionPerformed

    private void txt26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt26ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt26ActionPerformed

    private void txt27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt27ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt27ActionPerformed

    private void txt25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt25ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt25ActionPerformed

    private void txt30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt30ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt30ActionPerformed

    private void txt29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt29ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt29ActionPerformed

    private void txt20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt20ActionPerformed

    private void txt19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt19ActionPerformed

    private void txt10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt10ActionPerformed

    private void txt9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt9ActionPerformed

    private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseClicked
        // TODO add your handling code here:
           if(pc2.getBackground().equals(RED)){
        
        JOptionPane.showMessageDialog(null, "Seat Already Taken");
        }else if (pc2.getBackground().equals(GREEN)){
           String p2 = txtName.getText();
        txt2.setText(p2);
        String i = txtSid.getText();
            i2.setText(i);
         try {
    conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/crudv2_db", "root", "");
    ps = conn.prepareStatement("INSERT INTO logs (account_id, seat_plan_id, student_info_id, studentID, date, time_in, seat) VALUES (?,?,?,?,?,?,?)");

    // Set String values
    ps.setString(1, txtAccIdd.getText());
    ps.setString(2, lblSeatId.getText());
    ps.setString(3, txtSid.getText());
    ps.setString(4, txtStudId.getText());

    // Convert and set Date
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd"); // Adjust format as per your date format
    java.util.Date utilDate = dateFormat.parse(lblDate.getText());
    java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
    ps.setDate(5, sqlDate);

    // Convert and set Time (Only Time, without Date)
    SimpleDateFormat timeFormat = new SimpleDateFormat("HH-mm-ss"); // Adjust format as per your time format
    java.util.Date utilTime = timeFormat.parse(lblTime.getText());
    java.sql.Time sqlTime = new java.sql.Time(utilTime.getTime());
    ps.setTime(6, sqlTime);

    // Set other String value
    ps.setString(7, pc2.getText());

    ps.executeUpdate();

    txtStudId.setText("");
    txtName.setText("");
    txtSid.setText("");
} catch (SQLException | ParseException ex) {
    Logger.getLogger(Homepage.class.getName()).log(Level.SEVERE, null, ex);
} finally {
    // Ensure resources are closed
    try {
        if (ps != null) ps.close();
        if (conn != null) conn.close();
    } catch (SQLException e) {
        e.printStackTrace();
    }
}
        }else if(txtName.getText().equals("No student found")){
            JOptionPane.showMessageDialog(null, "No student");
        
        }
    }//GEN-LAST:event_jPanel2MouseClicked

    private void jPanel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseClicked
        // TODO add your handling code here:
        if(pc3.getBackground().equals(RED)){
        
        JOptionPane.showMessageDialog(null, "Seat Already Taken");
        }else if (pc3.getBackground().equals(GREEN)){
           String p3 = txtName.getText();
        txt3.setText(p3);
        String i = txtSid.getText();
            i3.setText(i);
         try {
    conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/crudv2_db", "root", "");
    ps = conn.prepareStatement("INSERT INTO logs (account_id, seat_plan_id, student_info_id, studentID, date, time_in, seat) VALUES (?,?,?,?,?,?,?)");

    // Set String values
    ps.setString(1, txtAccIdd.getText());
    ps.setString(2, lblSeatId.getText());
    ps.setString(3, txtSid.getText());
    ps.setString(4, txtStudId.getText());

    // Convert and set Date
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd"); // Adjust format as per your date format
    java.util.Date utilDate = dateFormat.parse(lblDate.getText());
    java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
    ps.setDate(5, sqlDate);

    // Convert and set Time (Only Time, without Date)
    SimpleDateFormat timeFormat = new SimpleDateFormat("HH-mm-ss"); // Adjust format as per your time format
    java.util.Date utilTime = timeFormat.parse(lblTime.getText());
    java.sql.Time sqlTime = new java.sql.Time(utilTime.getTime());
    ps.setTime(6, sqlTime);

    // Set other String value
    ps.setString(7, pc3.getText());

    ps.executeUpdate();

    txtStudId.setText("");
    txtName.setText("");
    txtSid.setText("");
} catch (SQLException | ParseException ex) {
    Logger.getLogger(Homepage.class.getName()).log(Level.SEVERE, null, ex);
} finally {
    // Ensure resources are closed
    try {
        if (ps != null) ps.close();
        if (conn != null) conn.close();
    } catch (SQLException e) {
        e.printStackTrace();
    }
}
        }else if(txtName.getText().equals("No student found")){
            JOptionPane.showMessageDialog(null, "No student");
        
        }
          
    }//GEN-LAST:event_jPanel4MouseClicked

    private void jPanel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseClicked
        // TODO add your handling code here:
          if(pc4.getBackground().equals(RED)){
        
        JOptionPane.showMessageDialog(null, "Seat Already Taken");
        }else if (pc4.getBackground().equals(GREEN)){
           String p4 = txtName.getText();
        txt4.setText(p4);
        String i = txtSid.getText();
            i4.setText(i);
        try {
    conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/crudv2_db", "root", "");
    ps = conn.prepareStatement("INSERT INTO logs (account_id, seat_plan_id, student_info_id, studentID, date, time_in, seat) VALUES (?,?,?,?,?,?,?)");

    // Set String values
    ps.setString(1, txtAccIdd.getText());
    ps.setString(2, lblSeatId.getText());
    ps.setString(3, txtSid.getText());
    ps.setString(4, txtStudId.getText());

    // Convert and set Date
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd"); // Adjust format as per your date format
    java.util.Date utilDate = dateFormat.parse(lblDate.getText());
    java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
    ps.setDate(5, sqlDate);

    // Convert and set Time (Only Time, without Date)
    SimpleDateFormat timeFormat = new SimpleDateFormat("HH-mm-ss"); // Adjust format as per your time format
    java.util.Date utilTime = timeFormat.parse(lblTime.getText());
    java.sql.Time sqlTime = new java.sql.Time(utilTime.getTime());
    ps.setTime(6, sqlTime);

    // Set other String value
    ps.setString(7, pc4.getText());

    ps.executeUpdate();

    txtStudId.setText("");
    txtName.setText("");
    txtSid.setText("");
} catch (SQLException | ParseException ex) {
    Logger.getLogger(Homepage.class.getName()).log(Level.SEVERE, null, ex);
} finally {
    // Ensure resources are closed
    try {
        if (ps != null) ps.close();
        if (conn != null) conn.close();
    } catch (SQLException e) {
        e.printStackTrace();
    }
}
        }else if(txtName.getText().equals("No student found")){
            JOptionPane.showMessageDialog(null, "No student");
        
        }
    }//GEN-LAST:event_jPanel5MouseClicked

    private void jPanel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseClicked
        // TODO add your handling code here:
          if(pc5.getBackground().equals(RED)){
        
        JOptionPane.showMessageDialog(null, "Seat Already Taken");
        }else if (pc5.getBackground().equals(GREEN)){
           String p5 = txtName.getText();
        txt5.setText(p5);
        String i = txtSid.getText();
            i5.setText(i);
         try {
    conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/crudv2_db", "root", "");
    ps = conn.prepareStatement("INSERT INTO logs (account_id, seat_plan_id, student_info_id, studentID, date, time_in, seat) VALUES (?,?,?,?,?,?,?)");

    // Set String values
    ps.setString(1, txtAccIdd.getText());
    ps.setString(2, lblSeatId.getText());
    ps.setString(3, txtSid.getText());
    ps.setString(4, txtStudId.getText());

    // Convert and set Date
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd"); // Adjust format as per your date format
    java.util.Date utilDate = dateFormat.parse(lblDate.getText());
    java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
    ps.setDate(5, sqlDate);

    // Convert and set Time (Only Time, without Date)
    SimpleDateFormat timeFormat = new SimpleDateFormat("HH-mm-ss"); // Adjust format as per your time format
    java.util.Date utilTime = timeFormat.parse(lblTime.getText());
    java.sql.Time sqlTime = new java.sql.Time(utilTime.getTime());
    ps.setTime(6, sqlTime);

    // Set other String value
    ps.setString(7, pc5.getText());

    ps.executeUpdate();

    txtStudId.setText("");
    txtName.setText("");
    txtSid.setText("");
} catch (SQLException | ParseException ex) {
    Logger.getLogger(Homepage.class.getName()).log(Level.SEVERE, null, ex);
} finally {
    // Ensure resources are closed
    try {
        if (ps != null) ps.close();
        if (conn != null) conn.close();
    } catch (SQLException e) {
        e.printStackTrace();
    }
}
        }else if(txtName.getText().equals("No student found")){
            JOptionPane.showMessageDialog(null, "No student");
        
        }
    }//GEN-LAST:event_jPanel6MouseClicked

    private void jPanel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseClicked
        // TODO add your handling code here:
          if(pc6.getBackground().equals(RED)){
        
        JOptionPane.showMessageDialog(null, "Seat Already Taken");
        }else if (pc6.getBackground().equals(GREEN)){
           String p6 = txtName.getText();
        txt6.setText(p6);
        String i = txtSid.getText();
            i6.setText(i);
         try {
    conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/crudv2_db", "root", "");
    ps = conn.prepareStatement("INSERT INTO logs (account_id, seat_plan_id, student_info_id, studentID, date, time_in, seat) VALUES (?,?,?,?,?,?,?)");

    // Set String values
    ps.setString(1, txtAccIdd.getText());
    ps.setString(2, lblSeatId.getText());
    ps.setString(3, txtSid.getText());
    ps.setString(4, txtStudId.getText());

    // Convert and set Date
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd"); // Adjust format as per your date format
    java.util.Date utilDate = dateFormat.parse(lblDate.getText());
    java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
    ps.setDate(5, sqlDate);

    // Convert and set Time (Only Time, without Date)
    SimpleDateFormat timeFormat = new SimpleDateFormat("HH-mm-ss"); // Adjust format as per your time format
    java.util.Date utilTime = timeFormat.parse(lblTime.getText());
    java.sql.Time sqlTime = new java.sql.Time(utilTime.getTime());
    ps.setTime(6, sqlTime);

    // Set other String value
    ps.setString(7, pc6.getText());

    ps.executeUpdate();
    

    txtStudId.setText("");
    txtName.setText("");
    txtSid.setText("");
} catch (SQLException | ParseException ex) {
    Logger.getLogger(Homepage.class.getName()).log(Level.SEVERE, null, ex);
} finally {
    // Ensure resources are closed
    try {
        if (ps != null) ps.close();
        if (conn != null) conn.close();
    } catch (SQLException e) {
        e.printStackTrace();
    }
}
        }else if(txtName.getText().equals("No student found")){
            JOptionPane.showMessageDialog(null, "No student");
        
        }
    }//GEN-LAST:event_jPanel7MouseClicked

    private void jPanel23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel23MouseClicked
        // TODO add your handling code here:
          if(pc7.getBackground().equals(RED)){
        
        JOptionPane.showMessageDialog(null, "Seat Already Taken");
        }else if (pc7.getBackground().equals(GREEN)){
           String p7 = txtName.getText();
        txt7.setText(p7);
        String i = txtSid.getText();
            i7.setText(i);
         try {
    conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/crudv2_db", "root", "");
    ps = conn.prepareStatement("INSERT INTO logs (account_id, seat_plan_id, student_info_id, studentID, date, time_in, seat) VALUES (?,?,?,?,?,?,?)");

    // Set String values
    ps.setString(1, txtAccIdd.getText());
    ps.setString(2, lblSeatId.getText());
    ps.setString(3, txtSid.getText());
    ps.setString(4, txtStudId.getText());

    // Convert and set Date
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd"); // Adjust format as per your date format
    java.util.Date utilDate = dateFormat.parse(lblDate.getText());
    java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
    ps.setDate(5, sqlDate);

    // Convert and set Time (Only Time, without Date)
    SimpleDateFormat timeFormat = new SimpleDateFormat("HH-mm-ss"); // Adjust format as per your time format
    java.util.Date utilTime = timeFormat.parse(lblTime.getText());
    java.sql.Time sqlTime = new java.sql.Time(utilTime.getTime());
    ps.setTime(6, sqlTime);

    // Set other String value
    ps.setString(7, pc7.getText());

    ps.executeUpdate();

    txtStudId.setText("");
    txtName.setText("");
    txtSid.setText("");
} catch (SQLException | ParseException ex) {
    Logger.getLogger(Homepage.class.getName()).log(Level.SEVERE, null, ex);
} finally {
    // Ensure resources are closed
    try {
        if (ps != null) ps.close();
        if (conn != null) conn.close();
    } catch (SQLException e) {
        e.printStackTrace();
    }
}
        }else if(txtName.getText().equals("No student found")){
            JOptionPane.showMessageDialog(null, "No student");
        
        }
    }//GEN-LAST:event_jPanel23MouseClicked

    private void jPanel22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel22MouseClicked
        // TODO add your handling code here:
         if(pc8.getBackground().equals(RED)){
        
        JOptionPane.showMessageDialog(null, "Seat Already Taken");
        }else if (pc8.getBackground().equals(GREEN)){
           String p8 = txtName.getText();
        txt8.setText(p8);
        String i = txtSid.getText();
            i8.setText(i);
         try {
    conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/crudv2_db", "root", "");
    ps = conn.prepareStatement("INSERT INTO logs (account_id, seat_plan_id, student_info_id, studentID, date, time_in, seat) VALUES (?,?,?,?,?,?,?)");

    // Set String values
    ps.setString(1, txtAccIdd.getText());
    ps.setString(2, lblSeatId.getText());
    ps.setString(3, txtSid.getText());
    ps.setString(4, txtStudId.getText());

    // Convert and set Date
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd"); // Adjust format as per your date format
    java.util.Date utilDate = dateFormat.parse(lblDate.getText());
    java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
    ps.setDate(5, sqlDate);

    // Convert and set Time (Only Time, without Date)
    SimpleDateFormat timeFormat = new SimpleDateFormat("HH-mm-ss"); // Adjust format as per your time format
    java.util.Date utilTime = timeFormat.parse(lblTime.getText());
    java.sql.Time sqlTime = new java.sql.Time(utilTime.getTime());
    ps.setTime(6, sqlTime);

    // Set other String value
    ps.setString(7, pc8.getText());

    ps.executeUpdate();

    txtStudId.setText("");
    txtName.setText("");
    txtSid.setText("");
} catch (SQLException | ParseException ex) {
    Logger.getLogger(Homepage.class.getName()).log(Level.SEVERE, null, ex);
} finally {
    // Ensure resources are closed
    try {
        if (ps != null) ps.close();
        if (conn != null) conn.close();
    } catch (SQLException e) {
        e.printStackTrace();
    }
}
        }else if(txtName.getText().equals("No student found")){
            JOptionPane.showMessageDialog(null, "No student");
        
        }
    }//GEN-LAST:event_jPanel22MouseClicked

    private void jPanel21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel21MouseClicked
        // TODO add your handling code here:
          if(pc9.getBackground().equals(RED)){
        
        JOptionPane.showMessageDialog(null, "Seat Already Taken");
        }else if (pc9.getBackground().equals(GREEN)){
           String p9 = txtName.getText();
        txt9.setText(p9);
        String i = txtSid.getText();
            i9.setText(i);
         try {
    conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/crudv2_db", "root", "");
    ps = conn.prepareStatement("INSERT INTO logs (account_id, seat_plan_id, student_info_id, studentID, date, time_in, seat) VALUES (?,?,?,?,?,?,?)");

    // Set String values
    ps.setString(1, txtAccIdd.getText());
    ps.setString(2, lblSeatId.getText());
    ps.setString(3, txtSid.getText());
    ps.setString(4, txtStudId.getText());

    // Convert and set Date
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd"); // Adjust format as per your date format
    java.util.Date utilDate = dateFormat.parse(lblDate.getText());
    java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
    ps.setDate(5, sqlDate);

    // Convert and set Time (Only Time, without Date)
    SimpleDateFormat timeFormat = new SimpleDateFormat("HH-mm-ss"); // Adjust format as per your time format
    java.util.Date utilTime = timeFormat.parse(lblTime.getText());
    java.sql.Time sqlTime = new java.sql.Time(utilTime.getTime());
    ps.setTime(6, sqlTime);

    // Set other String value
    ps.setString(7, pc9.getText());

    ps.executeUpdate();

    txtStudId.setText("");
    txtName.setText("");
    txtSid.setText("");
} catch (SQLException | ParseException ex) {
    Logger.getLogger(Homepage.class.getName()).log(Level.SEVERE, null, ex);
} finally {
    // Ensure resources are closed
    try {
        if (ps != null) ps.close();
        if (conn != null) conn.close();
    } catch (SQLException e) {
        e.printStackTrace();
    }
}
        }else if(txtName.getText().equals("No student found")){
            JOptionPane.showMessageDialog(null, "No student");
        
        }
    }//GEN-LAST:event_jPanel21MouseClicked

    private void jPanel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel20MouseClicked
        // TODO add your handling code here:
          if(pc10.getBackground().equals(RED)){
        
        JOptionPane.showMessageDialog(null, "Seat Already Taken");
        }else if (pc10.getBackground().equals(GREEN)){
           String p10 = txtName.getText();
        txt10.setText(p10);
        String i = txtSid.getText();
            i10.setText(i);
         try {
    conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/crudv2_db", "root", "");
    ps = conn.prepareStatement("INSERT INTO logs (account_id, seat_plan_id, student_info_id, studentID, date, time_in, seat) VALUES (?,?,?,?,?,?,?)");

    // Set String values
    ps.setString(1, txtAccIdd.getText());
    ps.setString(2, lblSeatId.getText());
    ps.setString(3, txtSid.getText());
    ps.setString(4, txtStudId.getText());

    // Convert and set Date
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd"); // Adjust format as per your date format
    java.util.Date utilDate = dateFormat.parse(lblDate.getText());
    java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
    ps.setDate(5, sqlDate);

    // Convert and set Time (Only Time, without Date)
    SimpleDateFormat timeFormat = new SimpleDateFormat("HH-mm-ss"); // Adjust format as per your time format
    java.util.Date utilTime = timeFormat.parse(lblTime.getText());
    java.sql.Time sqlTime = new java.sql.Time(utilTime.getTime());
    ps.setTime(6, sqlTime);

    // Set other String value
    ps.setString(7, pc10.getText());

    ps.executeUpdate();

    txtStudId.setText("");
    txtName.setText("");
    txtSid.setText("");
} catch (SQLException | ParseException ex) {
    Logger.getLogger(Homepage.class.getName()).log(Level.SEVERE, null, ex);
} finally {
    // Ensure resources are closed
    try {
        if (ps != null) ps.close();
        if (conn != null) conn.close();
    } catch (SQLException e) {
        e.printStackTrace();
    }
}
        }else if(txtName.getText().equals("No student found")){
            JOptionPane.showMessageDialog(null, "No student");
        
        }
    }//GEN-LAST:event_jPanel20MouseClicked

    private void jPanel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel8MouseClicked
        // TODO add your handling code here:
          if(pc11.getBackground().equals(RED)){
        
        JOptionPane.showMessageDialog(null, "Seat Already Taken");
        }else if (pc11.getBackground().equals(GREEN)){
           String p11 = txtName.getText();
        txt11.setText(p11);
        String i = txtSid.getText();
            i11.setText(i);
         try {
    conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/crudv2_db", "root", "");
    ps = conn.prepareStatement("INSERT INTO logs (account_id, seat_plan_id, student_info_id, studentID, date, time_in, seat) VALUES (?,?,?,?,?,?,?)");

    // Set String values
    ps.setString(1, txtAccIdd.getText());
    ps.setString(2, lblSeatId.getText());
    ps.setString(3, txtSid.getText());
    ps.setString(4, txtStudId.getText());

    // Convert and set Date
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd"); // Adjust format as per your date format
    java.util.Date utilDate = dateFormat.parse(lblDate.getText());
    java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
    ps.setDate(5, sqlDate);

    // Convert and set Time (Only Time, without Date)
    SimpleDateFormat timeFormat = new SimpleDateFormat("HH-mm-ss"); // Adjust format as per your time format
    java.util.Date utilTime = timeFormat.parse(lblTime.getText());
    java.sql.Time sqlTime = new java.sql.Time(utilTime.getTime());
    ps.setTime(6, sqlTime);

    // Set other String value
    ps.setString(7, pc11.getText());

    ps.executeUpdate();

    txtStudId.setText("");
    txtName.setText("");
    txtSid.setText("");
} catch (SQLException | ParseException ex) {
    Logger.getLogger(Homepage.class.getName()).log(Level.SEVERE, null, ex);
} finally {
    // Ensure resources are closed
    try {
        if (ps != null) ps.close();
        if (conn != null) conn.close();
    } catch (SQLException e) {
        e.printStackTrace();
    }
}
        }else if(txtName.getText().equals("No student found")){
            JOptionPane.showMessageDialog(null, "No student");
        
        }
    }//GEN-LAST:event_jPanel8MouseClicked

    private void jPanel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel9MouseClicked
        // TODO add your handling code here:
       if(pc12.getBackground().equals(RED)){
        
        JOptionPane.showMessageDialog(null, "Seat Already Taken");
        }else if (pc12.getBackground().equals(GREEN)){
           String p12 = txtName.getText();
        txt12.setText(p12);
        String i = txtSid.getText();
            i12.setText(i);
         try {
    conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/crudv2_db", "root", "");
    ps = conn.prepareStatement("INSERT INTO logs (account_id, seat_plan_id, student_info_id, studentID, date, time_in, seat) VALUES (?,?,?,?,?,?,?)");

    // Set String values
    ps.setString(1, txtAccIdd.getText());
    ps.setString(2, lblSeatId.getText());
    ps.setString(3, txtSid.getText());
    ps.setString(4, txtStudId.getText());

    // Convert and set Date
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd"); // Adjust format as per your date format
    java.util.Date utilDate = dateFormat.parse(lblDate.getText());
    java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
    ps.setDate(5, sqlDate);

    // Convert and set Time (Only Time, without Date)
    SimpleDateFormat timeFormat = new SimpleDateFormat("HH-mm-ss"); // Adjust format as per your time format
    java.util.Date utilTime = timeFormat.parse(lblTime.getText());
    java.sql.Time sqlTime = new java.sql.Time(utilTime.getTime());
    ps.setTime(6, sqlTime);

    // Set other String value
    ps.setString(7, pc12.getText());

    ps.executeUpdate();

    txtStudId.setText("");
    txtName.setText("");
    txtSid.setText("");
} catch (SQLException | ParseException ex) {
    Logger.getLogger(Homepage.class.getName()).log(Level.SEVERE, null, ex);
} finally {
    // Ensure resources are closed
    try {
        if (ps != null) ps.close();
        if (conn != null) conn.close();
    } catch (SQLException e) {
        e.printStackTrace();
    }
}
        }else if(txtName.getText().equals("No student found")){
            JOptionPane.showMessageDialog(null, "No student");
        
        }
    }//GEN-LAST:event_jPanel9MouseClicked

    private void jPanel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel10MouseClicked
        // TODO add your handling code here:
        if(pc13.getBackground().equals(RED)){
        
        JOptionPane.showMessageDialog(null, "Seat Already Taken");
        }else if (pc13.getBackground().equals(GREEN)){
           String p13 = txtName.getText();
        txt13.setText(p13);
        String i = txtSid.getText();
            i13.setText(i);
         try {
    conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/crudv2_db", "root", "");
    ps = conn.prepareStatement("INSERT INTO logs (account_id, seat_plan_id, student_info_id, studentID, date, time_in, seat) VALUES (?,?,?,?,?,?,?)");

    // Set String values
    ps.setString(1, txtAccIdd.getText());
    ps.setString(2, lblSeatId.getText());
    ps.setString(3, txtSid.getText());
    ps.setString(4, txtStudId.getText());

    // Convert and set Date
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd"); // Adjust format as per your date format
    java.util.Date utilDate = dateFormat.parse(lblDate.getText());
    java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
    ps.setDate(5, sqlDate);

    // Convert and set Time (Only Time, without Date)
    SimpleDateFormat timeFormat = new SimpleDateFormat("HH-mm-ss"); // Adjust format as per your time format
    java.util.Date utilTime = timeFormat.parse(lblTime.getText());
    java.sql.Time sqlTime = new java.sql.Time(utilTime.getTime());
    ps.setTime(6, sqlTime);

    // Set other String value
    ps.setString(7, pc13.getText());

    ps.executeUpdate();

    txtStudId.setText("");
    txtName.setText("");
    txtSid.setText("");
} catch (SQLException | ParseException ex) {
    Logger.getLogger(Homepage.class.getName()).log(Level.SEVERE, null, ex);
} finally {
    // Ensure resources are closed
    try {
        if (ps != null) ps.close();
        if (conn != null) conn.close();
    } catch (SQLException e) {
        e.printStackTrace();
    }
}
        }else if(txtName.getText().equals("No student found")){
            JOptionPane.showMessageDialog(null, "No student");
        
        }
    }//GEN-LAST:event_jPanel10MouseClicked

    private void jPanel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel11MouseClicked
        // TODO add your handling code here:
       if(pc14.getBackground().equals(RED)){
        
        JOptionPane.showMessageDialog(null, "Seat Already Taken");
        }else if (pc14.getBackground().equals(GREEN)){
           String p14 = txtName.getText();
        txt14.setText(p14);
        String i = txtSid.getText();
            i14.setText(i);
         try {
    conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/crudv2_db", "root", "");
    ps = conn.prepareStatement("INSERT INTO logs (account_id, seat_plan_id, student_info_id, studentID, date, time_in, seat) VALUES (?,?,?,?,?,?,?)");

    // Set String values
    ps.setString(1, txtAccIdd.getText());
    ps.setString(2, lblSeatId.getText());
    ps.setString(3, txtSid.getText());
    ps.setString(4, txtStudId.getText());

    // Convert and set Date
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd"); // Adjust format as per your date format
    java.util.Date utilDate = dateFormat.parse(lblDate.getText());
    java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
    ps.setDate(5, sqlDate);

    // Convert and set Time (Only Time, without Date)
    SimpleDateFormat timeFormat = new SimpleDateFormat("HH-mm-ss"); // Adjust format as per your time format
    java.util.Date utilTime = timeFormat.parse(lblTime.getText());
    java.sql.Time sqlTime = new java.sql.Time(utilTime.getTime());
    ps.setTime(6, sqlTime);

    // Set other String value
    ps.setString(7, pc14.getText());

    ps.executeUpdate();

    txtStudId.setText("");
    txtName.setText("");
    txtSid.setText("");
} catch (SQLException | ParseException ex) {
    Logger.getLogger(Homepage.class.getName()).log(Level.SEVERE, null, ex);
} finally {
    // Ensure resources are closed
    try {
        if (ps != null) ps.close();
        if (conn != null) conn.close();
    } catch (SQLException e) {
        e.printStackTrace();
    }
}
        }else if(txtName.getText().equals("No student found")){
            JOptionPane.showMessageDialog(null, "No student");
        
        }
    }//GEN-LAST:event_jPanel11MouseClicked

    private void pnl15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl15MouseClicked
        // TODO add your handling code here5
        if(pc15.getBackground().equals(RED)){
        
        JOptionPane.showMessageDialog(null, "Seat Already Taken");
        }else if (pc15.getBackground().equals(GREEN)){
           String p15 = txtName.getText();
        txt15.setText(p15);
        String i = txtSid.getText();
            i15.setText(i);
         try {
    conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/crudv2_db", "root", "");
    ps = conn.prepareStatement("INSERT INTO logs (account_id, seat_plan_id, student_info_id, studentID, date, time_in, seat) VALUES (?,?,?,?,?,?,?)");

    // Set String values
    ps.setString(1, txtAccIdd.getText());
    ps.setString(2, lblSeatId.getText());
    ps.setString(3, txtSid.getText());
    ps.setString(4, txtStudId.getText());

    // Convert and set Date
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd"); // Adjust format as per your date format
    java.util.Date utilDate = dateFormat.parse(lblDate.getText());
    java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
    ps.setDate(5, sqlDate);

    // Convert and set Time (Only Time, without Date)
    SimpleDateFormat timeFormat = new SimpleDateFormat("HH-mm-ss"); // Adjust format as per your time format
    java.util.Date utilTime = timeFormat.parse(lblTime.getText());
    java.sql.Time sqlTime = new java.sql.Time(utilTime.getTime());
    ps.setTime(6, sqlTime);

    // Set other String value
    ps.setString(7, pc15.getText());

    ps.executeUpdate();

    txtStudId.setText("");
    txtName.setText("");
    txtSid.setText("");
} catch (SQLException | ParseException ex) {
    Logger.getLogger(Homepage.class.getName()).log(Level.SEVERE, null, ex);
} finally {
    // Ensure resources are closed
    try {
        if (ps != null) ps.close();
        if (conn != null) conn.close();
    } catch (SQLException e) {
        e.printStackTrace();
    }
}
        }else if(txtName.getText().equals("No student found")){
            JOptionPane.showMessageDialog(null, "No student");
        
        }
    }//GEN-LAST:event_pnl15MouseClicked

    private void jPanel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel17MouseClicked
        // TODO add your handling code here:
        if(pc16.getBackground().equals(RED)){
        
        JOptionPane.showMessageDialog(null, "Seat Already Taken");
        }else if (pc16.getBackground().equals(GREEN)){
           String p16 = txtName.getText();
        txt16.setText(p16);
        String i = txtSid.getText();
            i16.setText(i);
         try {
    conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/crudv2_db", "root", "");
    ps = conn.prepareStatement("INSERT INTO logs (account_id, seat_plan_id, student_info_id, studentID, date, time_in, seat) VALUES (?,?,?,?,?,?,?)");

    // Set String values
    ps.setString(1, txtAccIdd.getText());
    ps.setString(2, lblSeatId.getText());
    ps.setString(3, txtSid.getText());
    ps.setString(4, txtStudId.getText());

    // Convert and set Date
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd"); // Adjust format as per your date format
    java.util.Date utilDate = dateFormat.parse(lblDate.getText());
    java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
    ps.setDate(5, sqlDate);

    // Convert and set Time (Only Time, without Date)
    SimpleDateFormat timeFormat = new SimpleDateFormat("HH-mm-ss"); // Adjust format as per your time format
    java.util.Date utilTime = timeFormat.parse(lblTime.getText());
    java.sql.Time sqlTime = new java.sql.Time(utilTime.getTime());
    ps.setTime(6, sqlTime);

    // Set other String value
    ps.setString(7, pc16.getText());

    ps.executeUpdate();

    txtStudId.setText("");
    txtName.setText("");
    txtSid.setText("");
} catch (SQLException | ParseException ex) {
    Logger.getLogger(Homepage.class.getName()).log(Level.SEVERE, null, ex);
} finally {
    // Ensure resources are closed
    try {
        if (ps != null) ps.close();
        if (conn != null) conn.close();
    } catch (SQLException e) {
        e.printStackTrace();
    }
}
        }else if(txtName.getText().equals("No student found")){
            JOptionPane.showMessageDialog(null, "No student");
        
        }
    }//GEN-LAST:event_jPanel17MouseClicked

    private void jPanel26MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel26MouseClicked
        // TODO add your handling code here:
        if(pc17.getBackground().equals(RED)){
        
        JOptionPane.showMessageDialog(null, "Seat Already Taken");
        }else if (pc17.getBackground().equals(GREEN)){
           String p17 = txtName.getText();
        txt17.setText(p17);
        String i = txtSid.getText();
            i17.setText(i);
         try {
    conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/crudv2_db", "root", "");
    ps = conn.prepareStatement("INSERT INTO logs (account_id, seat_plan_id, student_info_id, studentID, date, time_in, seat) VALUES (?,?,?,?,?,?,?)");

    // Set String values
    ps.setString(1, txtAccIdd.getText());
    ps.setString(2, lblSeatId.getText());
    ps.setString(3, txtSid.getText());
    ps.setString(4, txtStudId.getText());

    // Convert and set Date
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd"); // Adjust format as per your date format
    java.util.Date utilDate = dateFormat.parse(lblDate.getText());
    java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
    ps.setDate(5, sqlDate);

    // Convert and set Time (Only Time, without Date)
    SimpleDateFormat timeFormat = new SimpleDateFormat("HH-mm-ss"); // Adjust format as per your time format
    java.util.Date utilTime = timeFormat.parse(lblTime.getText());
    java.sql.Time sqlTime = new java.sql.Time(utilTime.getTime());
    ps.setTime(6, sqlTime);

    // Set other String value
    ps.setString(7, pc17.getText());

    ps.executeUpdate();

    txtStudId.setText("");
    txtName.setText("");
    txtSid.setText("");
} catch (SQLException | ParseException ex) {
    Logger.getLogger(Homepage.class.getName()).log(Level.SEVERE, null, ex);
} finally {
    // Ensure resources are closed
    try {
        if (ps != null) ps.close();
        if (conn != null) conn.close();
    } catch (SQLException e) {
        e.printStackTrace();
    }
}
        }else if(txtName.getText().equals("No student found")){
            JOptionPane.showMessageDialog(null, "No student");
        
        }
    }//GEN-LAST:event_jPanel26MouseClicked

    private void jPanel24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel24MouseClicked
        // TODO add your handling code here:
       if(pc18.getBackground().equals(RED)){
        
        JOptionPane.showMessageDialog(null, "Seat Already Taken");
        }else if (pc18.getBackground().equals(GREEN)){
           String p18 = txtName.getText();
        txt18.setText(p18);
        String i = txtSid.getText();
            i18.setText(i);
        try {
    conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/crudv2_db", "root", "");
    ps = conn.prepareStatement("INSERT INTO logs (account_id, seat_plan_id, student_info_id, studentID, date, time_in, seat) VALUES (?,?,?,?,?,?,?)");

    // Set String values
    ps.setString(1, txtAccIdd.getText());
    ps.setString(2, lblSeatId.getText());
    ps.setString(3, txtSid.getText());
    ps.setString(4, txtStudId.getText());

    // Convert and set Date
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd"); // Adjust format as per your date format
    java.util.Date utilDate = dateFormat.parse(lblDate.getText());
    java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
    ps.setDate(5, sqlDate);

    // Convert and set Time (Only Time, without Date)
    SimpleDateFormat timeFormat = new SimpleDateFormat("HH-mm-ss"); // Adjust format as per your time format
    java.util.Date utilTime = timeFormat.parse(lblTime.getText());
    java.sql.Time sqlTime = new java.sql.Time(utilTime.getTime());
    ps.setTime(6, sqlTime);

    // Set other String value
    ps.setString(7, pc18.getText());

    ps.executeUpdate();

    txtStudId.setText("");
    txtName.setText("");
    txtSid.setText("");
} catch (SQLException | ParseException ex) {
    Logger.getLogger(Homepage.class.getName()).log(Level.SEVERE, null, ex);
} finally {
    // Ensure resources are closed
    try {
        if (ps != null) ps.close();
        if (conn != null) conn.close();
    } catch (SQLException e) {
        e.printStackTrace();
    }
}
        }else if(txtName.getText().equals("No student found")){
            JOptionPane.showMessageDialog(null, "No student");
        
        }
    }//GEN-LAST:event_jPanel24MouseClicked

    private void jPanel27MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel27MouseClicked
        // TODO add your handling code here:
        if(pc19.getBackground().equals(RED)){
        
        JOptionPane.showMessageDialog(null, "Seat Already Taken");
        }else if (pc19.getBackground().equals(GREEN)){
           String p19 = txtName.getText();
        txt19.setText(p19);
        String i = txtSid.getText();
            i19.setText(i);
         try {
    conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/crudv2_db", "root", "");
    ps = conn.prepareStatement("INSERT INTO logs (account_id, seat_plan_id, student_info_id, studentID, date, time_in, seat) VALUES (?,?,?,?,?,?,?)");

    // Set String values
    ps.setString(1, txtAccIdd.getText());
    ps.setString(2, lblSeatId.getText());
    ps.setString(3, txtSid.getText());
    ps.setString(4, txtStudId.getText());

    // Convert and set Date
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd"); // Adjust format as per your date format
    java.util.Date utilDate = dateFormat.parse(lblDate.getText());
    java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
    ps.setDate(5, sqlDate);

    // Convert and set Time (Only Time, without Date)
    SimpleDateFormat timeFormat = new SimpleDateFormat("HH-mm-ss"); // Adjust format as per your time format
    java.util.Date utilTime = timeFormat.parse(lblTime.getText());
    java.sql.Time sqlTime = new java.sql.Time(utilTime.getTime());
    ps.setTime(6, sqlTime);

    // Set other String value
    ps.setString(7, pc19.getText());

    ps.executeUpdate();

    txtStudId.setText("");
    txtName.setText("");
    txtSid.setText("");
} catch (SQLException | ParseException ex) {
    Logger.getLogger(Homepage.class.getName()).log(Level.SEVERE, null, ex);
} finally {
    // Ensure resources are closed
    try {
        if (ps != null) ps.close();
        if (conn != null) conn.close();
    } catch (SQLException e) {
        e.printStackTrace();
    }
}
        }else if(txtName.getText().equals("No student found")){
            JOptionPane.showMessageDialog(null, "No student");
        
        }
    }//GEN-LAST:event_jPanel27MouseClicked

    private void jPanel25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel25MouseClicked
        // TODO add your handling code here:
        if(pc20.getBackground().equals(RED)){
        
        JOptionPane.showMessageDialog(null, "Seat Already Taken");
        }else if (pc20.getBackground().equals(GREEN)){
           String p20 = txtName.getText();
        txt20.setText(p20);
        String i = txtSid.getText();
            i20.setText(i);
         try {
    conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/crudv2_db", "root", "");
    ps = conn.prepareStatement("INSERT INTO logs (account_id, seat_plan_id, student_info_id, studentID, date, time_in, seat) VALUES (?,?,?,?,?,?,?)");

    // Set String values
    ps.setString(1, txtAccIdd.getText());
    ps.setString(2, lblSeatId.getText());
    ps.setString(3, txtSid.getText());
    ps.setString(4, txtStudId.getText());

    // Convert and set Date
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd"); // Adjust format as per your date format
    java.util.Date utilDate = dateFormat.parse(lblDate.getText());
    java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
    ps.setDate(5, sqlDate);

    // Convert and set Time (Only Time, without Date)
    SimpleDateFormat timeFormat = new SimpleDateFormat("HH-mm-ss"); // Adjust format as per your time format
    java.util.Date utilTime = timeFormat.parse(lblTime.getText());
    java.sql.Time sqlTime = new java.sql.Time(utilTime.getTime());
    ps.setTime(6, sqlTime);

    // Set other String value
    ps.setString(7, pc20.getText());

    ps.executeUpdate();

    txtStudId.setText("");
    txtName.setText("");
    txtSid.setText("");
} catch (SQLException | ParseException ex) {
    Logger.getLogger(Homepage.class.getName()).log(Level.SEVERE, null, ex);
} finally {
    // Ensure resources are closed
    try {
        if (ps != null) ps.close();
        if (conn != null) conn.close();
    } catch (SQLException e) {
        e.printStackTrace();
    }
}
        }else if(txtName.getText().equals("No student found")){
            JOptionPane.showMessageDialog(null, "No student");
        
        }
    }//GEN-LAST:event_jPanel25MouseClicked

    private void jPanel29MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel29MouseClicked
        // TODO add your handling code here:
       if(pc30.getBackground().equals(RED)){
        
        JOptionPane.showMessageDialog(null, "Seat Already Taken");
        }else if (pc30.getBackground().equals(GREEN)){
           String p30 = txtName.getText();
        txt30.setText(p30);
        String i = txtSid.getText();
            i30.setText(i);
         try {
    conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/crudv2_db", "root", "");
    ps = conn.prepareStatement("INSERT INTO logs (account_id, seat_plan_id, student_info_id, studentID, date, time_in, seat) VALUES (?,?,?,?,?,?,?)");

    // Set String values
    ps.setString(1, txtAccIdd.getText());
    ps.setString(2, lblSeatId.getText());
    ps.setString(3, txtSid.getText());
    ps.setString(4, txtStudId.getText());

    // Convert and set Date
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd"); // Adjust format as per your date format
    java.util.Date utilDate = dateFormat.parse(lblDate.getText());
    java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
    ps.setDate(5, sqlDate);

    // Convert and set Time (Only Time, without Date)
    SimpleDateFormat timeFormat = new SimpleDateFormat("HH-mm-ss"); // Adjust format as per your time format
    java.util.Date utilTime = timeFormat.parse(lblTime.getText());
    java.sql.Time sqlTime = new java.sql.Time(utilTime.getTime());
    ps.setTime(6, sqlTime);

    // Set other String value
    ps.setString(7, pc30.getText());

    ps.executeUpdate();

    txtStudId.setText("");
    txtName.setText("");
    txtSid.setText("");
} catch (SQLException | ParseException ex) {
    Logger.getLogger(Homepage.class.getName()).log(Level.SEVERE, null, ex);
} finally {
    // Ensure resources are closed
    try {
        if (ps != null) ps.close();
        if (conn != null) conn.close();
    } catch (SQLException e) {
        e.printStackTrace();
    }
}
        }else if(txtName.getText().equals("No student found")){
            JOptionPane.showMessageDialog(null, "No student");
        
        }
    }//GEN-LAST:event_jPanel29MouseClicked

    private void jPanel31MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel31MouseClicked
        // TODO add your handling code here:
        if(pc29.getBackground().equals(RED)){
        
        JOptionPane.showMessageDialog(null, "Seat Already Taken");
        }else if (pc29.getBackground().equals(GREEN)){
           String p29 = txtName.getText();
        txt29.setText(p29);
        String i = txtSid.getText();
            i29.setText(i);
        try {
    conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/crudv2_db", "root", "");
    ps = conn.prepareStatement("INSERT INTO logs (account_id, seat_plan_id, student_info_id, studentID, date, time_in, seat) VALUES (?,?,?,?,?,?,?)");

    // Set String values
    ps.setString(1, txtAccIdd.getText());
    ps.setString(2, lblSeatId.getText());
    ps.setString(3, txtSid.getText());
    ps.setString(4, txtStudId.getText());

    // Convert and set Date
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd"); // Adjust format as per your date format
    java.util.Date utilDate = dateFormat.parse(lblDate.getText());
    java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
    ps.setDate(5, sqlDate);

    // Convert and set Time (Only Time, without Date)
    SimpleDateFormat timeFormat = new SimpleDateFormat("HH-mm-ss"); // Adjust format as per your time format
    java.util.Date utilTime = timeFormat.parse(lblTime.getText());
    java.sql.Time sqlTime = new java.sql.Time(utilTime.getTime());
    ps.setTime(6, sqlTime);

    // Set other String value
    ps.setString(7, pc29.getText());

    ps.executeUpdate();

    txtStudId.setText("");
    txtName.setText("");
    txtSid.setText("");
} catch (SQLException | ParseException ex) {
    Logger.getLogger(Homepage.class.getName()).log(Level.SEVERE, null, ex);
} finally {
    // Ensure resources are closed
    try {
        if (ps != null) ps.close();
        if (conn != null) conn.close();
    } catch (SQLException e) {
        e.printStackTrace();
    }
}
        }else if(txtName.getText().equals("No student found")){
            JOptionPane.showMessageDialog(null, "No student");
        
        }
    }//GEN-LAST:event_jPanel31MouseClicked

    private void jPanel28MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel28MouseClicked
        // TODO add your handling code here:
        if(pc28.getBackground().equals(RED)){
        
        JOptionPane.showMessageDialog(null, "Seat Already Taken");
        }else if (pc28.getBackground().equals(GREEN)){
           String p28 = txtName.getText();
        txt28.setText(p28);
        String i = txtSid.getText();
            i28.setText(i);
         try {
    conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/crudv2_db", "root", "");
    ps = conn.prepareStatement("INSERT INTO logs (account_id, seat_plan_id, student_info_id, studentID, date, time_in, seat) VALUES (?,?,?,?,?,?,?)");

    // Set String values
    ps.setString(1, txtAccIdd.getText());
    ps.setString(2, lblSeatId.getText());
    ps.setString(3, txtSid.getText());
    ps.setString(4, txtStudId.getText());

    // Convert and set Date
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd"); // Adjust format as per your date format
    java.util.Date utilDate = dateFormat.parse(lblDate.getText());
    java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
    ps.setDate(5, sqlDate);

    // Convert and set Time (Only Time, without Date)
    SimpleDateFormat timeFormat = new SimpleDateFormat("HH-mm-ss"); // Adjust format as per your time format
    java.util.Date utilTime = timeFormat.parse(lblTime.getText());
    java.sql.Time sqlTime = new java.sql.Time(utilTime.getTime());
    ps.setTime(6, sqlTime);

    // Set other String value
    ps.setString(7, pc28.getText());

    ps.executeUpdate();

    txtStudId.setText("");
    txtName.setText("");
    txtSid.setText("");
} catch (SQLException | ParseException ex) {
    Logger.getLogger(Homepage.class.getName()).log(Level.SEVERE, null, ex);
} finally {
    // Ensure resources are closed
    try {
        if (ps != null) ps.close();
        if (conn != null) conn.close();
    } catch (SQLException e) {
        e.printStackTrace();
    }
}
        }else if(txtName.getText().equals("No student found")){
            JOptionPane.showMessageDialog(null, "No student");
        
        }
        
    }//GEN-LAST:event_jPanel28MouseClicked

    private void jPanel30MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel30MouseClicked
        // TODO add your handling code here:
        if(pc27.getBackground().equals(RED)){
        
        JOptionPane.showMessageDialog(null, "Seat Already Taken");
        }else if (pc27.getBackground().equals(GREEN)){
           String p27 = txtName.getText();
        txt27.setText(p27);
        String i = txtSid.getText();
            i27.setText(i);
         try {
    conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/crudv2_db", "root", "");
    ps = conn.prepareStatement("INSERT INTO logs (account_id, seat_plan_id, student_info_id, studentID, date, time_in, seat) VALUES (?,?,?,?,?,?,?)");

    // Set String values
    ps.setString(1, txtAccIdd.getText());
    ps.setString(2, lblSeatId.getText());
    ps.setString(3, txtSid.getText());
    ps.setString(4, txtStudId.getText());

    // Convert and set Date
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd"); // Adjust format as per your date format
    java.util.Date utilDate = dateFormat.parse(lblDate.getText());
    java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
    ps.setDate(5, sqlDate);

    // Convert and set Time (Only Time, without Date)
    SimpleDateFormat timeFormat = new SimpleDateFormat("HH-mm-ss"); // Adjust format as per your time format
    java.util.Date utilTime = timeFormat.parse(lblTime.getText());
    java.sql.Time sqlTime = new java.sql.Time(utilTime.getTime());
    ps.setTime(6, sqlTime);

    // Set other String value
    ps.setString(7, pc27.getText());

    ps.executeUpdate();

    txtStudId.setText("");
    txtName.setText("");
    txtSid.setText("");
} catch (SQLException | ParseException ex) {
    Logger.getLogger(Homepage.class.getName()).log(Level.SEVERE, null, ex);
} finally {
    // Ensure resources are closed
    try {
        if (ps != null) ps.close();
        if (conn != null) conn.close();
    } catch (SQLException e) {
        e.printStackTrace();
    }
}
        }else if(txtName.getText().equals("No student found")){
            JOptionPane.showMessageDialog(null, "No student");
        
        }
    }//GEN-LAST:event_jPanel30MouseClicked

    private void jPanel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel19MouseClicked
        // TODO add your handling code here:
        if(pc26.getBackground().equals(RED)){
        
        JOptionPane.showMessageDialog(null, "Seat Already Taken");
        }else if (pc26.getBackground().equals(GREEN)){
           String p26 = txtName.getText();
        txt26.setText(p26);
        String i = txtSid.getText();
            i26.setText(i);
         try {
    conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/crudv2_db", "root", "");
    ps = conn.prepareStatement("INSERT INTO logs (account_id, seat_plan_id, student_info_id, studentID, date, time_in, seat) VALUES (?,?,?,?,?,?,?)");

    // Set String values
    ps.setString(1, txtAccIdd.getText());
    ps.setString(2, lblSeatId.getText());
    ps.setString(3, txtSid.getText());
    ps.setString(4, txtStudId.getText());

    // Convert and set Date
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd"); // Adjust format as per your date format
    java.util.Date utilDate = dateFormat.parse(lblDate.getText());
    java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
    ps.setDate(5, sqlDate);

    // Convert and set Time (Only Time, without Date)
    SimpleDateFormat timeFormat = new SimpleDateFormat("HH-mm-ss"); // Adjust format as per your time format
    java.util.Date utilTime = timeFormat.parse(lblTime.getText());
    java.sql.Time sqlTime = new java.sql.Time(utilTime.getTime());
    ps.setTime(6, sqlTime);

    // Set other String value
    ps.setString(7, pc26.getText());

    ps.executeUpdate();

    txtStudId.setText("");
    txtName.setText("");
    txtSid.setText("");
} catch (SQLException | ParseException ex) {
    Logger.getLogger(Homepage.class.getName()).log(Level.SEVERE, null, ex);
} finally {
    // Ensure resources are closed
    try {
        if (ps != null) ps.close();
        if (conn != null) conn.close();
    } catch (SQLException e) {
        e.printStackTrace();
    }
}
        }else if(txtName.getText().equals("No student found")){
            JOptionPane.showMessageDialog(null, "No student");
        
        }
    }//GEN-LAST:event_jPanel19MouseClicked

    private void jPanel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel18MouseClicked
        // TODO add your handling code here:
        if(pc25.getBackground().equals(RED)){
        
        JOptionPane.showMessageDialog(null, "Seat Already Taken");
        }else if (pc25.getBackground().equals(GREEN)){
           String p25 = txtName.getText();
        txt25.setText(p25);
        String i = txtSid.getText();
            i25.setText(i);
         try {
    conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/crudv2_db", "root", "");
    ps = conn.prepareStatement("INSERT INTO logs (account_id, seat_plan_id, student_info_id, studentID, date, time_in, seat) VALUES (?,?,?,?,?,?,?)");

    // Set String values
    ps.setString(1, txtAccIdd.getText());
    ps.setString(2, lblSeatId.getText());
    ps.setString(3, txtSid.getText());
    ps.setString(4, txtStudId.getText());

    // Convert and set Date
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd"); // Adjust format as per your date format
    java.util.Date utilDate = dateFormat.parse(lblDate.getText());
    java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
    ps.setDate(5, sqlDate);

    // Convert and set Time (Only Time, without Date)
    SimpleDateFormat timeFormat = new SimpleDateFormat("HH-mm-ss"); // Adjust format as per your time format
    java.util.Date utilTime = timeFormat.parse(lblTime.getText());
    java.sql.Time sqlTime = new java.sql.Time(utilTime.getTime());
    ps.setTime(6, sqlTime);

    // Set other String value
    ps.setString(7, pc25.getText());

    ps.executeUpdate();

    txtStudId.setText("");
    txtName.setText("");
    txtSid.setText("");
} catch (SQLException | ParseException ex) {
    Logger.getLogger(Homepage.class.getName()).log(Level.SEVERE, null, ex);
} finally {
    // Ensure resources are closed
    try {
        if (ps != null) ps.close();
        if (conn != null) conn.close();
    } catch (SQLException e) {
        e.printStackTrace();
    }
}
        }else if(txtName.getText().equals("No student found")){
            JOptionPane.showMessageDialog(null, "No student");
        
        }
    }//GEN-LAST:event_jPanel18MouseClicked

    private void jPanel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel15MouseClicked
        // TODO add your handling code here:
        if(pc24.getBackground().equals(RED)){
        
        JOptionPane.showMessageDialog(null, "Seat Already Taken");
        }else if (pc24.getBackground().equals(GREEN)){
           String p24 = txtName.getText();
        txt24.setText(p24);
        String i = txtSid.getText();
            i24.setText(i);
         try {
    conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/crudv2_db", "root", "");
    ps = conn.prepareStatement("INSERT INTO logs (account_id, seat_plan_id, student_info_id, studentID, date, time_in, seat) VALUES (?,?,?,?,?,?,?)");

    // Set String values
    ps.setString(1, txtAccIdd.getText());
    ps.setString(2, lblSeatId.getText());
    ps.setString(3, txtSid.getText());
    ps.setString(4, txtStudId.getText());

    // Convert and set Date
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd"); // Adjust format as per your date format
    java.util.Date utilDate = dateFormat.parse(lblDate.getText());
    java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
    ps.setDate(5, sqlDate);

    // Convert and set Time (Only Time, without Date)
    SimpleDateFormat timeFormat = new SimpleDateFormat("HH-mm-ss"); // Adjust format as per your time format
    java.util.Date utilTime = timeFormat.parse(lblTime.getText());
    java.sql.Time sqlTime = new java.sql.Time(utilTime.getTime());
    ps.setTime(6, sqlTime);

    // Set other String value
    ps.setString(7, pc24.getText());

    ps.executeUpdate();

    txtStudId.setText("");
    txtName.setText("");
    txtSid.setText("");
} catch (SQLException | ParseException ex) {
    Logger.getLogger(Homepage.class.getName()).log(Level.SEVERE, null, ex);
} finally {
    // Ensure resources are closed
    try {
        if (ps != null) ps.close();
        if (conn != null) conn.close();
    } catch (SQLException e) {
        e.printStackTrace();
    }
}
        }else if(txtName.getText().equals("No student found")){
            JOptionPane.showMessageDialog(null, "No student");
        
        }
    }//GEN-LAST:event_jPanel15MouseClicked

    private void jPanel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel14MouseClicked
        // TODO add your handling code here
        if(pc23.getBackground().equals(RED)){
        
        JOptionPane.showMessageDialog(null, "Seat Already Taken");
        }else if (pc23.getBackground().equals(GREEN)){
           String p23 = txtName.getText();
        txt23.setText(p23);
        String i = txtSid.getText();
            i23.setText(i);
         try {
    conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/crudv2_db", "root", "");
    ps = conn.prepareStatement("INSERT INTO logs (account_id, seat_plan_id, student_info_id, studentID, date, time_in, seat) VALUES (?,?,?,?,?,?,?)");

    // Set String values
    ps.setString(1, txtAccIdd.getText());
    ps.setString(2, lblSeatId.getText());
    ps.setString(3, txtSid.getText());
    ps.setString(4, txtStudId.getText());

    // Convert and set Date
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd"); // Adjust format as per your date format
    java.util.Date utilDate = dateFormat.parse(lblDate.getText());
    java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
    ps.setDate(5, sqlDate);

    // Convert and set Time (Only Time, without Date)
    SimpleDateFormat timeFormat = new SimpleDateFormat("HH-mm-ss"); // Adjust format as per your time format
    java.util.Date utilTime = timeFormat.parse(lblTime.getText());
    java.sql.Time sqlTime = new java.sql.Time(utilTime.getTime());
    ps.setTime(6, sqlTime);

    // Set other String value
    ps.setString(7, pc23.getText());

    ps.executeUpdate();

    txtStudId.setText("");
    txtName.setText("");
    txtSid.setText("");
} catch (SQLException | ParseException ex) {
    Logger.getLogger(Homepage.class.getName()).log(Level.SEVERE, null, ex);
} finally {
    // Ensure resources are closed
    try {
        if (ps != null) ps.close();
        if (conn != null) conn.close();
    } catch (SQLException e) {
        e.printStackTrace();
    }
}
        }else if(txtName.getText().equals("No student found")){
            JOptionPane.showMessageDialog(null, "No student");
        
        }
    }//GEN-LAST:event_jPanel14MouseClicked

    private void jPanel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel13MouseClicked
        // TODO add your handling code here:
        if(pc22.getBackground().equals(RED)){
        
        JOptionPane.showMessageDialog(null, "Seat Already Taken");
        }else if (pc22.getBackground().equals(GREEN)){
           String p22 = txtName.getText();
        txt22.setText(p22);
        String i = txtSid.getText();
            i22.setText(i);
         try {
    conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/crudv2_db", "root", "");
    ps = conn.prepareStatement("INSERT INTO logs (account_id, seat_plan_id, student_info_id, studentID, date, time_in, seat) VALUES (?,?,?,?,?,?,?)");

    // Set String values
    ps.setString(1, txtAccIdd.getText());
    ps.setString(2, lblSeatId.getText());
    ps.setString(3, txtSid.getText());
    ps.setString(4, txtStudId.getText());

    // Convert and set Date
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd"); // Adjust format as per your date format
    java.util.Date utilDate = dateFormat.parse(lblDate.getText());
    java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
    ps.setDate(5, sqlDate);

    // Convert and set Time (Only Time, without Date)
    SimpleDateFormat timeFormat = new SimpleDateFormat("HH-mm-ss"); // Adjust format as per your time format
    java.util.Date utilTime = timeFormat.parse(lblTime.getText());
    java.sql.Time sqlTime = new java.sql.Time(utilTime.getTime());
    ps.setTime(6, sqlTime);

    // Set other String value
    ps.setString(7, pc22.getText());

    ps.executeUpdate();

    txtStudId.setText("");
    txtName.setText("");
    txtSid.setText("");
} catch (SQLException | ParseException ex) {
    Logger.getLogger(Homepage.class.getName()).log(Level.SEVERE, null, ex);
} finally {
    // Ensure resources are closed
    try {
        if (ps != null) ps.close();
        if (conn != null) conn.close();
    } catch (SQLException e) {
        e.printStackTrace();
    }
}
        }else if(txtName.getText().equals("No student found")){
            JOptionPane.showMessageDialog(null, "No student");
        
        }
    }//GEN-LAST:event_jPanel13MouseClicked

    private void jPanel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel12MouseClicked
        // TODO add your handling code here:
        if(pc21.getBackground().equals(RED)){
        
        JOptionPane.showMessageDialog(null, "Seat Already Taken");
        }else if (pc21.getBackground().equals(GREEN)){
           String p21 = txtName.getText();
        txt21.setText(p21);
        String i = txtSid.getText();
            i21.setText(i);
         try {
    conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/crudv2_db", "root", "");
    ps = conn.prepareStatement("INSERT INTO logs (account_id, seat_plan_id, student_info_id, studentID, date, time_in, seat) VALUES (?,?,?,?,?,?,?)");

    // Set String values
    ps.setString(1, txtAccIdd.getText());
    ps.setString(2, lblSeatId.getText());
    ps.setString(3, txtSid.getText());
    ps.setString(4, txtStudId.getText());

    // Convert and set Date
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd"); // Adjust format as per your date format
    java.util.Date utilDate = dateFormat.parse(lblDate.getText());
    java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
    ps.setDate(5, sqlDate);

    // Convert and set Time (Only Time, without Date)
    SimpleDateFormat timeFormat = new SimpleDateFormat("HH-mm-ss"); // Adjust format as per your time format
    java.util.Date utilTime = timeFormat.parse(lblTime.getText());
    java.sql.Time sqlTime = new java.sql.Time(utilTime.getTime());
    ps.setTime(6, sqlTime);

    // Set other String value
    ps.setString(7, pc21.getText());

    ps.executeUpdate();

    txtStudId.setText("");
    txtName.setText("");
    txtSid.setText("");
} catch (SQLException | ParseException ex) {
    Logger.getLogger(Homepage.class.getName()).log(Level.SEVERE, null, ex);
} finally {
    // Ensure resources are closed
    try {
        if (ps != null) ps.close();
        if (conn != null) conn.close();
    } catch (SQLException e) {
        e.printStackTrace();
    }
}
        }else if(txtName.getText().equals("No student found")){
            JOptionPane.showMessageDialog(null, "No student");
        
        }
    }//GEN-LAST:event_jPanel12MouseClicked

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
       
        try {
    conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/crudv2_db", "root", "");
    ps = conn.prepareStatement("SELECT * FROM seat_plan WHERE seat_plan_id=1");
    rs = ps.executeQuery();
    
    if (rs.next()) {
        ps = conn.prepareStatement("UPDATE `seat_plan` SET `account_id`=?,`pc1_name1`=?, `pc2_name2`=?, `pc3_name3`=?, `pc4_name4`=?, `pc5_name5`=?, `pc6_name6`=?, `pc7_name7`=?, `pc8_name8`=?, `pc9_name9`=?, `pc10_name10`=?, `pc11_name11`=?, `pc12_name12`=?, `pc13_name13`=?, `pc14_name14`=?, `pc15_name15`=?, `pc16_name16`=?, `pc17_name17`=?, `pc18_name18`=?, `pc19_name19`=?, `pc20_name20`=?, `pc21_name21`=?, `pc22_name22`=?, `pc23_name23`=?, `pc24_name24`=?, `pc25_name25`=?, `pc26_name26`=?, `pc27_name27`=?, `pc28_name28`=?, `pc29_name29`=?, `pc30_name30`=? WHERE seat_plan_id=1");
    } else {
        ps = conn.prepareStatement("INSERT INTO `seat_plan` (`account_id`,`pc1_name1`, `pc2_name2`, `pc3_name3`, `pc4_name4`, `pc5_name5`, `pc6_name6`, `pc7_name7`, `pc8_name8`, `pc9_name9`, `pc10_name10`, `pc11_name11`, `pc12_name12`, `pc13_name13`, `pc14_name14`, `pc15_name15`, `pc16_name16`, `pc17_name17`, `pc18_name18`, `pc19_name19`, `pc20_name20`, `pc21_name21`, `pc22_name22`, `pc23_name23`, `pc24_name24`, `pc25_name25`, `pc26_name26`, `pc27_name27`, `pc28_name28`, `pc29_name29`, `pc30_name30`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
    }

    // Set parameters and execute
     {
        //ps.setString(i, getTextFieldValue(i)); // Replace with actual method to get text values
        ps.setString(1,(txtAccIdd.getText()));
        ps.setString(2,(txt1.getText()));
        ps.setString(3,(txt2.getText()));
        ps.setString(4,(txt3.getText()));
        ps.setString(5,(txt4.getText()));
        ps.setString(6,(txt5.getText()));
        ps.setString(7,(txt6.getText()));
        ps.setString(8,(txt7.getText()));
        ps.setString(9,(txt8.getText()));
        ps.setString(10,(txt9.getText()));
        ps.setString(11,(txt10.getText()));
        ps.setString(12,(txt11.getText()));
        ps.setString(13,(txt12.getText()));
        ps.setString(14,(txt13.getText()));
        ps.setString(15,(txt14.getText()));
        ps.setString(16,(txt15.getText()));
        ps.setString(17,(txt16.getText()));
        ps.setString(18,(txt17.getText()));
        ps.setString(19,(txt18.getText()));
        ps.setString(20,(txt19.getText()));
        ps.setString(21,(txt20.getText()));
        ps.setString(22,(txt21.getText()));
        ps.setString(23,(txt22.getText()));
        ps.setString(24,(txt23.getText()));
        ps.setString(25,(txt24.getText()));
        ps.setString(26,(txt25.getText()));
        ps.setString(27,(txt26.getText()));
        ps.setString(28,(txt27.getText()));
        ps.setString(29,(txt28.getText()));
        ps.setString(30,(txt29.getText()));
        ps.setString(31,(txt30.getText()));
    }
    ps.executeUpdate();

    txtStudId.setText("");
    txtName.setText("");
    txtSid.setText("");
    JOptionPane.showMessageDialog(null, "Success");
    updateColor();

} catch (SQLException ex) {
    Logger.getLogger(Homepage.class.getName()).log(Level.SEVERE, null, ex);
} finally {
    try {
        if (rs != null) rs.close();
        if (ps != null) ps.close();
        if (conn != null) conn.close();
    } catch (SQLException e) {
        Logger.getLogger(Homepage.class.getName()).log(Level.SEVERE, null, e);
    }
}
    }//GEN-LAST:event_btnSaveActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         String msg=lblRole.getText();
          new Barcode(msg).setVisible(true);
            setVisible(false); 
    }//GEN-LAST:event_jButton2ActionPerformed
    
    public void loadstudentdetails()
    {
        try {
            // Initialize connection
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/crudv2_db", "root", "");
            
            // Prepare SQL statement
            ps = conn.prepareStatement("SELECT * FROM student_info WHERE studentID = ?");
            ps.setString(1, txtStudId.getText());
            
            // Execute query
            rs = ps.executeQuery();
            
            if (rs.next()) { // Check if the result set has a row
                
                String name = rs.getString("name");
                String id = rs.getString("student_info_id");
                
                txtName.setText(name);
                txtSid.setText(id);
               
                search_if_exist_or_not();
            } else {
                // No result found
                txtName.setText("");
                txtSid.setText("");
            }
          
            
        } catch (SQLException ex) {
            Logger.getLogger(Homepage.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            // Clean up resources
            try {
                if (rs != null) rs.close();
                if (ps != null) ps.close();
                if (conn != null) conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(Homepage.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    private void search_if_exist_or_not() {
        
   if(!txt1.getText().equals(txtName.getText()))
   {
       
       if(!txt2.getText().equals(txtName.getText()))
       {
           if(!txt3.getText().equals(txtName.getText()))
           {
               if(!txt4.getText().equals(txtName.getText()))
               {
                   if(!txt5.getText().equals(txtName.getText()))
                   {
                       if(!txt6.getText().equals(txtName.getText()))
                       {
                           if(!txt7.getText().equals(txtName.getText()))
                           {
                               if(!txt8.getText().equals(txtName.getText()))
                               {
                                   if(!txt9.getText().equals(txtName.getText()))
                                   {
                                       if(!txt10.getText().equals(txtName.getText()))
                                       {
                                           if(!txt11.getText().equals(txtName.getText()))
                                           {
                                               if(!txt12.getText().equals(txtName.getText()))
                                               {
                                                   if(!txt13.getText().equals(txtName.getText()))
                                                   {
                                                       if(!txt14.getText().equals(txtName.getText()))
                                                       {
                                                           if(!txt15.getText().equals(txtName.getText()))
                                                           {
                                                               if(!txt16.getText().equals(txtName.getText()))
                                                               {
                                                                   if(!txt17.getText().equals(txtName.getText()))
                                                                   {
                                                                       if(!txt18.getText().equals(txtName.getText()))
                                                                       {
                                                                           if(!txt19.getText().equals(txtName.getText()))
                                                                           {
                                                                               if(!txt20.getText().equals(txtName.getText()))
                                                                               {
                                                                                   if(!txt21.getText().equals(txtName.getText()))
                                                                                   {
                                                                                       if(!txt22.getText().equals(txtName.getText()))
                                                                                       {
                                                                                           if(!txt23.getText().equals(txtName.getText()))
                                                                                           {
                                                                                               if(!txt24.getText().equals(txtName.getText()))
                                                                                               {
                                                                                                   if(!txt25.getText().equals(txtName.getText()))
                                                                                                   {
                                                                                                       if(!txt26.getText().equals(txtName.getText()))
                                                                                                       {
                                                                                                           if(!txt27.getText().equals(txtName.getText()))
                                                                                                           {
                                                                                                               if(!txt28.getText().equals(txtName.getText()))
                                                                                                               {
                                                                                                                   if(!txt29.getText().equals(txtName.getText()))
                                                                                                                   {
                                                                                                                       if(!txt30.getText().equals(txtName.getText()))
                                                                                                                       {
                   
                                                                                                                       }else
                                                                                                                       {
                                                                                                                        txt30.setText("");
                                                                                                                        updateSeatPlan();
                                                                                                                        loadstudentdetails();
                                                                                                                        updateColor();
                                                                                                                        updateTimeOut();
                                                                                                                        txtName.setText("");
        txtSid.setText("");
        txtStudId.setText("");
                                                                                                                       }
                                                                                                                    }else
                                                                                                                   {
                                                                                                                       txt29.setText("");
                                                                                                                        updateSeatPlan();
                                                                                                                        loadstudentdetails();
                                                                                                                        updateColor();
                                                                                                                        updateTimeOut();
                                                                                                                        txtName.setText("");
        txtSid.setText("");
        txtStudId.setText("");
                                                                                                                   }
                                                                                                                }else
                                                                                                               {
                                                                                                                txt28.setText("");
                                                                                                                updateSeatPlan();
                                                                                                                loadstudentdetails();
                                                                                                                updateColor();
                                                                                                                updateTimeOut();
                                                                                                                txtName.setText("");
        txtSid.setText("");
        txtStudId.setText("");
                                                                                                               }
                                                                                                            }else
                                                                                                           {
                                                                                                               txt27.setText("");
        updateSeatPlan();
        loadstudentdetails();
        updateColor();
        updateTimeOut();
        txtName.setText("");
        txtSid.setText("");
        txtStudId.setText("");
                                                                                                           }
                                        }else
                                                                                                       {
                                                                                                           txt26.setText("");
        updateSeatPlan();
        loadstudentdetails();
        updateColor();
        updateTimeOut();
        txtName.setText("");
        txtSid.setText("");
        txtStudId.setText("");
                                                                                                       }
                                        }else
                                                                                                   {
                                                                                                       txt25.setText("");
        updateSeatPlan();
        loadstudentdetails();
        updateColor();
        updateTimeOut();
        txtName.setText("");
        txtSid.setText("");
        txtStudId.setText("");
                                                                                                   }
                                        }else
                                                                                               {
                                                                                                  txt24.setText("");
        updateSeatPlan();
        loadstudentdetails();
        updateColor();
        updateTimeOut();
        txtName.setText("");
        txtSid.setText("");
        txtStudId.setText("");
                                                                                               }
                                        }else
                                                                                           {
                                                                                               txt23.setText("");
        updateSeatPlan();
        loadstudentdetails();
        updateColor();
        updateTimeOut();
        txtName.setText("");
        txtSid.setText("");
        txtStudId.setText("");
                                                                                           }
                                        }else
                                                                                       {
                                                                                           txt22.setText("");
        updateSeatPlan();
        loadstudentdetails();
        updateColor();
        updateTimeOut();
        txtName.setText("");
        txtSid.setText("");
        txtStudId.setText("");
                                                                                       }
                                        }else
                                                                                   {
                                                                                     txt21.setText("");
        updateSeatPlan();
        loadstudentdetails();
        updateColor();
        updateTimeOut();
        txtName.setText("");
        txtSid.setText("");
        txtStudId.setText("");
                                                                                   }
                                        }else
                                                                               {
                                                                                   txt20.setText("");
        updateSeatPlan();
        loadstudentdetails();
        updateColor();
        updateTimeOut();
        txtName.setText("");
        txtSid.setText("");
        txtStudId.setText("");
                                                                               }
                                        }else
                                                                           {
                                                                               txt19.setText("");
        updateSeatPlan();
        loadstudentdetails();
        updateColor();
        updateTimeOut();
        txtName.setText("");
        txtSid.setText("");
        txtStudId.setText("");
                                                                           }
                                        }else
                                                                       {
                                                                           txt18.setText("");
        updateSeatPlan();
        loadstudentdetails();
        updateColor();
        updateTimeOut();
        txtName.setText("");
        txtSid.setText("");
        txtStudId.setText("");
                                                                       }
                                        }else
                                                                   {
                                                                       txt17.setText("");
        updateSeatPlan();
        loadstudentdetails();
        updateColor();
        updateTimeOut();
        txtName.setText("");
        txtSid.setText("");
        txtStudId.setText("");
                                                                   }
                                        }else
                                                               {
                                                                   txt16.setText("");
        updateSeatPlan();
        loadstudentdetails();
        updateColor();
        updateTimeOut();
        txtName.setText("");
        txtSid.setText("");
        txtStudId.setText("");
                                                               }
                                        }else
                                                           {
                                                               txt15.setText("");
        updateSeatPlan();
        loadstudentdetails();
        updateColor();
        updateTimeOut();
        txtName.setText("");
        txtSid.setText("");
        txtStudId.setText("");
                                                           }
                                        }else
                                                       {
                                                           txt14.setText("");
        updateSeatPlan();
        loadstudentdetails();
        updateColor();
        updateTimeOut();
        txtName.setText("");
        txtSid.setText("");
        txtStudId.setText("");
                                                       }
                                        }else
                                                   {
                                                       txt13.setText("");
        updateSeatPlan();
        loadstudentdetails();
        updateColor();
        updateTimeOut();
        txtName.setText("");
        txtSid.setText("");
        txtStudId.setText("");
                                                   }
                                        }else
                                               {
                                                  txt12.setText("");
        updateSeatPlan();
        loadstudentdetails();
        updateColor();
        updateTimeOut();
        txtName.setText("");
        txtSid.setText("");
        txtStudId.setText("");
                                               }
                                        }else
                                           {
                                               txt11.setText("");
        updateSeatPlan();
        loadstudentdetails();
        updateColor();
        updateTimeOut();
        txtName.setText("");
        txtSid.setText("");
        txtStudId.setText("");
                                           }
                                        }else
                                       {
                                           txt10.setText("");
        updateSeatPlan();
        loadstudentdetails();
        updateColor();
        updateTimeOut();
        txtName.setText("");
        txtSid.setText("");
        txtStudId.setText("");
                                       }
                                    }else
                                   {
                                       txt9.setText("");
        updateSeatPlan();
        loadstudentdetails();
        updateColor();
        updateTimeOut();
        txtName.setText("");
        txtSid.setText("");
        txtStudId.setText("");
                                   }
                                }else
                               {
                                   txt8.setText("");
        updateSeatPlan();
        loadstudentdetails();
        updateColor();
        updateTimeOut();
        txtName.setText("");
        txtSid.setText("");
        txtStudId.setText("");
                               }
                            }else
                           {
                               txt7.setText("");
        updateSeatPlan();
        loadstudentdetails();
        updateColor();
        updateTimeOut();
        txtName.setText("");
        txtSid.setText("");
        txtStudId.setText("");
                           }
                        }else
                       {
                           txt6.setText("");
        updateSeatPlan();
        loadstudentdetails();
        updateColor();
        updateTimeOut();
        txtName.setText("");
        txtSid.setText("");
        txtStudId.setText("");
                       }
                   }else
                   {
                        txt5.setText("");
                        updateSeatPlan();
                        loadstudentdetails();
                        updateColor();
                        updateTimeOut();
                        txtName.setText("");
        txtSid.setText("");
        txtStudId.setText("");
                   }
               }else
               {
                    txt4.setText("");
                    updateSeatPlan();
                    loadstudentdetails();
                    updateColor();
                    updateTimeOut();
                    txtName.setText("");
        txtSid.setText("");
        txtStudId.setText("");
               }
           }else
           {
               txt3.setText("");
             updateSeatPlan();
             loadstudentdetails();
             updateColor();
             updateTimeOut();
             txtName.setText("");
        txtSid.setText("");
        txtStudId.setText("");
           }
       }else
       {
            txt2.setText("");
        updateSeatPlan();
        loadstudentdetails();
        updateColor();
        updateTimeOut();
        txtName.setText("");
        txtSid.setText("");
        txtStudId.setText("");
       }
   }else
   {
        txt1.setText("");
        updateSeatPlan();
        loadstudentdetails();   
        updateColor();
        updateTimeOut();
        txtName.setText("");
        txtSid.setText("");
        txtStudId.setText("");
   }
}
  private void updateSeatPlan() {
    try {
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/crudv2_db", "root", "");

        
        ps = conn.prepareStatement(
            "UPDATE seat_plan SET pc1_name1=?, pc2_name2=?, pc3_name3=?, pc4_name4=?, " +
            "pc5_name5=?, pc6_name6=?, pc7_name7=?, pc8_name8=?, pc9_name9=?, pc10_name10=?, " +
            "pc11_name11=?, pc12_name12=?, pc13_name13=?, pc14_name14=?, pc15_name15=?, " +
            "pc16_name16=?, pc17_name17=?, pc18_name18=?, pc19_name19=?, pc20_name20=?, " +
            "pc21_name21=?, pc22_name22=?, pc23_name23=?, pc24_name24=?, pc25_name25=?, " +
            "pc26_name26=?, pc27_name27=?, pc28_name28=?, pc29_name29=?, pc30_name30=? " +
            "WHERE seat_plan_id=1");

        // Set parameters from text fields
        JTextField[] textFields = {
            txt1, txt2, txt3, txt4, txt5, txt6, txt7, txt8, txt9, txt10,
            txt11, txt12, txt13, txt14, txt15, txt16, txt17, txt18, txt19, txt20,
            txt21, txt22, txt23, txt24, txt25, txt26, txt27, txt28, txt29, txt30
        };

        for (int i = 0; i < textFields.length; i++) {
            ps.setString(i + 1, textFields[i].getText());
            
        }

        // Execute the update
        ps.executeUpdate();
    } catch (SQLException ex) {
        Logger.getLogger(Homepage.class.getName()).log(Level.SEVERE, null, ex);
    } finally {
        // Clean up resources
        try {
            if (ps != null) ps.close();
            if (conn != null) conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(Homepage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
    
    private void updateColor(){
    if(txt1.getText().equals("")){
             pc1.setBackground(Color.green);
         }else{
             pc1.setBackground(Color.red);
         }
         if(txt2.getText().equals("")){
             pc2.setBackground(Color.green);
         }else{
             pc2.setBackground(Color.red);
         }
         if(txt3.getText().equals("")){
             pc3.setBackground(Color.green);
         }else{
             pc3.setBackground(Color.red);
         }if(txt4.getText().equals("")){
             pc4.setBackground(Color.green);
         }else{
             pc4.setBackground(Color.red);
         }if(txt5.getText().equals("")){
             pc5.setBackground(Color.green);
         }else{
             pc5.setBackground(Color.red);
         }if(txt6.getText().equals("")){
             pc6.setBackground(Color.green);
         }else{
             pc6.setBackground(Color.red);
         }if(txt7.getText().equals("")){
             pc7.setBackground(Color.green);
         }else{
             pc7.setBackground(Color.red);
         }if(txt8.getText().equals("")){
             pc8.setBackground(Color.green);
         }else{
             pc8.setBackground(Color.red);
         }if(txt9.getText().equals("")){
             pc9.setBackground(Color.green);
         }else{
             pc9.setBackground(Color.red);
         }if(txt10.getText().equals("")){
             pc10.setBackground(Color.green);
         }else{
             pc10.setBackground(Color.red);
         }if(txt11.getText().equals("")){
             pc11.setBackground(Color.green);
         }else{
             pc11.setBackground(Color.red);
         }if(txt12.getText().equals("")){
             pc12.setBackground(Color.green);
         }else{
             pc12.setBackground(Color.red);
         }if(txt13.getText().equals("")){
             pc13.setBackground(Color.green);
         }else{
             pc13.setBackground(Color.red);
         }if(txt14.getText().equals("")){
             pc14.setBackground(Color.green);
         }else{
             pc14.setBackground(Color.red);
         }if(txt15.getText().equals("")){
             pc15.setBackground(Color.green);
         }else{
             pc15.setBackground(Color.red);
         }if(txt16.getText().equals("")){
             pc16.setBackground(Color.green);
         }else{
             pc16.setBackground(Color.red);
         }if(txt17.getText().equals("")){
             pc17.setBackground(Color.green);
         }else{
             pc17.setBackground(Color.red);
         }if(txt18.getText().equals("")){
             pc18.setBackground(Color.green);
         }else{
             pc18.setBackground(Color.red);
         }if(txt19.getText().equals("")){
             pc19.setBackground(Color.green);
         }else{
             pc19.setBackground(Color.red);
         }if(txt20.getText().equals("")){
             pc20.setBackground(Color.green);
         }else{
             pc20.setBackground(Color.red);
         }if(txt21.getText().equals("")){
             pc21.setBackground(Color.green);
         }else{
             pc21.setBackground(Color.red);
         }if(txt22.getText().equals("")){
             pc22.setBackground(Color.green);
         }else{
             pc22.setBackground(Color.red);
         }if(txt23.getText().equals("")){
             pc23.setBackground(Color.green);
         }else{
             pc23.setBackground(Color.red);
         }if(txt24.getText().equals("")){
             pc24.setBackground(Color.green);
         }else{
             pc24.setBackground(Color.red);
         }if(txt25.getText().equals("")){
             pc25.setBackground(Color.green);
         }else{
             pc25.setBackground(Color.red);
         }if(txt26.getText().equals("")){
             pc26.setBackground(Color.green);
         }else{
             pc26.setBackground(Color.red);
         }if(txt27.getText().equals("")){
             pc27.setBackground(Color.green);
         }else{
             pc27.setBackground(Color.red);
         }if(txt28.getText().equals("")){
             pc28.setBackground(Color.green);
         }else{
             pc28.setBackground(Color.red);
         }if(txt29.getText().equals("")){
             pc29.setBackground(Color.green);
         }else{
             pc29.setBackground(Color.red);
         }if(txt30.getText().equals("")){
             pc30.setBackground(Color.green);
         }else{
             pc30.setBackground(Color.red);
         }
    
    }
    private void updateTimeOut() {
    

    try {
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/crudv2_db", "root", "");
        ps = conn.prepareStatement("UPDATE logs SET time_out=? WHERE student_info_id=? and date=?");

        // Parse and set the time_out (SQL Time)
        SimpleDateFormat timeFormat = new SimpleDateFormat("HH-mm-ss"); // Adjust format as per your time format
    java.util.Date utilTime = timeFormat.parse(lblTime.getText());
    java.sql.Time sqlTime = new java.sql.Time(utilTime.getTime());
    ps.setTime(1, sqlTime);

        // Set the student_info_id
        ps.setString(2, txtSid.getText()); // Correct index for student_info_id

        // Parse and set the date
         SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd"); // Adjust format as per your date format
    java.util.Date utilDate = dateFormat.parse(lblDate.getText());
    java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
    ps.setDate(3, sqlDate);
        
        ps.executeUpdate();
        
    } catch (SQLException ex) {
        Logger.getLogger(Homepage.class.getName()).log(Level.SEVERE, null, ex);
    } catch (ParseException ex) {
        Logger.getLogger(Homepage.class.getName()).log(Level.SEVERE, null, ex);
    } finally {
        // Close resources in the finally block
        try {
            if (ps != null) ps.close();
            if (conn != null) conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(Homepage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
    public void loadPicture()
    {
        String studentId = txtStudId.getText();
        ImageIcon icon = new ImageIcon("C:\\Users\\qr_monitor\\Documents\\NetBeansProjects\\CRUD\\src\\Pic\\"+studentId+".jpg");
        
        Image img = icon.getImage();
        Image imgscale = img.getScaledInstance(pic.getWidth(), pic.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaleIcon = new ImageIcon(imgscale);
        pic.setIcon(scaleIcon);
    }
    private static final Color GREEN = Color.green;
    private static final Color RED = Color.red;
    
    
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
            java.util.logging.Logger.getLogger(Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Homepage().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAccReg;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnLogs;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnStudReg;
    private javax.swing.JLabel i1;
    private javax.swing.JLabel i10;
    private javax.swing.JLabel i11;
    private javax.swing.JLabel i12;
    private javax.swing.JLabel i13;
    private javax.swing.JLabel i14;
    private javax.swing.JLabel i15;
    private javax.swing.JLabel i16;
    private javax.swing.JLabel i17;
    private javax.swing.JLabel i18;
    private javax.swing.JLabel i19;
    private javax.swing.JLabel i2;
    private javax.swing.JLabel i20;
    private javax.swing.JLabel i21;
    private javax.swing.JLabel i22;
    private javax.swing.JLabel i23;
    private javax.swing.JLabel i24;
    private javax.swing.JLabel i25;
    private javax.swing.JLabel i26;
    private javax.swing.JLabel i27;
    private javax.swing.JLabel i28;
    private javax.swing.JLabel i29;
    private javax.swing.JLabel i3;
    private javax.swing.JLabel i30;
    private javax.swing.JLabel i4;
    private javax.swing.JLabel i5;
    private javax.swing.JLabel i6;
    private javax.swing.JLabel i7;
    private javax.swing.JLabel i8;
    private javax.swing.JLabel i9;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblRole;
    private javax.swing.JLabel lblSeatId;
    private javax.swing.JLabel lblSid;
    private javax.swing.JLabel lblStudId;
    private javax.swing.JLabel lblTime;
    private javax.swing.JLabel pc1;
    private javax.swing.JLabel pc10;
    private javax.swing.JLabel pc11;
    private javax.swing.JLabel pc12;
    private javax.swing.JLabel pc13;
    private javax.swing.JLabel pc14;
    private javax.swing.JLabel pc15;
    private javax.swing.JLabel pc16;
    private javax.swing.JLabel pc17;
    private javax.swing.JLabel pc18;
    private javax.swing.JLabel pc19;
    private javax.swing.JLabel pc2;
    private javax.swing.JLabel pc20;
    private javax.swing.JLabel pc21;
    private javax.swing.JLabel pc22;
    private javax.swing.JLabel pc23;
    private javax.swing.JLabel pc24;
    private javax.swing.JLabel pc25;
    private javax.swing.JLabel pc26;
    private javax.swing.JLabel pc27;
    private javax.swing.JLabel pc28;
    private javax.swing.JLabel pc29;
    private javax.swing.JLabel pc3;
    private javax.swing.JLabel pc30;
    private javax.swing.JLabel pc4;
    private javax.swing.JLabel pc5;
    private javax.swing.JLabel pc6;
    private javax.swing.JLabel pc7;
    private javax.swing.JLabel pc8;
    private javax.swing.JLabel pc9;
    private javax.swing.JLabel pic;
    private javax.swing.JPanel pnl15;
    private javax.swing.JPanel pnlSeat;
    private javax.swing.JTextField txt1;
    private javax.swing.JTextField txt10;
    private javax.swing.JTextField txt11;
    private javax.swing.JTextField txt12;
    private javax.swing.JTextField txt13;
    private javax.swing.JTextField txt14;
    private javax.swing.JTextField txt15;
    private javax.swing.JTextField txt16;
    private javax.swing.JTextField txt17;
    private javax.swing.JTextField txt18;
    private javax.swing.JTextField txt19;
    private javax.swing.JTextField txt2;
    private javax.swing.JTextField txt20;
    private javax.swing.JTextField txt21;
    private javax.swing.JTextField txt22;
    private javax.swing.JTextField txt23;
    private javax.swing.JTextField txt24;
    private javax.swing.JTextField txt25;
    private javax.swing.JTextField txt26;
    private javax.swing.JTextField txt27;
    private javax.swing.JTextField txt28;
    private javax.swing.JTextField txt29;
    private javax.swing.JTextField txt3;
    private javax.swing.JTextField txt30;
    private javax.swing.JTextField txt4;
    private javax.swing.JTextField txt5;
    private javax.swing.JTextField txt6;
    private javax.swing.JTextField txt7;
    private javax.swing.JTextField txt8;
    private javax.swing.JTextField txt9;
    public static javax.swing.JTextField txtAccIdd;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtSid;
    private javax.swing.JTextField txtStudId;
    // End of variables declaration//GEN-END:variables
}
