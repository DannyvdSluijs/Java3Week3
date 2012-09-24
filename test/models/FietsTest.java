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
public class FietsTest {
    
    public FietsTest() {
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
     * Test of getWaarde method, of class Fiets.
     */
    @Test
    public void testGetWaarde() {
        System.out.println("getWaarde");
        Fiets instance = new Fiets("Gazelle", 1190, 2012, "mountainbike");
        double expResult = 1190.0;
        double result = instance.getWaarde();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of toString method, of class Fiets.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Fiets instance = new Fiets("Gazelle", 1190, 2012, "mountainbike");
        String expResult = 
            "fiets van het type mountainbike\n" +
            "merk is Gazelle\n" +
            "nieuwprijs was 1190.0\n" +
            "bouwjaar is 2012\n" +
            "huidige waarde is 1190.0";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
}
