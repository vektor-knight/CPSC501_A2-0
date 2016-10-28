/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Vector;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author vektor
 */
public class InspectorTest {
    
    public InspectorTest() {
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
     * Passed
     */
    @Test
    public void testInspect() {
        System.out.println("inspect");
        Object obj = new ClassA(); 
// As many objects as we  can be added, but
// since we know what the contents
// of our target classes are, one will suffice.
        boolean recursive = false;
        Inspector instance = new Inspector();
        instance.inspect(obj, recursive);
    }

    /**
     * Test of getClassInterfaces method, of class Inspector.
     */
    @Test
    public void testGetClassInterfaces() throws Exception {
        System.out.println("getClassInterfaces");
        Object obj = new ClassB();
        Class x = obj.getClass();
        Inspector instance = new Inspector();
        Class<?> expResult = obj.getClass();
        Class<?>[] exp = expResult.getInterfaces();
        Class[] result = instance.getClassInterfaces(x);
        assertArrayEquals(exp, result);
    }

    /**
     * Test of getMethods method, of class Inspector.
     * Expected turns out being 72, but the result of my method call is 5857.
     * I know this isn't true when I look at the output, but it's 
     * likely a question of syntax as opposed to correctness. My
     * previous tests were all wrappers around library methods in reflect.
     * I think that in this case, the "length" of an object in an array of type
     * Method[], at the meta level, refers to "addresses", which have far more
     * characters describing their nature, before they are cast down to a String
     * or some other reasonable data type.
     */
    @Test
    public void testGetMethods() {
        System.out.println("getMethods");
        Class x = ClassB.class.getClass();
        Inspector instance = new Inspector();
        Method[] expResult = x.getMethods();
        String result = instance.getMethods(x);
        assertEquals(expResult.length, result.length());
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getExceptions method, of class Inspector.
     * passed
     */
    @Test
    public void testGetExceptions() {
        System.out.println("getExceptions");
        Method m = ClassA.class.getMethods()[0];
        Inspector instance = new Inspector();
        String expResult = instance.getExceptions(m);
        String result = null;
        assertEquals(expResult, result);
    }

    /**
     * Test of getParameters method, of class Inspector.
     * passed
     */
    @Test
    public void testGetParameters() {
        System.out.println("getParameters");
        Method m = ClassA.class.getMethods()[0];
        Inspector instance = new Inspector();
        String expResult = instance.getParameters(m);
        String result = null;
        assertEquals(expResult, result);
    }

    /**
     * Test of getReturnType method, of class Inspector.
     * passed.
     */
    @Test
    public void testGetReturnString() {
        System.out.println("getReturnType");
        Method m = ClassA.class.getMethods()[0];
        Inspector instance = new Inspector();
        String expResult = "void";
        String result = instance.getReturnType(m).toString();
        assertEquals(expResult, result);
    }

    /**
     * Test of getModifiers method, of class Inspector.
     */
    @Test
    public void testGetModifiers() {
        System.out.println("getModifiers");
        Method m = null;
        Inspector instance = new Inspector();
        String expResult = "";
        String result = instance.getModifiers(m);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getConstructors method, of class Inspector.
     */
    @Test
    public void testGetConstructors() {
        System.out.println("getConstructors");
        Class x = null;
        Inspector instance = new Inspector();
        String expResult = "";
        String result = instance.getConstructors(x);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getConstParams method, of class Inspector.
     */
    @Test
    public void testGetConstParams() {
        System.out.println("getConstParams");
        Constructor x = null;
        Inspector instance = new Inspector();
        String expResult = "";
        String result = instance.getConstParams(x);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getConstMods method, of class Inspector.
     */
    @Test
    public void testGetConstMods() {
        System.out.println("getConstMods");
        Constructor x = null;
        Inspector instance = new Inspector();
        String expResult = "";
        String result = instance.getConstMods(x);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of inspectMethods method, of class Inspector.
     */
    @Test
    public void testInspectMethods() {
        System.out.println("inspectMethods");
        Object obj = null;
        Class classObject = null;
        Inspector instance = new Inspector();
        instance.inspectMethods(obj, classObject);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of inspectConstructor method, of class Inspector.
     */
    @Test
    public void testInspectConstructor() {
        System.out.println("inspectConstructor");
        Object obj = null;
        Class classObject = null;
        Inspector instance = new Inspector();
        instance.inspectConstructor(obj, classObject);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of inspectInterfaces method, of class Inspector.
     */
    @Test
    public void testInspectInterfaces() {
        System.out.println("inspectInterfaces");
        Object obj = null;
        Class classObj = null;
        Inspector instance = new Inspector();
        instance.inspectInterfaces(obj, classObj);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of inspectSuperClass method, of class Inspector.    
     * Passed
     */
    @Test
    public void testInspectSuperClass() {
        System.out.println("inspectSuperClass");
        Object obj = new ClassA();
        Class classObj = obj.getClass();
        Vector objectsToInspect = null;
        Inspector instance = new Inspector();
        instance.inspectSuperClass(obj, classObj, objectsToInspect);
    }
    
}
