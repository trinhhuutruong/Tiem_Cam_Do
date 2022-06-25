/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import java.io.Serializable;

/**
 *
 * @author Admin
 */
public class CustomerDTO implements Serializable {
    private String customerID;
    private String fullname;
    private int phoneNumber;
    private String address;
    private boolean statusID;

    public CustomerDTO() {
    }

    public CustomerDTO(String customerID, String fullname, int phoneNumber, String address, boolean statusID) {
        this.customerID = customerID;
        this.fullname = fullname;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.statusID = statusID;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isStatusID() {
        return statusID;
    }

    public void setStatusID(boolean statusID) {
        this.statusID = statusID;
    }

   
}
