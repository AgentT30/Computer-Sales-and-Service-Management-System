/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cssmp;

import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author rajeshwari
 */
public class CssmP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws Exception{ 
       SQL_Ops.DriverTest();
       SQL_Ops.getConnection();
       Login.main(null);
       //ResultSet rs=SQL_Ops.getCustID("Ajay");
       //rs.next();
       //System.out.println(rs.getString(1));*/
       
    }
    
}
