import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import project.connectionProvider;
import java.util.Date;
import javax.swing.table.DefaultTableModel;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author nickh
 */
public class bill extends javax.swing.JFrame {
public int finalTotal=0;
    /**
     * Creates new form bill
     */
    public bill() {
        initComponents();
        SimpleDateFormat dFormat=new SimpleDateFormat("dd-MM-yyyy");
        Date date=new Date();
        jLabel3.setText(dFormat.format(date));
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalDateTime now=LocalDateTime.now();
        jLabel5.setText(dtf.format(now));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField9 = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 100));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/billng_logo-removebg-preview (1).png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 6, -1, 101));

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Date :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 10, 50, 20));

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1360, 10, 90, 20));

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Time :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 60, 50, 20));

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1360, 60, 90, 20));

        jSeparator1.setDoubleBuffered(true);
        jSeparator1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 113, 1581, -1));

        jLabel6.setFont(new java.awt.Font("Stencil", 2, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Buyer Details  :-");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 134, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Name");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 186, 67, -1));

        jTextField1.setBackground(new java.awt.Color(51, 51, 51));
        jTextField1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 183, 241, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Conatact No");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(408, 186, 101, -1));

        jTextField2.setBackground(new java.awt.Color(51, 51, 51));
        jTextField2.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(255, 255, 255));
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(541, 183, 203, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Email");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 180, 58, -1));

        jTextField3.setBackground(new java.awt.Color(51, 51, 51));
        jTextField3.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(255, 255, 255));
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 180, 220, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Address");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 180, 84, -1));

        jTextField4.setBackground(new java.awt.Color(51, 51, 51));
        jTextField4.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(255, 255, 255));
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 180, 220, -1));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 224, 1581, -1));

        jLabel11.setFont(new java.awt.Font("Stencil", 2, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Product details :-");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 245, 386, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Product ID");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 291, 111, -1));

        jTextField5.setBackground(new java.awt.Color(51, 51, 51));
        jTextField5.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(255, 255, 255));
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 288, 131, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Product Name");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(298, 291, 118, -1));

        jTextField6.setBackground(new java.awt.Color(51, 51, 51));
        jTextField6.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jTextField6.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(451, 288, 187, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Price");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(671, 291, 63, -1));

        jTextField7.setBackground(new java.awt.Color(51, 51, 51));
        jTextField7.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jTextField7.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 288, 107, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Quantity");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 290, 82, -1));

        jTextField8.setBackground(new java.awt.Color(51, 51, 51));
        jTextField8.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jTextField8.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 290, 106, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Description");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 290, 92, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add.png"))); // NOI18N
        jButton1.setText("ADD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1350, 330, -1, -1));

        jTextField9.setBackground(new java.awt.Color(51, 51, 51));
        jTextField9.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jTextField9.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 290, 240, -1));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 372, 1581, -1));

        jTable1.setBackground(new java.awt.Color(51, 51, 51));
        jTable1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTable1.setForeground(new java.awt.Color(255, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Description", "Price", "Quantity", "Total"
            }
        ));
        jTable1.setGridColor(new java.awt.Color(204, 204, 204));
        jTable1.setSelectionBackground(new java.awt.Color(51, 51, 51));
        jTable1.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 381, 795, 254));

        jLabel17.setFont(new java.awt.Font("Stencil", 2, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Calculation Details :-");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(813, 381, -1, 37));

        jLabel18.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Total");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(813, 440, 111, 28));

        jLabel19.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Paid Amount");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(813, 515, 111, 28));

        jLabel20.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Return Amount");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 590, 131, 27));

        jTextField10.setBackground(new java.awt.Color(51, 51, 51));
        jTextField10.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jTextField10.setForeground(new java.awt.Color(255, 255, 255));
        jTextField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField10ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1022, 443, 255, -1));

        jTextField11.setBackground(new java.awt.Color(51, 51, 51));
        jTextField11.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jTextField11.setForeground(new java.awt.Color(255, 255, 255));
        jTextField11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField11ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1022, 518, 255, -1));

        jTextField12.setBackground(new java.awt.Color(51, 51, 51));
        jTextField12.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jTextField12.setForeground(new java.awt.Color(255, 255, 255));
        jTextField12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField12ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 590, 255, -1));

        jButton2.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/save (1).png"))); // NOI18N
        jButton2.setText("Save");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1330, 440, 122, -1));

        jButton3.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reset-removebg-preview (1).png"))); // NOI18N
        jButton3.setText("Reset");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1330, 510, 122, 40));

        jButton4.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/close.png"))); // NOI18N
        jButton4.setText("Close");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1330, 580, 120, 40));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/header-slider3.jpg"))); // NOI18N
        jLabel21.setText("jLabel21");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(-70, 0, 1800, 780));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField12ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String name=jTextField1.getText();
        String contactNo=jTextField2.getText();
        String email=jTextField3.getText();
        String address=jTextField4.getText();
        String path="C:\\Users\\nickh\\OneDrive\\Desktop\\project\\Billing System\\bills";
        com.itextpdf.text.Document doc=new com.itextpdf.text.Document();
        try{
            PdfWriter.getInstance(doc,new FileOutputStream(path+""+name+""+jLabel3.getText()+".pdf"));
            doc.open();
            Paragraph paragraph1=new Paragraph("                                             NIKHIL(Billing System)\n                                             contact No:(+91) 9550884591\n\n");
        doc.add(paragraph1);
        Paragraph paragraph2=new Paragraph("  Data & Time :"+jLabel5.getText()+" & "+jLabel3.getText()+"\nBuyer Details: \nName:"+name+"\nconatctNo: "+contactNo+"\nAddress: "+address+"\n\n");
        doc.add(paragraph2);
        PdfPTable tb1=new PdfPTable(5);
        tb1.addCell("Name");
        tb1.addCell("Description");
        tb1.addCell("Price");
        tb1.addCell("Quantity");
        tb1.addCell("sub Total");
        for(int i=0;i<jTable1.getRowCount();i++){
            String n=jTable1.getValueAt(i,0).toString();
            String d=jTable1.getValueAt(i,1).toString();
            String r=jTable1.getValueAt(i,2).toString();
            String q=jTable1.getValueAt(i,3).toString();
            String s=jTable1.getValueAt(i,4).toString();
           
            tb1.addCell(n);
            tb1.addCell(d);
            tb1.addCell(r);
            tb1.addCell(q);
            tb1.addCell(s);
            
        }
        doc.add(tb1);
        Paragraph paragraph3=new Paragraph(" \nTotal: "+jTextField10.getText()+"\npaid Amount: "+jTextField11.getText()+"\nReturn Amount: "+jTextField12.getText()+"\n\n THANKS FOR VISIT....!PLEASE COME AGAIN.\nNIKHIL" );
        doc.add(paragraph3);
        JOptionPane.showMessageDialog(null, "BILL GENERATED");
        setVisible(true);
        new bill().setVisible(true);
        
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        doc.close();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new bill().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
        String name=jTextField1.getText();
        try{
           Connection con=connectionProvider.getCon();
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select *from buyer where name like '"+name+"%'");
            if(rs.next()){
            jTextField1.setText(rs.getString(1));
            jTextField2.setText(rs.getString(2));
            jTextField3.setText(rs.getString(3));
            jTextField4.setText(rs.getString(4));
            }else{
                jTextField2.setText("");
                jTextField3.setText("");
                jTextField4.setText("");
            }
            
          
            
        }catch(Exception e){
            
        }
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
         String contact=jTextField2.getText();
        try{
           Connection con=connectionProvider.getCon();
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select *from buyer where contact like '"+contact+"%'");
            if(rs.next()){
            jTextField1.setText(rs.getString(1));
            jTextField2.setText(rs.getString(2));
            jTextField3.setText(rs.getString(3));
            jTextField4.setText(rs.getString(4));
            }else{
                jTextField2.setText("");
                jTextField3.setText("");
                jTextField4.setText("");
            }
            
          
            
        }catch(Exception e){
            
        }
        
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
        String pId=jTextField5.getText();
        try{
           Connection con=connectionProvider.getCon();
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select *from product where pId='"+pId+"' ");
            if(rs.next()){
            jTextField6.setText(rs.getString(2));
            jTextField7.setText(rs.getString(3));
            jTextField8.setText("1");
            jTextField9.setText(rs.getString(4));
//             jTextField10.setText(rs.getString(4));
            }else{
                jTextField6.setText("");
                jTextField7.setText("");
                jTextField8.setText("");
                 jTextField9.setText("");
            }
            
          
            
        }catch(Exception e){
            
        }
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int price=Integer.parseInt(jTextField7.getText());
        int quantity=Integer.parseInt(jTextField8.getText());
        int total=price*quantity;
        DefaultTableModel model=(DefaultTableModel)jTable1.getModel();
        model.addRow(new Object[]{jTextField6.getText(),jTextField9.getText(),price,quantity,total});
        finalTotal=finalTotal+total;
        String finalTotal1=String.valueOf(finalTotal);
        jTextField10.setText(finalTotal1);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField11ActionPerformed
        // TODO add your handling code here:
        String paidAmount=jTextField11.getText();
        int z=Integer.parseInt((paidAmount));
        finalTotal=z-finalTotal;
        String finalTotal1=String.valueOf(finalTotal);
        jTextField12.setText(finalTotal1);
        jTextField12.setEditable(false);
    }//GEN-LAST:event_jTextField11ActionPerformed

    private void jTextField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField10ActionPerformed
        // TODO add your handling code here:
        setEditable(false);
    }//GEN-LAST:event_jTextField10ActionPerformed

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
            java.util.logging.Logger.getLogger(bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new bill().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables

    private void setEditable(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
