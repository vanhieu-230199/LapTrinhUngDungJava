/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tuan6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class DBConnection {
    public static Connection getConnection(){
        Connection conn = null; //tao doi tuong ket noi moi = gia tri rong
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            try {
                //gan gia tri cho conn 
                conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433 ; databaseName=DBEMPLOY ; user=sa ; password=hieu123");
                System.out.println("ket noi thanh cong");
            } catch (SQLException ex) {
                Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("khong tim thay database");
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
             System.out.println("khong tim thay driver");
        }
        
        
        return conn; //tra ve gia tri la conn
    }
    
    
    //ham lay thong tin database
    public static ArrayList<Employees> getAllEmployees(){
        ArrayList<Employees> listEmployees  = new ArrayList<>();
        //tao doi tuong connect
        Connection conn = DBConnection.getConnection();
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select * from emloyee");
            while(rs.next()){
                int id= rs.getInt("id");
                String name= rs.getString("name");
                String address= rs.getString("address");
                String gender= rs.getString("gender");
                String knowledge= rs.getString("knowledge");
                String subject= rs.getString("subject");
                
                Employees employee = new Employees(id, name, address, gender, knowledge, subject);
                listEmployees.add(employee);
            }
        } catch (Exception e) {
        }
        
        return listEmployees;
    }
    
    
    //ham save
    public static boolean addEmployees(Employees emp){
        String querry="INSERT INTO emloyee(id, name,  address,  gender, knowledge  , subject)  " + "  VALUES( ? , ? , ? , ? , ? ,?)";
        Connection conn = DBConnection.getConnection();
        
        try {
            //tao doi tuong tuc thi cau lenh update trong sql
            PreparedStatement ps = conn.prepareStatement(querry);
            ps.setInt(1, emp.getId());
            ps.setString(2, emp.getName());
            ps.setString(3, emp.getAddress());
            ps.setString(4, emp.getGender());
            ps.setString(5, emp.getKnowledge());
            ps.setString(6, emp.getSubject());
            
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

 