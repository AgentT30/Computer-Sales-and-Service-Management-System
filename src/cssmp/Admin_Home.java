/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cssmp;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.Font;
import java.io.File;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
/**
 *
 * @author rajeshwari
 */
public class Admin_Home extends javax.swing.JFrame {
public static ImageIcon emp_high_icon;
public static ImageIcon emp_icon;
public static ImageIcon pro_high_icon;
public static ImageIcon pro_icon;
public static ImageIcon cust_high_icon;
public static ImageIcon cust_icon;
public static ImageIcon settings_icon;
public static ImageIcon settings_high_icon;
public static ImageIcon logout_icon;
public static ImageIcon logout_heigh_icon;
    /**
     * Creates new form Admin_Home
     */
    public Admin_Home() {
        initComponents();
        this.setLocationRelativeTo(null);
        Employee_panel.setVisible(true);
        String output="SELECT * FROM EMPLOYEE";
        SQL_Ops.outputtoTableEmployee(SQL_Ops.output(output), emp_Display, this);
        products_panel.setVisible(false);
        customer_panel.setVisible(false);
        emp_high_icon = new ImageIcon("/home/agentt/Documents/Mini Project/TempCssP/src/images/customer_highlight.png");
        employee_btn.setIcon(emp_high_icon);
        employee_label.setForeground(new Color(255,104,31));
        emp_icon = new ImageIcon("/home/agentt/Documents/Mini Project/TempCssP/src/images/employee_blue.png");
        pro_high_icon = new ImageIcon("/home/agentt/Documents/Mini Project/TempCssP/src/images/products_heighlight.png.png");
        pro_icon = new ImageIcon("/home/agentt/Documents/Mini Project/TempCssP/src/images/products_blue.png");
        cust_high_icon = new ImageIcon("/home/agentt/Documents/Mini Project/TempCssP/src/images/customers_highlight.png");
        cust_icon = new ImageIcon("/home/agentt/Documents/Mini Project/TempCssP/src/images/customers_blue.png");
        settings_icon = new ImageIcon("/home/agentt/Documents/Mini Project/TempCssP/src/images/settings_blue.png");
        settings_high_icon = new ImageIcon("/home/agentt/Documents/Mini Project/TempCssP/src/images/settings_heighlight.png");
        logout_icon = new ImageIcon("/home/agentt/Documents/Mini Project/TempCssP/src/images/logout_blue.png");
        logout_heigh_icon = new ImageIcon("/home/agentt/Documents/Mini Project/TempCssP/src/images/logout_heighlight.png");
    }
public void changeEvt(java.awt.event.ActionEvent evt){
   if(evt.getActionCommand().equals("employee")){
       Employee_panel.setVisible(true); 
       products_panel.setVisible(false);
       customer_panel.setVisible(false);
        employee_btn.setIcon(emp_high_icon);
        employee_label.setForeground(new Color(255,104,31));
        products_btn.setIcon(pro_icon);
        products_label.setForeground(new Color(254,254,254));
        customers_btn.setIcon(cust_icon);
        customers_label.setForeground(new Color(254,254,254));
        settings_btn.setIcon(settings_icon);
        settings_label.setForeground(new Color(254,254,254));
        logout_btn.setIcon(logout_icon);
        logout_label.setForeground(new Color(254,254,254));
        
   }else if(evt.getActionCommand().equals("products")){
        products_panel.setVisible(true);
        Employee_panel.setVisible(false);
        customer_panel.setVisible(false);
        employee_btn.setIcon(emp_icon);
        employee_label.setForeground(new Color(254,254,254));
        products_btn.setIcon(pro_high_icon);
        products_label.setForeground(new Color(255,104,31));
        customers_btn.setIcon(cust_icon);
        customers_label.setForeground(new Color(254,254,254));
        settings_btn.setIcon(settings_icon);
        settings_label.setForeground(new Color(254,254,254));
        logout_btn.setIcon(logout_icon);
        logout_label.setForeground(new Color(254,254,254));
   }else if(evt.getActionCommand().equals("customers")){
       customer_panel.setVisible(true);
       products_panel.setVisible(false);
       Employee_panel.setVisible(false);
       employee_btn.setIcon(emp_icon);
       products_btn.setIcon(pro_icon);
       customers_btn.setIcon(cust_high_icon);
       logout_btn.setIcon(logout_icon);
       settings_btn.setIcon(settings_icon);
       settings_label.setForeground(new Color(254,254,254));
       logout_label.setForeground(new Color(254,254,254));
       customers_label.setForeground(new Color(255,104,31));
       employee_label.setForeground(new Color(254,254,254));
       products_label.setForeground(new Color(254,254,254));
   }
   else if(evt.getActionCommand().equals("settings")){
       employee_btn.setIcon(emp_icon);
       products_btn.setIcon(pro_icon);
       customers_btn.setIcon(cust_icon);
       logout_btn.setIcon(logout_icon);
       settings_btn.setIcon(settings_high_icon);
       customers_label.setForeground(new Color(254,254,254));
       employee_label.setForeground(new Color(254,254,254));
       products_label.setForeground(new Color(254,254,254));
       settings_label.setForeground(new Color(255,104,31));
       logout_label.setForeground(new Color(254,254,254));
   }
   else if(evt.getActionCommand().equals("logout")){
       employee_btn.setIcon(emp_icon);
       products_btn.setIcon(pro_icon);
       customers_btn.setIcon(cust_icon);
       logout_btn.setIcon(logout_heigh_icon);
       settings_btn.setIcon(settings_icon);
       customers_label.setForeground(new Color(254,254,254));
       employee_label.setForeground(new Color(254,254,254));
       products_label.setForeground(new Color(254,254,254));
       settings_label.setForeground(new Color(255,255,255));
       logout_label.setForeground(new Color(255,104,31));
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
        jPanel15 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        products_btn = new javax.swing.JButton();
        customers_label = new javax.swing.JLabel();
        settings_btn = new javax.swing.JButton();
        settings_label = new javax.swing.JLabel();
        logout_btn = new javax.swing.JButton();
        logout_label = new javax.swing.JLabel();
        employee_btn = new javax.swing.JButton();
        customers_btn = new javax.swing.JButton();
        employee_label = new javax.swing.JLabel();
        products_label = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        contact_label = new javax.swing.JLabel();
        about_label = new javax.swing.JLabel();
        Employee_panel = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        add_employee_bnt = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        emp_name = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        emp_email = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        emp_phone = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        emp_salary = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        emp_Display = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        List = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        sort_box = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        customer_panel = new javax.swing.JPanel();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel11 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        Cust_Table2 = new javax.swing.JTable();
        List2 = new javax.swing.JButton();
        jLabel34 = new javax.swing.JLabel();
        sort_Box2 = new javax.swing.JComboBox<>();
        jLabel36 = new javax.swing.JLabel();
        products_panel = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel28 = new javax.swing.JLabel();
        Sort_Box = new javax.swing.JComboBox<>();
        sort_Button = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        p_id = new javax.swing.JTextField();
        quantity_num = new javax.swing.JTextField();
        buy = new javax.swing.JButton();
        back_button = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        p_Name = new javax.swing.JTextField();
        p_Cost = new javax.swing.JTextField();
        p_Quantity = new javax.swing.JTextField();
        add_products_bnt1 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        prod_ID = new javax.swing.JLabel();
        delete_Button = new javax.swing.JButton();
        prodIDEntry = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        edit_profile = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Admin Home");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(254, 254, 254));
        jPanel1.setPreferredSize(new java.awt.Dimension(1108, 576));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel15.setBackground(new java.awt.Color(31, 122, 231));
        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user-68px.png"))); // NOI18N
        jPanel15.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 22, 72, 72));

