/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author danny
 */
public class ComputerTest {
    
    public ComputerTest() {
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
     * Test of getWaarde method, of class Computer.
     */
    @Test
    public void testGetWaarde() {
        System.out.println("getWaarde");
        Computer instance = new Computer("HP", 2000, 2009);
        double expResult = 432.0;
        double result = instance.getWaarde();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of toString method, of class Computer.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Computer instance = new Computer("HP", 2000, 2009);
        String expResult = 
            "computer van het merk HP\n" +
            "nieuwprijs was 2000.0\n" +
            "bouwjaar is 2009\n" +
            "huidige waarde is 432.0";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
}
