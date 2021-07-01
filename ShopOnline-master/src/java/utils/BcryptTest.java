/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

/**
 *
 * @author nhatl
 */
public class BcryptTest {

    public static void main(String[] args) {
        
        String password = "123456";
        
        // Hash a password for the first time
        String hashed = BCrypt.hashpw(password, BCrypt.gensalt());
        System.out.println(hashed);
        
        //$2a$10$Ddiwwl0XXIBFFfXNiKb1I.DYx6m.Ca9NRyEKPl0qTFx/zL0e8o2la
        //$2a$10$ArAh4WpUj4siE82rybY8I.3YUTH9/s0z5ou2GPh5M1JPvC5/63OZm

        // gensalt's log_rounds parameter determines the complexity
        // the work factor is 2**log_rounds, and the default is 10
        // String hashed = BCrypt.hashpw(password, BCrypt.gensalt(12));

        // Check that an unencrypted password matches one that has
        // previously been hashed
        if (BCrypt.checkpw("123456", "$2a$10$KJ4weS.qut.R4NHYL8tPc.pWjHztesTOAFZTN1iuekOZYQEem6fZO")) {
            System.out.println("It matches");
        } else {
            System.out.println(
                    "It does not match");
        }
    }
}
