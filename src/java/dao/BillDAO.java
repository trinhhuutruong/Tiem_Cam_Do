/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dto.BillDTO;
import dto.CustomerDTO;
import dto.ItemDTO;
import dto.StaffDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.sql.Date;
import java.sql.SQLException;
import utils.DBConnect;

/**
 *
 * @author Admin
 */
public class BillDAO {

    Connection con = null;
    PreparedStatement stm = null;
    ResultSet rs = null;

    public ArrayList<BillDTO> getAllBill() throws SQLException {
        ArrayList<BillDTO> bill = null;

        try {
            con = DBConnect.makeConnection();

            String sql = "Select billID, itemID, pawnMoney, numberDays, interestRate, billBeginDate, staffID, returnMoney, statusID "
                    + "From tblBill";

            stm = con.prepareStatement(sql);

            rs = stm.executeQuery();

            while (rs.next()) {
                if (bill == null){
                    bill = new ArrayList<>();
                }
                int billID = rs.getInt("billID");
                int itemID = rs.getInt("itemID");
                int pawnMoney = rs.getInt("pawnMoney");
                int numberDays = rs.getInt("numberDays");
                float interestRate = rs.getFloat("interestRate");
                Date billBeginDate = rs.getDate("billBeginDate");
                String staffID = rs.getString("staffID");
                StaffDAO std = new StaffDAO();
                int returnMoney = rs.getInt("returnMoney");
                boolean statusID = rs.getBoolean("statusID");
                
                BillDTO b = new BillDTO(billID, itemID, pawnMoney, numberDays, interestRate, billBeginDate, std.viewStaff(staffID),returnMoney,statusID);
                bill.add(b);
            }
        } catch (Exception e) {
            e.printStackTrace();
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
        return bill;
    }

    public ArrayList<BillDTO> getBillByBillID(int id) throws SQLException {
        ArrayList<BillDTO> list = new ArrayList<>();

        try {
            con = DBConnect.makeConnection();
            String sql = "Select itemID, pawnMoney, numberDays, interestRate, billBeginDate, staffID, returnMoney, statusID "
                    + "From tblBill "
                    + "Where billID = ? ";

            stm = con.prepareStatement(sql);
            stm.setInt(1, id);

            rs = stm.executeQuery();
            while (rs.next()) {
                int itemID = rs.getInt("itemID");
                int pawnMoney = rs.getInt("pawnMoney");
                int numberDays = rs.getInt("numberDays");
                float interestRate = rs.getFloat("interestRate");
                Date billBeginDate = rs.getDate("billBeginDate");
                String staffID = rs.getString("staffID");
                int returnMoney = rs.getInt("returnMoney");
                boolean statusID = rs.getBoolean("statusID");

                StaffDAO std = new StaffDAO();
                BillDTO b = new BillDTO(id, itemID, pawnMoney, numberDays, interestRate, billBeginDate, std.viewStaff(staffID),returnMoney,statusID);
                list.add(b);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
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
        return list;
    }
    
    public ArrayList<BillDTO> getBillByIdItem(int id) throws SQLException {
        ArrayList<BillDTO> list = new ArrayList<>();

        try {
            con = DBConnect.makeConnection();
            String sql = "Select billID, itemID, pawnMoney, numberDays, interestRate, billBeginDate, staffID, returnMoney, statusID "
                    + "From tblBill "
                    + "Where itemID = ? ";

            stm = con.prepareStatement(sql);
            stm.setInt(1, id);

            rs = stm.executeQuery();
            while (rs.next()) {
                int billID = rs.getInt("billID");
                int pawnMoney = rs.getInt("pawnMoney");
                int numberDays = rs.getInt("numberDays");
                float interestRate = rs.getFloat("interestRate");
                Date billBeginDate = rs.getDate("billBeginDate");
                String staffID = rs.getString("staffID");
                int returnMoney = rs.getInt("returnMoney");
                boolean statusID = rs.getBoolean("statusID");

                StaffDAO std = new StaffDAO();
                BillDTO b = new BillDTO(billID, id, pawnMoney, numberDays, interestRate, billBeginDate, std.viewStaff(staffID), returnMoney,statusID);
                list.add(b);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
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
        return list;
    }

    public CustomerDTO getCustomerByItemID(BillDTO bill) throws SQLException {
        CustomerDTO cus = new CustomerDTO();
        CustomerDAO daoCus = new CustomerDAO();
        ItemDTO item = new ItemDTO();
        ItemDAO daoItem = new ItemDAO();

        item = daoItem.viewItem(bill.getItemID());
        cus = daoCus.viewCus(item.getCustomerID());
        return cus;
    }
    
    public boolean insertBill(int itemID, int pawnMoney, int numberDays, float interestDays, Date beginDate, StaffDTO staffID, int returnMoney, boolean statusID) throws SQLException{
        boolean check = false;
        try{
            con = DBConnect.makeConnection();
            if(con != null){
                String sql = "Insert into Bill(itemID, pawnMoney, numberDays, interestRate, billBeginDate, staffID, returnMoney, statusID ) "
                            +"Values (?, ?, ?, ?, ?, ?, ?, ?)";
                stm = con.prepareStatement(sql);
                stm.setInt(1, itemID);
                stm.setInt(2, pawnMoney);
                stm.setInt(3, numberDays);
                stm.setFloat(4, interestDays);
                stm.setDate(5, beginDate);
                stm.setString(6, staffID.getStaffID());
                stm.setInt(7, returnMoney);
                stm.setBoolean(8, statusID);
                
                check  = stm.executeUpdate()> 0;

            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        finally {
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
        
        return check;
    }
    
    public boolean createCustomer(CustomerDTO cus) throws SQLException, ClassNotFoundException {
        boolean check = false;
        try {
            con = DBConnect.makeConnection();
            if (con != null) {
                String sql = "INSERT INTO tblCustomer (customerID,fullname,phoneNumber,address,statusID) values (?, ?, ?, ?, 1)";
                stm = con.prepareStatement(sql);
                stm.setString(1, cus.getCustomerID());
                stm.setString(2, cus.getFullname());
                stm.setInt(3, cus.getPhoneNumber());
                stm.setString(4, cus.getAddress());
                check = stm.executeUpdate() > 0 ? true : false;
            }
        } finally {
            if (stm != null) {
                stm.close();
            }
            if (con != null) {
                con.close();
            }
        }
        return check;
    }
    private final String CREATE_ITEM = "INSERT INTO tblItem (itemID,itemName,itemPic,customerID,storeID,itemSendingDate,itemGettingDate,statusID,isKeep) values (?, ?, ?, ?, ?, ?, ?, 1, 0);";
    public boolean createItem(ItemDTO item) throws SQLException, ClassNotFoundException {
        boolean check = false;
        try {
            con = DBConnect.makeConnection();
            if (con != null) {
                stm = con.prepareStatement(CREATE_ITEM);
                stm.setInt(1, item.getItemID());
                stm.setString(2, item.getItemName());
                stm.setString(3, item.getItemPic());
                String itemPic = rs.getString("itemPic");
                stm.setString(4, item.getCustomerID());
                stm.setInt(5, item.getStoreID());
                stm.setDate(6, item.getItemSendingDate());
                stm.setDate(7, item.getItemGettingDate());
                stm.setBoolean(8, item.isStatusID());
                stm.setBoolean(9, item.isIsKeep());
                check = stm.executeUpdate() > 0 ? true : false;
            }
        } finally {
            if (stm != null) {
                stm.close();
            }
            if (con != null) {
                con.close();
            }
        }
        return check;
    }

}
