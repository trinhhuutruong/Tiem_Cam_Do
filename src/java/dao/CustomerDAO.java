/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dto.BillDTO;
import dto.CustomerDTO;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import utils.DBConnect;

/**
 *
 * @author Admin
 */
public class CustomerDAO {
    Connection con = null;
    PreparedStatement stm = null;
    ResultSet rs = null;

    public ArrayList<CustomerDTO> getAllCus() throws SQLException{
        ArrayList<CustomerDTO> cus = new ArrayList<>();
        
        try{
            con = DBConnect.makeConnection();
            
            String sql = "Select customerID, fullname, phoneNumber, address, statusID "
                        +"From tblCustomer";
            stm = con.prepareStatement(sql);
            
            rs = stm.executeQuery();
            
            while(rs.next()){
                String customerID = rs.getString("customerID");
                String fullname = rs.getString("fullname");
                int phoneNumber = rs.getInt("phoneNumber");
                String address = rs.getString("address");
                boolean statusID = rs.getBoolean("statusID");
                
                CustomerDTO c = new CustomerDTO(customerID, fullname, phoneNumber, address, statusID);
                cus.add(c);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        finally{
            if(rs != null){
                rs.close();
            }
            if(stm != null){
                stm.close();
            }
            if(con != null){
                con.close();
            }
        }
        return cus;
    }
     public CustomerDTO viewCus(String id) throws SQLException {
        try {
            con = DBConnect.makeConnection();
            if (con != null) {
                String sql = "select fullname, phoneNumber, address, statusID "
                            +"from tblCustomer "
                            +"where customerID = ? ";
                stm = con.prepareStatement(sql);
                stm.setString(1, id);
                rs = stm.executeQuery();
                if (rs.next()) {
           
                    String fullName = rs.getString("fullname");
                    int phoneNumber = rs.getInt("phoneNumber");
                    String address = rs.getString("address");
                    boolean statusID = rs.getBoolean("statusID");
                    
                    CustomerDTO staff = new CustomerDTO(id, fullName, phoneNumber, address, statusID);
                    return staff;
                }
            }
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (stm != null) {
                stm.close();
            }
            if (con != null) {
                con.close();
            }
        }
        return null;
    }
     
     public int updateCustomer(CustomerDTO customerUpdate) throws SQLException, ClassNotFoundException {
        int result = 0;
        try {
            con = DBConnect.makeConnection();
            if (con != null) {
                String sql = "Update tblCustomer SET phoneNumber = ?, address = ?, statusID = ? "
                        + " WHERE customerID = ?";
                stm = con.prepareStatement(sql);
                stm.setInt(1, customerUpdate.getPhoneNumber());
                stm.setString(2, customerUpdate.getAddress());
                stm.setBoolean(3, customerUpdate.isStatusID());
                stm.setString(4, customerUpdate.getCustomerID());
                result = stm.executeUpdate();
            }
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (stm != null) {
                stm.close();
            }
            if (con != null) {
                con.close();
            }
        }
        return result;
    }
    
}
