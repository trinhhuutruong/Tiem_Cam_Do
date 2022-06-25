/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import java.io.Serializable;
import java.sql.Date;

/**
 *
 * @author Admin
 */
public class BillDTO implements Serializable {
    private int billID;
    private int itemID;
    private int pawnMoney;
    private int numberDays;
    private float interestRate;
    private Date billBeginDate;
    private StaffDTO staffID;
    private int returnMoney;
    private boolean statusID;

    public BillDTO() {
    }

    public BillDTO(int billID, int itemID, int pawnMoney, int numberDays, float interestRate, Date billBeginDate, StaffDTO staffID, int returnMoney, boolean statusID) {
        this.billID = billID;
        this.itemID = itemID;
        this.pawnMoney = pawnMoney;
        this.numberDays = numberDays;
        this.interestRate = interestRate;
        this.billBeginDate = billBeginDate;
        this.staffID = staffID;
        this.returnMoney = returnMoney;
        this.statusID = statusID;
    }

    public int getBillID() {
        return billID;
    }

    public void setBillID(int billID) {
        this.billID = billID;
    }

    public int getItemID() {
        return itemID;
    }

    public void setItemID(int itemID) {
        this.itemID = itemID;
    }

    public int getPawnMoney() {
        return pawnMoney;
    }

    public void setPawnMoney(int pawnMoney) {
        this.pawnMoney = pawnMoney;
    }

    public int getNumberDays() {
        return numberDays;
    }

    public void setNumberDays(int numberDays) {
        this.numberDays = numberDays;
    }

    public float getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(float interestRate) {
        this.interestRate = interestRate;
    }

    public Date getBillBeginDate() {
        return billBeginDate;
    }

    public void setBillBeginDate(Date billBeginDate) {
        this.billBeginDate = billBeginDate;
    }

    public StaffDTO getStaffID() {
        return staffID;
    }

    public void setStaffID(StaffDTO staffID) {
        this.staffID = staffID;
    }

    public int getReturnMoney() {
        return returnMoney;
    }

    public void setReturnMoney(int returnMoney) {
        this.returnMoney = returnMoney;
    }

    public boolean isStatusID() {
        return statusID;
    }

    public void setStatusID(boolean statusID) {
        this.statusID = statusID;
    }

    
}
