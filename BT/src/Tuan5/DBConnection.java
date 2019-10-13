/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tuan5;

import Tuan5.bookSupplier;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Hieu
 */
public class DBConnection {
    public static Connection getConnection(){
        Connection conn= null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            try {
                conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433 ; databaseName=SUPPLIERS ; user=sa ; password=hieu123");
                System.out.println("ket noi thanh cong");
            } catch (SQLException ex) {
                Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("khong tim thay database");
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
             System.out.println("khong tim thay driver");
        }
        return conn;
    }
    public static ArrayList<bookSupplier> getAllbookSupplier(){
        ArrayList<bookSupplier> listbookSupplier  = new ArrayList<>();
        //tao doi tuong connect
        Connection conn = DBConnection.getConnection();
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select * from suppliers");
            while(rs.next()){
                int ID= rs.getInt("ID");
                String Name= rs.getString("Name");
                String Type= rs.getString("Type");
                String Address= rs.getString("Address");
                int Contact= rs.getInt("Contact");
                String Email= rs.getString("Email");
                String Remarks= rs.getString("Remarks");
                
                bookSupplier supplier= new bookSupplier(ID, Contact,  Name,  Type,  Address,  Email,  Remarks);
                listbookSupplier.add(supplier);
            }
        } catch (Exception e) {
        }
        
        return listbookSupplier;
    }
    
    public static boolean addbookSupplier(bookSupplier emp){
        String querry="INSERT INTO suppliers(ID, Name, Type,  Address,  Contact, Email  , Remarks)  " + "  VALUES( ? , ? , ? , ? , ? ,?,?)";
        Connection conn = DBConnection.getConnection();
        
        try {
            //tao doi tuong tuc thi cau lenh update trong sql
            PreparedStatement ps = conn.prepareStatement(querry);
            ps.setInt(1, emp.getID());
            ps.setString(2, emp.getName());
            ps.setString(3, emp.getType());
            ps.setString(4, emp.getAddress());
            ps.setInt(5, emp.getContact());
            ps.setString(6, emp.getEmail());
            ps.setString(7, emp.getRemarks());
            
            return  ps.executeUpdate() > 0;
        } catch (Exception e) {
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
   
        return  false;
    }
    
    public static void main(String[] args) {
        System.out.println(getConnection());
        
    }

    
}
