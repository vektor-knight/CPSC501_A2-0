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
        Class declaringClass = classObject.getDeclaringClass();
        System.out.println("INSPECTING THE DECLARING CLASS");
        System.out.println("The declaring class is: " + declaringClass);
        System.out.println("DONE INSPECTING THE DECLARING CLASS");
        
        // Name of the declaring superclass
        Class declaringSuper = classObject.getSuperclass();
        System.out.println("INSPECTING THE DECLARING CLASS");
        System.out.println("The declaring class is: " + declaringSuper);
        System.out.println("DONE INSPECTING THE DECLARING CLASS");
        
        /*
        * It is worth noting that at this stage, all of these
        * above snippets of code would refactor into void methods
        * with side-effects. I will have to declare a returning
        * type and then make a query to that method, and THEN
        * print it out. However, this is just a sequence of what
        * my program ought to be doing at this stage.
        */
        
        // Name of the interfaces the class implements
        Class[] classInterfaces = classObject.getInterfaces();
        // Since the interfaces are returned in an array,
        // traverse it.
        // In this case, we are only asked for the name, although
        // it is possible to retrieve other data about the interfaec
        // after each iteration.
        if (classInterfaces.length > 0) {
            System.out.println("INSPECTING THE CLASS INTERFACES");
            for (Class classInterface : classInterfaces) {
                System.out.println("Interface: " + classInterface);
            }
            System.out.println("DONE INSPECTING THE CLASS INTERFACES");
        }
        
        // At this point, it was not possible to automatically
        // refactor these into methods with return values.
        // Began manual refactoring.
        
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
    
    // Refactoring interface library methods for
    // getting the superclass of an object.
    public String getSuper(Class x) {
        Class superClass = x.getSuperclass();
        String superReturn = superClass.toString();
        return superReturn;
    }
    
}
