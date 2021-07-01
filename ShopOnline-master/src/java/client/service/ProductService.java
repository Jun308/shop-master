/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client.service;

import entity.Product;
import java.util.ArrayList;
import model.ProductModel;

/**
 *
 * @author Derick-T
 */
public class ProductService {

    ProductModel productModel = new ProductModel();

    public ArrayList<Product> getAll() {
        return productModel.getAll();
    }

    public Product getOne(int id) {
        return productModel.getOne(id);
    }

    public ArrayList<Product> getAllProductByCategory(int categoryid) {
        return productModel.getAllProductByCategory(categoryid);
    }

    public ArrayList<Product> getProductByIdAndName(int categoryid, String name){
        return productModel.getProductByIdAndName(categoryid, name);
    }
}
