/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cssmp;

import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author rajeshwari
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form StartUp
     */
    public Login() {
        initComponents();
        setLocationRelativeTo(null);
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
        jPanel2 = new javax.swing.JPanel();
        user_label = new javax.swing.JLabel();
        username_txt = new org.jdesktop.swingx.JXTextField();
        jLabel2 = new javax.swing.JLabel();
        login_btn = new javax.swing.JButton();
        pass_label = new javax.swing.JLabel();
        password_txt = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        signup_btn = new javax.swing.JButton();
        forgot_password_label = new javax.swing.JLabel();
        admin_login_label = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setBackground(new java.awt.Color(187, 214, 250));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(31, 122, 231));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 600));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        user_label.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        user_label.setForeground(new java.awt.Color(60, 68, 69));
        user_label.setText("Enter username......");
        jPanel2.add(user_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, -1, 20));

        username_txt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(31, 122, 231)));
        username_txt.setForeground(new java.awt.Color(60, 68, 69));
        username_txt.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        username_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                username_txtKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                username_txtKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                username_txtKeyTyped(evt);
            }
        });
        jPanel2.add(username_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 220, 40));

        jLabel2.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Login");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, -1, -1));

        login_btn.setBackground(new java.awt.Color(31, 122, 231));
        login_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rounded_btn_new.png"))); // NOI18N
        login_btn.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pressed_new_btn_login.png"))); // NOI18N
        login_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_btnActionPerformed(evt);
            }
        });
        jPanel2.add(login_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, 110, 40));

        pass_label.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        pass_label.setForeground(new java.awt.Color(60, 68, 69));
        pass_label.setText("Enter password......");
        jPanel2.add(pass_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, -1, 20));

        password_txt.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        password_txt.setForeground(new java.awt.Color(60, 68, 69));
        password_txt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(31, 122, 231)));
        password_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                password_txtKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                password_txtKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                password_txtKeyTyped(evt);
            }
        });
        jPanel2.add(password_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 220, 40));

        jLabel3.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(31, 122, 231));
        jLabel3.setText("Or");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, -1, -1));

        jLabel4.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Signup");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 350, -1, -1));

        signup_btn.setBackground(new java.awt.Color(31, 122, 231));
        signup_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rounded_btn_new.png"))); // NOI18N
        signup_btn.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pressed_new_btn_login.png"))); // NOI18N
        signup_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signup_btnActionPerformed(evt);
            }
        });
        jPanel2.add(signup_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 340, 110, 40));

        forgot_password_label.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        forgot_password_label.setForeground(new java.awt.Color(31, 122, 231));
        forgot_password_label.setText("Forgot password?");
        forgot_password_label.setBorder(null);
        forgot_password_label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                forgot_password_labelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                forgot_password_labelMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                forgot_password_labelMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                forgot_password_labelMouseReleased(evt);
            }
        });
        jPanel2.add(forgot_password_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, -1, -1));

        admin_login_label.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        admin_login_label.setForeground(new java.awt.Color(31, 122, 231));
        admin_login_label.setText("Click here for Admin Login");
        admin_login_label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                admin_login_labelMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                admin_login_labelMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                admin_login_labelMouseReleased(evt);
            }
        });
        jPanel2.add(admin_login_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 460, -1, -1));

        jLabel6.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(31, 122, 231));
        jLabel6.setText("Employee Login");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/computer_sales.jpg"))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Welcome to Cssm");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 144, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void username_txtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_username_txtKeyReleased
       if((username_txt.getText()).equals("")){
           user_label.setEnabled(true);
           user_label.setVisible(true);
            user_label.setText("Enter username......");
        }else{
        user_label.setVisible(false);
        user_label.setEnabled(false);
        }
    }//GEN-LAST:event_username_txtKeyReleased

    private void username_txtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_username_txtKeyTyped
       if((username_txt.getText()).equals("")){
           user_label.setEnabled(true);
           user_label.setVisible(true);
            user_label.setText("Enter username......");
        }else{
        user_label.setVisible(false);
        user_label.setEnabled(false);
        }
    }//GEN-LAST:event_username_txtKeyTyped

    private void password_txtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_password_txtKeyReleased
        if((password_txt.getText()).equals("")){
           pass_label.setEnabled(true);
           pass_label.setVisible(true);
            pass_label.setText("Enter password......");
        }else{
        pass_label.setVisible(false);
        pass_label.setEnabled(false);
        }
    }//GEN-LAST:event_password_txtKeyReleased

    private void password_txtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_password_txtKeyTyped
        if((password_txt.getText()).equals("")){
           pass_label.setEnabled(true);
           pass_label.setVisible(true);
            pass_label.setText("Enter password......");
        }else{
        pass_label.setVisible(false);
        pass_label.setEnabled(false);
        }
    }//GEN-LAST:event_password_txtKeyTyped

    private void username_txtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_username_txtKeyPressed
        if(evt.getKeyCode()== KeyEvent.VK_ENTER){
            password_txt.requestFocus();
       }
    }//GEN-LAST:event_username_txtKeyPressed

    private void password_txtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_password_txtKeyPressed
       if(evt.getKeyCode()== KeyEvent.VK_ENTER){
            EmpHome.main(null);
            this.dispose();
            this.setVisible(false);
       }
    }//GEN-LAST:event_password_txtKeyPressed

    private void forgot_password_labelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forgot_password_labelMouseClicked
        ForgotPassword.main(null);
    }//GEN-LAST:event_forgot_password_labelMouseClicked

    private void forgot_password_labelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forgot_password_labelMousePressed
        forgot_password_label.setForeground(new Color(103,59,255));
    }//GEN-LAST:event_forgot_password_labelMousePressed

    private void forgot_password_labelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forgot_password_labelMouseReleased
        forgot_password_label.setForeground(new Color(31,122,231));
    }//GEN-LAST:event_forgot_password_labelMouseReleased

    private void signup_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signup_btnActionPerformed
        signup_Emp.main(null);
        this.dispose();
        this.setVisible(false);
    }//GEN-LAST:event_signup_btnActionPerformed

    private void admin_login_labelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_admin_login_labelMouseClicked
      Admin_login.main(null);
      this.dispose();
      this.setVisible(false);
    }//GEN-LAST:event_admin_login_labelMouseClicked

    private void admin_login_labelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_admin_login_labelMousePressed
      admin_login_label.setForeground(new Color(103,59,255));
    }//GEN-LAST:event_admin_login_labelMousePressed

    private void admin_login_labelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_admin_login_labelMouseReleased
       admin_login_label.setForeground(new Color(31,122,231));
    }//GEN-LAST:event_admin_login_labelMouseReleased

    private void forgot_password_labelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forgot_password_labelMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_forgot_password_labelMouseEntered

    private void login_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login_btnActionPerformed
        String SQL="SELECT Password FROM EMP_LOGIN WHERE Emp_ID='"+username_txt.getText()+"'";
        String pass=password_txt.getText();
        String passDB=SQL_Ops.getPassword(SQL);
        
        if(pass.equals(passDB) && !pass.isEmpty()){
            JOptionPane.showMessageDialog(null, "Login Successful");
            EmpHome.main(null);
            EmpHome.getEmpID(username_txt.getText());
            Customers.getEmpID(username_txt.getText());
            Settings.getEmpID(username_txt.getText());
            this.dispose();
        }
        else{
            JOptionPane.showMessageDialog(null, "Incorrect Password");
            password_txt.setText("");
        }
        //EmpHome.getEmpID(username_txt.getText());
    }//GEN-LAST:event_login_btnActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel admin_login_label;
    private javax.swing.JLabel forgot_password_label;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton login_btn;
    private javax.swing.JLabel pass_label;
    private javax.swing.JPasswordField password_txt;
    private javax.swing.JButton signup_btn;
    private javax.swing.JLabel user_label;
    private org.jdesktop.swingx.JXTextField username_txt;
    // End of variables declaration//GEN-END:variables
}