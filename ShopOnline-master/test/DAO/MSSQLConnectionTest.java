/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import dao.MSSQLConnection;
import java.sql.Connection;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author DerickT
 */
public class MSSQLConnectionTest {
    
    public MSSQLConnectionTest() {
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
     * Test of getConection method, of class MSSQLConnection.
     */
    @Test
    public void testGetConection() {
        System.out.println("getConection");
        Connection con = MSSQLConnection.getConection();
        assertEquals(true, con!=null);
    }
    
}
