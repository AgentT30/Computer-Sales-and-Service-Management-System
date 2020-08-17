/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cssmp;

import static java.awt.image.ImageObserver.WIDTH;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author agentt
 */
public class SQL_Ops {
    
    static private Connection con=null;
    
    
    public static String DriverTest() {
        try{
               Class.forName("com.mysql.cj.jdbc.Driver");
               return "Driver Tested!";
           }
           catch(Exception e){
               System.out.println(e);
               return "Not found!";
           }
    }
    
    public static Connection getConnection(){
        String dbName="MINI_PROJ";
        String url="jdbc:mysql://127.0.0.1/"+dbName;
        String user="root";
        String pass="password";
        try{
            con=DriverManager.getConnection(url, user, pass);
        }
        catch(SQLException e){
            System.out.println("Connection error!"+e);
        }
        return con;
    }
    
    
    public static void UpdateTable(String SQL){
        try{
            Statement stmt=con.createStatement();
            stmt.executeUpdate(SQL);
            JOptionPane.showMessageDialog(null, "Table Updated!");
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public static ResultSet output(String sql){
        try{
            Statement stmt=con.createStatement();
            ResultSet rs;
            rs=stmt.executeQuery(sql);
            return rs;
        }
        catch(SQLException e){
            System.out.println(e);
            return null;
        }
    }
    
    public static void outputtoTableStock(ResultSet rs,javax.swing.JTable jTable1,javax.swing.JFrame frame){
        try{
             DefaultTableModel model=(DefaultTableModel) jTable1.getModel();
             model.setRowCount(0);
             
             while(rs.next()){
                 for(int i=1;i<=1;i++){
                    Object[] obj={rs.getString(1),rs.getString(2),rs.getInt(3),rs.getInt(4)};
                    model.addRow(obj);
                }
             }
             jTable1.setModel(model);
        }
        catch(SQLException e){
            System.out.print(e);
        }
    }
    
    
    public static String getPassword(String SQL){
        try{
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery(SQL);
            String pass="";
            while(rs.next()){
                pass=rs.getString(1);
            }
            return pass;
        }
        catch(SQLException e){
            System.out.println(e);
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
    
    
    public static void changePass(String pass){
        try{
            Statement stmt=con.createStatement();
            stmt.executeUpdate(pass);
            JOptionPane.showMessageDialog(null, "Password Successfully Changed");
        }
        catch(SQLException e){
            System.out.println(e);
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public static void outputtoTableCust(ResultSet rs,javax.swing.JTable Cust_Table,javax.swing.JFrame frame){
        try{
             DefaultTableModel model=(DefaultTableModel) Cust_Table.getModel();
             model.setRowCount(0);
             
             while(rs.next()){
                 for(int i=1;i<=1;i++){
                    Object[] obj={rs.getString(1),rs.getString(2),rs.getString(3),rs.getInt(4),rs.getString(5)};
                    model.addRow(obj);
                }
             }
             Cust_Table.setModel(model);
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
            System.out.print(e);
        }
    }
    
    public static void outputtoTableOrders(ResultSet rs,javax.swing.JTable Ord_Table,javax.swing.JFrame frame){
        try{
             DefaultTableModel model=(DefaultTableModel) Ord_Table.getModel();
             model.setRowCount(0);
             
             while(rs.next()){
                 for(int i=1;i<=1;i++){
                    Object[] obj={rs.getString(1),rs.getObject(2),rs.getInt(3),rs.getString(4),rs.getString(5),rs.getInt(6)};
                    model.addRow(obj);
                }
             }
             Ord_Table.setModel(model);
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
            System.out.print(e);
        }
    }
    
    public static void statusUpdate(String Sid,String Status){
        try{
            String SQL="{call updateStatus(?,?)}";
            CallableStatement cstmt=con.prepareCall(SQL);
            cstmt.setString(1, Status);
            cstmt.setString(2, Sid);
            cstmt.executeQuery();
            JOptionPane.showMessageDialog(null, "Status updated");
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error!");
            System.out.println(e);
        }
    }
    
    public static void outputtoTableServices(ResultSet rs,javax.swing.JTable Service_Table,javax.swing.JFrame frame){
        try{
             DefaultTableModel model=(DefaultTableModel) Service_Table.getModel();
             model.setRowCount(0);
             
             while(rs.next()){
                 for(int i=1;i<=1;i++){
                    Object[] obj={rs.getString(1),rs.getString(5),rs.getString(6),rs.getString(2),rs.getString(7),rs.getString(9),rs.getString(3),rs.getString(4)};
                    model.addRow(obj);
                }
             }
             Service_Table.setModel(model);
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
            System.out.print(e);
        }
    }
    
    public static void outputtoTableEmployee(ResultSet rs,javax.swing.JTable Service_Table,javax.swing.JFrame frame){
        try{
             DefaultTableModel model=(DefaultTableModel) Service_Table.getModel();
             model.setRowCount(0);
             
             while(rs.next()){
                 for(int i=1;i<=1;i++){
                    Object[] obj={rs.getString(1),rs.getString(2),rs.getString(3),rs.getInt(4),rs.getString(5)};
                    model.addRow(obj);
                }
             }
             Service_Table.setModel(model);
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
            System.out.print(e);
        }
    }
    
    public static ResultSet getCustID(String cust_name){
        ResultSet rs=null;
        try{
        String sql = "select Cust_ID from CUSTOMER where Cust_Name='"+cust_name+"'";
        Statement stmt = con.createStatement();
        rs = stmt.executeQuery(sql);
        }catch(Exception e){}
        return rs;
    }
    
    public static ResultSet getProduct_ID(String name) {
        ResultSet rs=null;
        try{
        Statement stmt = con.createStatement();
        String sql = "select P_ID from PRODUCTS where P_Name='"+name+"'";
        rs = stmt.executeQuery(sql);
        }
        catch(Exception e){};
        return rs;
    }

    public static ResultSet getP_Cost(String name) {
        ResultSet rs=null;
        try{
        Statement stmt = con.createStatement();
        String sql = "select P_Cost from PRODUCTS where P_Name='"+name+"'";
        rs = stmt.executeQuery(sql);
        }
        catch(Exception e){};
        return rs;
    }
    
    public static void delete_ordered_products(String date,String p_id,int qty){
        try{
        String sql = "delete from ORDERS where Date='"+date+"' and P_ID='"+p_id+"' and Quantity="+qty;
        Statement stmt = con.createStatement();
        stmt.executeUpdate(sql);
        JOptionPane.showMessageDialog(null,"Deleted!!");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }
    public static ResultSet getProduct_details(String p_name){
        ResultSet rs=null;
        try{
        Statement stmt = con.createStatement();
        String sql = "select * from PRODUCTS where P_Name='"+p_name+"'";
        rs = stmt.executeQuery(sql);
        }
        catch(Exception e){};
        return rs;
    }
    
    public static void forgotPass(String pass,String id){
        try{
            String SQL="{call resetPass(?,?)}";
            CallableStatement cstmt=con.prepareCall(SQL);
            cstmt.setString(1,id);
            cstmt.setString(2,pass);
            
            cstmt.executeQuery();
            JOptionPane.showMessageDialog(null,"Password Changed!");
        }
        catch(SQLException e){
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Error");
        }
    }
}
