/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author Derick-T
 */
public class OrderPro {
    private int id;
    private int accountID;
    private String Date;
    private double totalPrice;
    private int status;

    public OrderPro(int id, int accountID, String Date, double totalPrice) {
        this.id = id;
        this.accountID = accountID;
        this.Date = Date;
        this.totalPrice = totalPrice;
    }

    public OrderPro(int id, int accountID, String Date, double totalPrice, int status) {
        this.id = id;
        this.accountID = accountID;
        this.Date = Date;
        this.totalPrice = totalPrice;
        this.status = status;
    }

    public OrderPro(int accountID, String Date, double totalPrice) {
        this.accountID = accountID;
        this.Date = Date;
        this.totalPrice = totalPrice;
    }

    public OrderPro(int accountID, String Date, double totalPrice, int status) {
        this.accountID = accountID;
        this.Date = Date;
        this.totalPrice = totalPrice;
        this.status = status;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAccountID() {
        return accountID;
    }

    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
    
}
