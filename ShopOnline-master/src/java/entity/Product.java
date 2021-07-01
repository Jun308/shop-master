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
public class Product {

    private int id;
    private String name;
    private int category_Id;
    private double price;
    private String description;
    private int quantity;
    private int status;
    private String image_Link;
    private String note;

    public Product(int id, String name, int category_Id, double price, String description, int quantity, int status, String image_Link, String note) {
        this.id = id;
        this.name = name;
        this.category_Id = category_Id;
        this.price = price;
        this.description = description;
        this.quantity = quantity;
        this.status = status;
        this.image_Link = image_Link;
        this.note = note;
    }

    public Product(int id, String name, double price, String description, int quantity, int status, String note) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
        this.quantity = quantity;
        this.status = status;
        this.note = note;
    }

    public Product(String name, int category_Id, double price, String description, int quantity, int status, String image_Link, String note) {
        this.name = name;
        this.category_Id = category_Id;
        this.price = price;
        this.description = description;
        this.quantity = quantity;
        this.status = status;
        this.image_Link = image_Link;
        this.note = note;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCategory_Id() {
        return category_Id;
    }

    public void setCategory_Id(int category_Id) {
        this.category_Id = category_Id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getImage_Link() {
        return image_Link;
    }

    public void setImage_Link(String image_Link) {
        this.image_Link = image_Link;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "Product{" + "id=" + id + ", name=" + name + ", category_Id=" + category_Id + ", price=" + price + ", description=" + description + ", quantity=" + quantity + ", status=" + status + ", image_Link=" + image_Link + ", note=" + note + '}';
    }

}
