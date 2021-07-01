/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import entity.Account;
import java.util.ArrayList;
import model.AccountModel;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Derick-T
 */
public class AccountModelTest {
    
    public AccountModelTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getAll method, of class AccountModel.
     */
    @Test
    public void testGetAll() {
        System.out.println("getAll");
        AccountModel instance = new AccountModel();
        ArrayList<Account> expResult = null;
        ArrayList<Account> result = instance.getAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class AccountModel.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Account account = null;
        AccountModel instance = new AccountModel();
        boolean expResult = false;
        boolean result = instance.add(account);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of login method, of class AccountModel.
     */
    @Test
    public void testLogin() {
        System.out.println("login");
        String email = "admin@gmail.com";
        String password = "123456";
        AccountModel instance = new AccountModel();
        Account result = instance.login(email, password);
        assertEquals(true, result != null);
    }

    /**
     * Test of getOne method, of class AccountModel.
     */
    @Test
    public void testGetOne() {
        System.out.println("getOne");
        int id = 0;
        AccountModel instance = new AccountModel();
        Account expResult = null;
        Account result = instance.getOne(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class AccountModel.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        Account obj = null;
        AccountModel instance = new AccountModel();
        boolean expResult = false;
        boolean result = instance.update(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class AccountModel.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        int id = 0;
        AccountModel instance = new AccountModel();
        boolean expResult = false;
        boolean result = instance.delete(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
