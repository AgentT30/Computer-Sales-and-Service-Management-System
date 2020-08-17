/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cssmp;

import com.mysql.cj.protocol.Resultset;
import com.mysql.cj.x.protobuf.MysqlxPrepare;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Vector;

/**
 *
 * @author rajeshwari
 */
public class JdbcConnection {
    static private Connection con;
    public static int driverTest(){
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        return 1;
        }
        catch(ClassNotFoundException e){
            return -1;
        }
    }
    public static int createConnection(){
        String usrid="root";
        String pswd="password";
        String hostname="127.0.0.1";
        String dbname="student";
        String url = "jdbc:mysql://"+hostname+":3306/"+dbname;
        try{
            con = DriverManager.getConnection(url,usrid,pswd);
            return 1;
        }catch(Exception e){
            con=null;
            return -1;
        }
    }
    public static int UPDATE_TABEL(String sql){
        try{
            Statement st = con.createStatement();
            st.executeUpdate(sql);
            return 1;
        }catch(SQLException ex){
            System.out.println(ex);
            return -1;
        }
    }
    public static ResultSet getData(){
        try{
        Statement stmt=con.createStatement();
       ResultSet rs=null;
        String sql = "select * from student;";
        rs = stmt.executeQuery(sql);
        return rs;
        }catch(Exception e){
            return null;
        }
    }
}
