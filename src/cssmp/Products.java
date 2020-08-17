/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cssmp;

import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.plaf.basic.BasicMenuUI;

/**
 *
 * @author rajeshwari
 */
public class Products extends javax.swing.JFrame {
private static String product_name=null;
    /**
     * Creates new form Products
     */
    public Products() {
        initComponents();
        this.bindData();
        this.setLocationRelativeTo(null);
        product_list.setVisible(false);
        jScrollPane1.setVisible(false);
        products_details_txtf.setVisible(false);
        jScrollPane2.setVisible(false);
        
        idField.setVisible(false);
        nameField.setVisible(false);
        costField.setVisible(false);
        quantityField.setVisible(false);
    }
DefaultListModel dm = new DefaultListModel();
    
    private static ArrayList getData(){
        ArrayList product = new ArrayList();
        try{
            Connection con = SQL_Ops.getConnection();
            Statement stmt = con.createStatement();
            String sql = "SELECT P_Name FROM PRODUCTS;";
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
                product.add(rs.getString(1));
            }
        }catch(Exception e){};
        return product;
    }
    private void bindData(){
        getData().stream().forEach((product)->{
           dm.addElement(product);
        });
        product_list.setModel(dm);
        product_list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }
    private void serachFilter(String searchTerm){
        DefaultListModel fi = new DefaultListModel();
        ArrayList prodfill = getData();
        prodfill.stream().forEach((product)->{
            String product_name = product.toString().toLowerCase();
            if(product_name.contains(searchTerm.toLowerCase())){
                fi.addElement(product);
            }
       });
        dm=fi;
        product_list.setModel(dm);
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
        search_text = new javax.swing.JLabel();
        product_txt = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        back_btn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        product_list = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        products_details_txtf = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        idField = new javax.swing.JLabel();
        nameField = new javax.swing.JLabel();
        costField = new javax.swing.JLabel();
        quantityField = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Products");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(31, 122, 231));
        jPanel1.setMinimumSize(new java.awt.Dimension(0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 620));
        jPanel1.setRequestFocusEnabled(false);
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        search_text.setText("Search Products......");
        jPanel1.add(search_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, -1, -1));

        product_txt.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        product_txt.setToolTipText("");
        product_txt.setBorder(null);
        product_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                product_txtActionPerformed(evt);
            }
        });
        product_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                product_txtKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                product_txtKeyTyped(evt);
            }
        });
        jPanel1.add(product_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 630, 40));

        searchButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/serch_btn.png"))); // NOI18N
        searchButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });
        jPanel1.add(searchButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 30, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search_bar.png"))); // NOI18N
        jLabel1.setOpaque(true);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/product_fill.png"))); // NOI18N
        jLabel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabel5.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(254, 254, 254));
        jLabel5.setText("Back to Home");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 590, -1, -1));

        jLabel8.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(254, 254, 254));
        jLabel8.setText("2019  CSSM");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 590, -1, -1));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/copyright1.png"))); // NOI18N
        jButton4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton4.setBorderPainted(false);
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 580, -1, -1));

        jLabel3.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(254, 254, 254));
        jLabel3.setText("PRODUCTS");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, -1, -1));

        back_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back_to_home.png"))); // NOI18N
        back_btn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        back_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_btnActionPerformed(evt);
            }
        });
        jPanel1.add(back_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 580, -1, -1));

        product_list.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        product_list.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        product_list.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                product_listMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(product_list);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 610, 150));

        products_details_txtf.setBackground(new java.awt.Color(31, 122, 231));
        products_details_txtf.setColumns(20);
        products_details_txtf.setForeground(new java.awt.Color(255, 255, 255));
        products_details_txtf.setRows(5);
        jScrollPane2.setViewportView(products_details_txtf);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, 390, 110));

        jLabel4.setText("ID:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, -1, -1));

        jLabel6.setText("Name:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, -1, -1));

        jLabel7.setText("Cost:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 360, -1, -1));

        jLabel9.setText("Quantity:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 410, -1, -1));

        idField.setText("jLabel10");
        jPanel1.add(idField, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 260, -1, -1));

        nameField.setText("jLabel11");
        jPanel1.add(nameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 310, -1, -1));

        costField.setText("jLabel12");
        jPanel1.add(costField, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 360, -1, -1));

        quantityField.setText("jLabel13");
        jPanel1.add(quantityField, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 410, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        // TODO add your handling code here:
        try{
            String SQL="SELECT * FROM PRODUCTS WHERE P_Name='Mouse'";
            ResultSet rs=SQL_Ops.output(SQL);
            while(rs.next()){
                idField.setVisible(true);
                idField.setText(rs.getString(1));
                nameField.setVisible(true);
                nameField.setText(rs.getString(2));
                costField.setVisible(true);
                costField.setText(String.valueOf(rs.getInt(3)));
                quantityField.setVisible(true);
                quantityField.setText(String.valueOf(rs.getInt(4)));
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error fetching data");
            System.out.println(e);
        }
    }//GEN-LAST:event_searchButtonActionPerformed

    private void product_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_product_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_product_txtActionPerformed

    private void product_txtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_product_txtKeyTyped
         if((product_txt.getText()).equals("")){
           search_text.setEnabled(true);
           search_text.setVisible(true);
            search_text.setText("Search Products......");
        }else{
        search_text.setVisible(false);
        search_text.setEnabled(false);
        }
    }//GEN-LAST:event_product_txtKeyTyped

    private void back_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_btnActionPerformed
        EmpHome.main(null);
        this.dispose();
        this.setVisible(false);
    }//GEN-LAST:event_back_btnActionPerformed

    private void product_txtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_product_txtKeyReleased
        if((product_txt.getText()).equals("")){
           search_text.setEnabled(true);
           search_text.setVisible(true);
            search_text.setText("Search Products......");
        }else{
        search_text.setVisible(false);
        search_text.setEnabled(false);
        }
         serachFilter(product_txt.getText());
         product_list.setVisible(true);
         jScrollPane1.setVisible(true);
    }//GEN-LAST:event_product_txtKeyReleased

    private void product_listMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_product_listMouseClicked
        /*product_name = product_list.getSelectedValue();
        String p_name=null,p_amount=null,qnty=null;
        products_details_txtf.setVisible(true);
        jScrollPane2.setVisible(true);
        try{
        ResultSet rs = SQL_Ops.getProduct_details(product_name);
        rs.next();
        p_name = rs.getString(2);
        p_amount = String.valueOf(rs.getInt(3));
        qnty = String.valueOf(rs.getInt(4));
        }catch(Exception e){};
        products_details_txtf.setText("Product Name:"+p_name+"\nProduct Cost:"+p_amount+"\nProduct quantity:"+qnty);
        product_list.setVisible(false);
        jScrollPane1.setVisible(false);
        product_txt.setText("");
        if((product_txt.getText()).equals("")){
            search_text.setEnabled(true);
            search_text.setVisible(true);
            search_text.setText("Search Products......");
        }else{
            search_text.setVisible(false);
            search_text.setEnabled(false);
        }*/
    }//GEN-LAST:event_product_listMouseClicked

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        product_list.setVisible(false);
         jScrollPane1.setVisible(false);
    }//GEN-LAST:event_jPanel1MouseClicked

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
            java.util.logging.Logger.getLogger(Products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Products().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back_btn;
    private javax.swing.JLabel costField;
    private javax.swing.JLabel idField;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel nameField;
    private javax.swing.JList<String> product_list;
    private javax.swing.JTextField product_txt;
    private javax.swing.JTextArea products_details_txtf;
    private javax.swing.JLabel quantityField;
    private javax.swing.JButton searchButton;
    private javax.swing.JLabel search_text;
    // End of variables declaration//GEN-END:variables
}