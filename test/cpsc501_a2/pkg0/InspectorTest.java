/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpsc501_a2.pkg0;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author shshunda
 */
public class InspectorTest {
    Inspector inspect;
    Object obj;
    Class classObject;
    
    public InspectorTest() {
        inspect = new Inspector();
        obj = new ClassA();
        classObject = obj.getClass();
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
     * Test of inspect method, of class Inspector.
     */
    @Test
    public void testInspect() {
        System.out.println("inspect");
        Object obj = null;
        boolean recursive = false;
        Inspector instance = new Inspector();
        instance.inspect(obj, recursive);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSuper method, of class Inspector.
     * First test generated to test whether the 
     * refactored version is getting the correct superclass
     * of a mock object (as given above - ClassA).
     * PASSED TEST USING CLASSA. Can repeat this ad infinitum
     * using any number of the mock classes that were provided
     * by the TA.
     */
    @Test
    public void testGetSuper() {
        System.out.println("getSuper");
        String expResult = "class java.lang.Object";
        String result = inspect.getSuper(classObject);
        assertEquals(expResult, result);
    }

    /**
     * Test of getDeclaring method, of class Inspector.
     * Second test generated to test whether the correct
     * declaring class is being returned as a String.
     * PASSED TEST USING CLASSA. "inspect" method still 
     * failing, as expected.
     */
    @Test
    public void testGetDeclaring() {
        System.out.println("getDeclaring");
        String expResult = "class java.lang.Object";
        String result = inspect.getSuper(classObject);
        assertEquals(expResult, result);
    }

    /**
     * Test of getClassInterfaces method, of class Inspector.
     */
    @Test
    public void testGetClassInterfaces() {
        System.out.println("getClassInterfaces");
        Class[] x = null;
        Inspector instance = new Inspector();
        Class[] expResult = null;
        Class[] result = instance.getClassInterfaces(x);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
