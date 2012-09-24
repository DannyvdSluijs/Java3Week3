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
public class AutoTest {
    
    public AutoTest() {
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
     * Test of getWaarde method, of class Auto.
     */
    @Test
    public void testGetWaarde() {
        System.out.println("getWaarde");
        Auto instance = new Auto("Citroen", 25000, 2009, "26 GR NJ");
        double expResult = 16000.0;
        double result = instance.getWaarde();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of toString method, of class Auto.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Auto instance = new Auto("Citroen", 25000, 2009, "26 GR NJ");
        String expResult = 
            "auto met het kenteken 26 GR NJ\n" +
            "merk is Citroen\n" +
            "nieuwprijs was 25000.0\n" +
            "bouwjaar is 2009\n" +
            "huidige waarde is 16000.0";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
}
