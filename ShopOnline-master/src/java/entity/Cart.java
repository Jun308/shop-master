/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.Comparator;

/**
 *
 * @author Derick-T
 */
public class Cart {
    private int productID;
    private String name;
    private double productPrice;
    private int quantity;

    public Cart(int productID, String name, double productPrice, int quantity) {
        this.productID = productID;
        this.name = name;
        this.productPrice = productPrice;
        this.quantity = quantity;
    }

    public Cart(int productID, double productPrice, int quantity)  {
        this.productID = productID;
        this.productPrice = productPrice;
        this.quantity = quantity;
    }

    
    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cart{" + "productID=" + productID + ", productPrice=" + productPrice + ", quantity=" + quantity + '}';
    }

    

    
    
}
