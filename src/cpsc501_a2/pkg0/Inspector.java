/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpsc501_a2.pkg0;

import java.util.Vector;
import java.lang.reflect.*;

/**
 *
 * @author shshunda
 */
public class Inspector {
    
    public void inspect(Object obj, boolean recursive) {
        // Following Jordan Kidney's "ObjectInspector.java",
        // use a Vector as a data structure for storing objects
        Vector objectsToInspect = new Vector();
        
        // Create instance of a class object based on the method input
        // To be used for every subsequent introspection.
        Class classObject = obj.getClass();
        
        /*
        * Programming Plan, before applying any refactoring
        * or unit testing. Most of these are just library method calls.
        * Referencing the Java library: (java.lang.reflect)
        */
        // Name of the declaring class 
        // Name of the declaring superclass 
        // Name of the interfaces the class implements
        // Methods the class declares
            // Exceptions
            // Parameter types
            // Return type
            // Modifiers
        // Constructors the class declares
            // Type
            // Modifiers
        // Current value of each field. If recursive == false, print
        // out the reference value.
        
        
        
        
    }
    
}
