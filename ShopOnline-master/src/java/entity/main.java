/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Derick-T
 */
public class main {

 
    public static void main(String[] args) {
        ArrayList<Cart> cart = new ArrayList<>();
        ArrayList<Cart> cart2 = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        int m = 0;
        cart.add(new Cart(1, 2, 1));
        cart.add(new Cart(1, 2, 1));
        cart.add(new Cart(1, 2, 1));
        cart.add(new Cart(1, 2, 1));
        cart.add(new Cart(1, 2, 1));
        cart.add(new Cart(1, 2, 1));
        cart.add(new Cart(1, 2, 1));
        cart.add(new Cart(1, 2, 1));
        cart.add(new Cart(1, 2, 1));
        cart.add(new Cart(1, 2, 1));
        cart.add(new Cart(1, 2, 1));

       
        for (int i = 0; i < cart.size(); i++) {
            for (int j = i + 1; j < cart.size(); j++) {
                if (cart.get(i).getProductID() == cart.get(j).getProductID()) {
                    cart.remove(j);
                    cart.set(i, new Cart(cart.get(i).getProductID(), cart.get(i).getProductPrice(), cart.get(i).getQuantity() + 1));
                    j -= 1;
                }
            }
        }
        

        //0 1 2 3 4
        // 1 2 3 4 5
        
        for (Cart s : cart) {
            System.out.println(s.toString());
        }
    }
}