        jLabel12.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(248, 241, 241));
        jLabel12.setText("Admin");
        jPanel15.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 118, -1, -1));

        jPanel2.setBackground(new java.awt.Color(31, 122, 231));

        products_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/products_blue.png"))); // NOI18N
        products_btn.setActionCommand("products");
        products_btn.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        products_btn.setBorderPainted(false);
        products_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                products_btnActionPerformed(evt);
            }
        });

        customers_label.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        customers_label.setForeground(new java.awt.Color(254, 254, 254));
        customers_label.setText("Customers");

        settings_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/settings_blue.png"))); // NOI18N
        settings_btn.setActionCommand("settings");
        settings_btn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        settings_btn.setBorderPainted(false);
        settings_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                settings_btnActionPerformed(evt);
            }
        });

        settings_label.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        settings_label.setForeground(new java.awt.Color(254, 254, 254));
        settings_label.setText("Settings");

        logout_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logout_blue.png"))); // NOI18N
        logout_btn.setActionCommand("logout");
        logout_btn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        logout_btn.setBorderPainted(false);
        logout_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logout_btnActionPerformed(evt);
            }
        });

        logout_label.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        logout_label.setForeground(new java.awt.Color(254, 254, 254));
        logout_label.setText("Logout");

        employee_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/employee_blue.png"))); // NOI18N
        employee_btn.setActionCommand("employee");
        employee_btn.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        employee_btn.setBorderPainted(false);
        employee_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employee_btnActionPerformed(evt);
            }
        });

        customers_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/customers_blue.png"))); // NOI18N
        customers_btn.setActionCommand("customers");
        customers_btn.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        customers_btn.setBorderPainted(false);
        customers_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customers_btnActionPerformed(evt);
            }
        });

        employee_label.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        employee_label.setForeground(new java.awt.Color(254, 254, 254));
        employee_label.setText("Employee");

        products_label.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        products_label.setForeground(new java.awt.Color(254, 254, 254));
        products_label.setText("Products");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(logout_btn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(logout_label))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(settings_btn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(settings_label))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(customers_btn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(customers_label))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(products_btn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(products_label))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(employee_btn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(employee_label)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(32, Short.MAX_VALUE)
                        .addComponent(employee_btn)
                        .addGap(18, 18, 18))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(employee_label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(products_btn)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(products_label)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(customers_label))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(customers_btn)))
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(settings_btn)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(settings_label)
                        .addGap(37, 37, 37)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(logout_btn)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(logout_label)
                        .addGap(25, 25, 25))))
        );

        jPanel15.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 165, -1, -1));

        jPanel3.setPreferredSize(new java.awt.Dimension(0, 2));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jPanel15.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 536, 1108, -1));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/copyright1.png"))); // NOI18N
        jButton4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton4.setBorderPainted(false);
        jPanel15.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(953, 542, -1, -1));

        jLabel8.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(254, 254, 254));
        jLabel8.setText("2019  CSSM");
        jPanel15.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 550, -1, -1));

        contact_label.setFont(new java.awt.Font("Ubuntu", 2, 14)); // NOI18N
        contact_label.setForeground(new java.awt.Color(254, 254, 254));
        contact_label.setText("Contact");
        contact_label.setToolTipText("About this project");
        contact_label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                contact_labelMouseClicked(evt);
            }
        });
        jPanel15.add(contact_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 548, -1, -1));

        about_label.setFont(new java.awt.Font("Ubuntu", 2, 14)); // NOI18N
        about_label.setForeground(new java.awt.Color(254, 254, 254));
        about_label.setText("About");
        about_label.setToolTipText("About this project");
        about_label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                about_labelMouseClicked(evt);
            }
        });
        jPanel15.add(about_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 548, -1, -1));

        Employee_panel.setBackground(new java.awt.Color(31, 122, 231));
        Employee_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setBackground(new java.awt.Color(102, 102, 102));
        jLabel18.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Employee");
        Employee_panel.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, -1, -1));

        jTabbedPane1.setForeground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        add_employee_bnt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Add_service_btn.png"))); // NOI18N
        add_employee_bnt.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        add_employee_bnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_employee_bntActionPerformed(evt);
            }
        });

        jLabel2.setText("Name:");

        jLabel3.setText("Email:");

        emp_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emp_emailActionPerformed(evt);
            }
        });

        jLabel21.setText("Phone:");

        jLabel22.setText("Salary:");

        jLabel23.setBackground(new java.awt.Color(0, 0, 0));
        jLabel23.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        jLabel23.setText("ADD EMPLOYEE");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(218, 218, 218)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addGap(18, 18, 18)
                        .addComponent(emp_phone, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(emp_email, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(emp_name, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(jLabel22)
                            .addGap(18, 18, 18)
                            .addComponent(emp_salary, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(252, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(add_employee_bnt)
                .addGap(45, 45, 45))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel23)
                .addGap(23, 23, 23)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(emp_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(emp_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(emp_phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(emp_salary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(164, 164, 164)
                .addComponent(add_employee_bnt)
                .addGap(25, 25, 25))
        );

        jTabbedPane1.addTab("Add Employee", new javax.swing.ImageIcon(getClass().getResource("/images/add_btn.png")), jPanel4, ""); // NOI18N

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        emp_Display.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Email", "Salary", "Phone"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(emp_Display);

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel4.setText("Employee List:");

        List.setText("List");
        List.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListActionPerformed(evt);
            }
        });

        jLabel20.setText("Sort By:");

        sort_box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "default", "Name", "Email", "Phone", "Salary" }));

        jButton1.setText("Employee's With No Customers");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(250, 250, 250)
                        .addComponent(jLabel4))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(sort_box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(133, 133, 133)
                                .addComponent(List)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 589, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(96, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(35, 35, 35)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(sort_box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(List)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("View Employee", new javax.swing.ImageIcon(getClass().getResource("/images/view_btn.png")), jPanel5); // NOI18N

        Employee_panel.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));
        jTabbedPane1.setFont(new Font("Dailog",Font.BOLD,12));

        jPanel15.add(Employee_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, -1, -1));

        customer_panel.setBackground(new java.awt.Color(31, 122, 231));
        customer_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane3.setForeground(new java.awt.Color(255, 255, 255));
        jTabbedPane3.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Cust_Table2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cust ID", "Name", "Email", "Phone", "Address"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(Cust_Table2);

        List2.setText("List");
        List2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                List2ActionPerformed(evt);
            }
        });

        jLabel34.setText("Sort By:");

        sort_Box2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "default", "Name", "Email", "Phone", "Address" }));
        sort_Box2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sort_Box2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(jLabel34)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(sort_Box2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(133, 133, 133)
                        .addComponent(List2))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 589, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(91, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(sort_Box2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(List2))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("View Customers", new javax.swing.ImageIcon(getClass().getResource("/images/view_btn.png")), jPanel11); // NOI18N

        customer_panel.add(jTabbedPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 870, -1));
        jTabbedPane1.setFont(new Font("Dailog",Font.BOLD,12));

        jLabel36.setBackground(new java.awt.Color(255, 255, 255));
        jLabel36.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setText("Customers");
        customer_panel.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, -1, -1));

        jPanel15.add(customer_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, -1, -1));

        products_panel.setBackground(new java.awt.Color(31, 122, 231));
        products_panel.setMinimumSize(new java.awt.Dimension(0, 0));
        products_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane2.setForeground(new java.awt.Color(255, 255, 255));
        jTabbedPane2.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "P_ID", "Name", "Cost(In Rs)", "Quantity"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(jTable1);

        jLabel28.setText("Sort By:");

        Sort_Box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Default", "Name", "Cost", "Quantity" }));
        Sort_Box.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Sort_BoxActionPerformed(evt);
            }
        });

        sort_Button.setText("Sort");
        sort_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sort_ButtonActionPerformed(evt);
            }
        });

        jLabel29.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel29.setText("Product List");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel29)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel28)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Sort_Box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(sort_Button)))))
                .addContainerGap(260, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel29)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(Sort_Box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sort_Button))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        jTabbedPane2.addTab("View Products", new javax.swing.ImageIcon(getClass().getResource("/images/view_btn.png")), jPanel6); // NOI18N

        jLabel19.setText("Enter Product ID:");

        jLabel24.setText("Enter Quantity:");

        buy.setText("Buy Products");
        buy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buyActionPerformed(evt);
            }
        });

        back_button.setText("Back");

        jLabel27.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel27.setText("Buy Products:");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel19)
                                    .addComponent(jLabel24))
                                .addGap(29, 29, 29)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(p_id, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                    .addComponent(quantity_num)))
                            .addComponent(jLabel27)))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(buy)
                        .addGap(40, 40, 40)
                        .addComponent(back_button)))
                .addContainerGap(314, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel27)
                .addGap(38, 38, 38)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(p_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(quantity_num, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buy)
                    .addComponent(back_button))
                .addContainerGap(212, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Update Products", new javax.swing.ImageIcon(getClass().getResource("/images/update_bnt.png")), jPanel9); // NOI18N

        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel7.setForeground(new java.awt.Color(255, 255, 255));

        jLabel5.setText("Enter the product details:");

        jLabel14.setText("Product Name:");

        jLabel30.setText("Cost:");

        jLabel31.setText("Quantity:");

        add_products_bnt1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Add_service_btn.png"))); // NOI18N
        add_products_bnt1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        add_products_bnt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_products_bnt1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel31)
                        .addGap(98, 98, 98)
                        .addComponent(p_Quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(61, 61, 61)
                        .addComponent(p_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel30)
                        .addGap(128, 128, 128)
                        .addComponent(p_Cost, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(299, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(add_products_bnt1)
                .addGap(36, 36, 36))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel5)
                .addGap(45, 45, 45)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(p_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(p_Cost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(p_Quantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 167, Short.MAX_VALUE)
                .addComponent(add_products_bnt1)
                .addGap(23, 23, 23))
        );

        jTabbedPane2.addTab("Add Products", new javax.swing.ImageIcon(getClass().getResource("/images/add_btn.png")), jPanel7, ""); // NOI18N

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("Delete Product");

        prod_ID.setText("Enter Product ID:");

        delete_Button.setText("Delete");
        delete_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_ButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jLabel1))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(prod_ID)
                        .addGap(76, 76, 76)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(delete_Button)
                            .addComponent(prodIDEntry, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(269, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel1)
                .addGap(43, 43, 43)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(prod_ID)
                    .addComponent(prodIDEntry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addComponent(delete_Button)
                .addContainerGap(241, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Delete Products", new javax.swing.ImageIcon(getClass().getResource("/images/delete_btn.png")), jPanel10); // NOI18N

        products_panel.add(jTabbedPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 870, -1));
        jTabbedPane1.setFont(new Font("Dailog",Font.BOLD,12));

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Products");
        products_panel.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 12, -1, -1));

        jPanel15.add(products_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, -1, -1));

        edit_profile.setBackground(new java.awt.Color(31, 122, 231));
        edit_profile.setMinimumSize(new java.awt.Dimension(908, 530));
        edit_profile.setPreferredSize(new java.awt.Dimension(908, 530));

        javax.swing.GroupLayout edit_profileLayout = new javax.swing.GroupLayout(edit_profile);
        edit_profile.setLayout(edit_profileLayout);
        edit_profileLayout.setHorizontalGroup(
            edit_profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        edit_profileLayout.setVerticalGroup(
            edit_profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel15.add(edit_profile, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, -1, -1));

        jPanel1.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logout_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logout_btnActionPerformed
                                    
       int choice=JOptionPane.showConfirmDialog(this, "Logout?");
       if(choice==0){
        Admin_login.main(null);
        this.dispose();
        this.setVisible(false);
       }
       else{
           
       }
    }//GEN-LAST:event_logout_btnActionPerformed

    private void settings_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_settings_btnActionPerformed
        changeEvt(evt);
        Settings_Admin.main(null);
    }//GEN-LAST:event_settings_btnActionPerformed

    private void products_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_products_btnActionPerformed
        changeEvt(evt);
        String output="SELECT * FROM PRODUCTS";
        SQL_Ops.outputtoTableStock(SQL_Ops.output(output),jTable1,this);        
    }//GEN-LAST:event_products_btnActionPerformed

    private void employee_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employee_btnActionPerformed
        changeEvt(evt);
    }//GEN-LAST:event_employee_btnActionPerformed

    private void customers_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customers_btnActionPerformed
        changeEvt(evt);
        String output="SELECT * FROM CUSTOMER";
        SQL_Ops.outputtoTableCust(SQL_Ops.output(output),Cust_Table2,this);
    }//GEN-LAST:event_customers_btnActionPerformed

    private void contact_labelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contact_labelMouseClicked
        contact.main(null);
    }//GEN-LAST:event_contact_labelMouseClicked

    private void about_labelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_about_labelMouseClicked
        //about.main(null);
        try{
            File openPDF = new File("/home/agentt/Documents/Mini Project/Report/FinalToPrint.pdf");
            Desktop.getDesktop().open(openPDF);        
        }
        catch(Exception e){
            
        }
    }//GEN-LAST:event_about_labelMouseClicked

    private void List2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_List2ActionPerformed
        // TODO add your handling code here:
        if(sort_Box2.getSelectedItem().equals("default")){
            String output="SELECT * FROM CUSTOMER";
            SQL_Ops.outputtoTableCust(SQL_Ops.output(output),Cust_Table2,this);
        }
        else if(sort_Box2.getSelectedItem().equals("Name")){
            String output="SELECT * FROM CUSTOMER order by Cust_Name";
            SQL_Ops.outputtoTableCust(SQL_Ops.output(output),Cust_Table2,this);
        }
        else if(sort_Box2.getSelectedItem().equals("Email")){
            String output="SELECT * FROM CUSTOMER order by Cust_Email";
            SQL_Ops.outputtoTableCust(SQL_Ops.output(output),Cust_Table2,this);
        }
        else if(sort_Box2.getSelectedItem().equals("Phone")){
            String output="SELECT * FROM CUSTOMER order by Cust_Phone";
            SQL_Ops.outputtoTableCust(SQL_Ops.output(output),Cust_Table2,this);
        }
        else{
            String output="SELECT * FROM CUSTOMER order by Address";
            SQL_Ops.outputtoTableCust(SQL_Ops.output(output),Cust_Table2,this);
        }
    }//GEN-LAST:event_List2ActionPerformed

    private void add_employee_bntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_employee_bntActionPerformed
        // TODO add your handling code here:
        int choice=JOptionPane.showConfirmDialog(List, "Do you want to add new emloyee?");
        if(choice==0){
            String emp_Number="";
            try{
                try{
                String getEmpID="SELECT MAX(Emp_ID) FROM EMPLOYEE";
                ResultSet rs=SQL_Ops.output(getEmpID);

                while(rs.next()){
                    String latestEmp=rs.getString(1);
                    emp_Number=latestEmp.substring(1);
                    //System.out.println(emp_Number);
                    int emp_no=Integer.valueOf(emp_Number);
                    emp_no+=1;
                    emp_Number="E"+String.valueOf(emp_no);
                    //System.out.println(emp_Number);
                }
            }
            catch(SQLException e){
                JOptionPane.showMessageDialog(null,  "Error!");
                System.out.println(e);
            }            
            String SQL="INSERT INTO EMPLOYEE VALUES('"+emp_Number+"','"+emp_name.getText()+"','"+emp_email.getText()+"',"+Integer.parseInt(emp_salary.getText())+","+Integer.parseInt(emp_phone.getText())+")";
            //SQL_Ops.employeeAdd(SQL);
            SQL_Ops.UpdateTable(SQL);
            emp_name.setText("");
            emp_email.setText("");
            emp_salary.setText("");
            emp_phone.setText("");
            }
            catch(Exception e){
                System.out.println(e);
                JOptionPane.showMessageDialog(null, "Error!!");
            }
        }
        else{
            
        }
        
    }//GEN-LAST:event_add_employee_bntActionPerformed

    private void emp_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emp_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emp_emailActionPerformed

    private void ListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListActionPerformed
        // TODO add your handling code here:
        if(sort_box.getSelectedItem().equals("default")){
            String output="SELECT * FROM EMPLOYEE";
            SQL_Ops.outputtoTableEmployee(SQL_Ops.output(output), emp_Display, this);
        }
        else if(sort_box.getSelectedItem().equals("Name")){
            String output="SELECT * FROM EMPLOYEE ORDER BY Emp_Name";
            SQL_Ops.outputtoTableEmployee(SQL_Ops.output(output), emp_Display, this);
        }
        else if(sort_box.getSelectedItem().equals("Email")){
            String output="SELECT * FROM EMPLOYEE ORDER BY Emp_Email";
            SQL_Ops.outputtoTableEmployee(SQL_Ops.output(output), emp_Display, this);
        }
        else if(sort_box.getSelectedItem().equals("Phone")){
            String output="SELECT * FROM EMPLOYEE ORDER BY Emp_Phone";
            SQL_Ops.outputtoTableEmployee(SQL_Ops.output(output), emp_Display, this);
        }
        else if(sort_box.getSelectedItem().equals("Salary")){
            String output="SELECT * FROM EMPLOYEE ORDER BY Salary";
            SQL_Ops.outputtoTableEmployee(SQL_Ops.output(output), emp_Display, this);
        }
    }//GEN-LAST:event_ListActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String output="SELECT * FROM EMP_NO_CUST";
        SQL_Ops.outputtoTableEmployee(SQL_Ops.output(output), emp_Display, this);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void Sort_BoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Sort_BoxActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_Sort_BoxActionPerformed

    private void sort_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sort_ButtonActionPerformed
        // TODO add your handling code here:

        if(Sort_Box.getSelectedItem().toString().equals("Default")){
            String output="SELECT * FROM PRODUCTS";
            SQL_Ops.outputtoTableStock(SQL_Ops.output(output),jTable1,this);
        }
        else if(Sort_Box.getSelectedItem().toString().equals("Name")){
            String output="SELECT * FROM PRODUCTS ORDER BY P_Name";
            SQL_Ops.outputtoTableStock(SQL_Ops.output(output),jTable1,this);
        }
        else if(Sort_Box.getSelectedItem().toString().equals("Cost")){
            String output="SELECT * FROM PRODUCTS ORDER BY P_Cost";
            SQL_Ops.outputtoTableStock(SQL_Ops.output(output),jTable1,this);
        }
        else if(Sort_Box.getSelectedItem().toString().equals("Quantity")){
            String output="SELECT * FROM PRODUCTS ORDER BY P_Quantity";
            SQL_Ops.outputtoTableStock(SQL_Ops.output(output),jTable1,this);
        }
    }//GEN-LAST:event_sort_ButtonActionPerformed

    private void add_products_bnt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_products_bnt1ActionPerformed
        // TODO add your handling code here:
        int choice=JOptionPane.showConfirmDialog(List, "Do you want to add this product?");
        if(choice==0){
            try{            
                String getID="SELECT MAX(P_ID) FROM PRODUCTS";
                ResultSet rs=SQL_Ops.output(getID);
                rs.next();
                int id=Integer.parseInt(rs.getString(1).substring(1));
                String insertID="P"+(id+1);


                int cost=Integer.parseInt(p_Cost.getText());
                int quantity=Integer.parseInt(p_Quantity.getText());
                String AddProd="INSERT INTO PRODUCTS VALUES('"+insertID+"','"+p_Name.getText()+"',"+cost+","+quantity+")";
                //SQL_Ops.ProductAdd(AddProd);
                SQL_Ops.UpdateTable(AddProd);
                p_Cost.setText("");
                p_Quantity.setText("");
                p_Name.setText("");
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, "Error"+e);
                System.out.println(e);
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Transaction cancelled!");
        }        
    }//GEN-LAST:event_add_products_bnt1ActionPerformed

    private void buyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buyActionPerformed
        // TODO add your handling code here:
        int choice=JOptionPane.showConfirmDialog(List, "Confirm Update?");
        if(choice==0){
            String PID=p_id.getText();
            int quan=Integer.parseInt(quantity_num.getText());
            String update="UPDATE PRODUCTS SET P_QUANTITY="+quan+" WHERE P_ID='"+PID+"'";
            //SQL_Ops.UpdateProduct(update);
            SQL_Ops.UpdateTable(update);
            p_id.setText("");
            quantity_num.setText("");
        }
        else{
            JOptionPane.showMessageDialog(null, "Transaction cancelled!");
        }
    }//GEN-LAST:event_buyActionPerformed

    private void delete_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_ButtonActionPerformed
        // TODO add your handling code here:
        int choice=JOptionPane.showConfirmDialog(List, "Confirm Delete?");
        if(choice==0){
            String SQL="DELETE FROM PRODUCTS WHERE P_ID='"+prodIDEntry.getText()+"'";
            SQL_Ops.UpdateTable(SQL);
            prodIDEntry.setText("");
        }
        else{
            JOptionPane.showMessageDialog(null, "Transaction cancelled!");
        }
    }//GEN-LAST:event_delete_ButtonActionPerformed

    private void sort_Box2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sort_Box2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sort_Box2ActionPerformed

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
            java.util.logging.Logger.getLogger(Admin_Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin_Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Cust_Table2;
    private javax.swing.JPanel Employee_panel;
    private javax.swing.JButton List;
    private javax.swing.JButton List2;
    private javax.swing.JComboBox<String> Sort_Box;
    public static javax.swing.JLabel about_label;
    private javax.swing.JButton add_employee_bnt;
    private javax.swing.JButton add_products_bnt1;
    private javax.swing.JButton back_button;
    private javax.swing.JButton buy;
    public static javax.swing.JLabel contact_label;
    private javax.swing.JPanel customer_panel;
    private javax.swing.JButton customers_btn;
    private javax.swing.JLabel customers_label;
    private javax.swing.JButton delete_Button;
    private javax.swing.JPanel edit_profile;
    private javax.swing.JTable emp_Display;
    private javax.swing.JTextField emp_email;
    private javax.swing.JTextField emp_name;
    private javax.swing.JTextField emp_phone;
    private javax.swing.JTextField emp_salary;
    private javax.swing.JButton employee_btn;
    private javax.swing.JLabel employee_label;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton logout_btn;
    private javax.swing.JLabel logout_label;
    private javax.swing.JTextField p_Cost;
    private javax.swing.JTextField p_Name;
    private javax.swing.JTextField p_Quantity;
    private javax.swing.JTextField p_id;
    private javax.swing.JTextField prodIDEntry;
    private javax.swing.JLabel prod_ID;
    private javax.swing.JButton products_btn;
    private javax.swing.JLabel products_label;
    private javax.swing.JPanel products_panel;
    private javax.swing.JTextField quantity_num;
    private javax.swing.JButton settings_btn;
    private javax.swing.JLabel settings_label;
    private javax.swing.JComboBox<String> sort_Box2;
    private javax.swing.JButton sort_Button;
    private javax.swing.JComboBox<String> sort_box;
    // End of variables declaration//GEN-END:variables
}
