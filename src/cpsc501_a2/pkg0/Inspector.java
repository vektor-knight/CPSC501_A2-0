/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpsc501_a2.pkg0;

import java.io.PrintStream;
import java.util.Vector;
import java.lang.reflect.*;
import java.util.Arrays;
import static sun.reflect.misc.ConstructorUtil.getConstructors;

/**
 *
 * @author shshunda
 */
public class Inspector {
    
    public Inspector() {
        
    }
    /*
    Does this need a constructor? Perhaps
    some variables can be abstracted out.
    */
    
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
        System.out.println("INSPECTING THE DECLARING CLASS");
        System.out.println("The declaring class is: " + getDeclaring(classObject));
        System.out.println("DONE INSPECTING THE DECLARING CLASS");
        
        // Name of the declaring superclass
            // Using refactoring of getting superclass.
        System.out.println("INSPECTING THE DECLARING CLASS");
        System.out.println("The declaring class is: " + getSuper(classObject));
        System.out.println("DONE INSPECTING THE DECLARING CLASS");

        /*
         * It is worth noting that at this stage, all of these
         * above snippets of code would refactor into void methods
         * with side-effects. I will have to declare a returning
         * type and then make a query to that method, and THEN
         * print it out. However, this is just a sequence of what
         * my program ought to be doing at this stage.
         */
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
    
    // Refactoring library method for getting
    // a declaring class into constituent wrapper.
    public String getDeclaring(Class x) {
        Class declaring = x.getDeclaringClass();
        String declaringReturn = declaring.toString();
        return declaringReturn;
    }
    
    // Refactoring interface library methods for
    // getting the superclass of an object.
    public String getSuper(Class x) {
        Class superClass = x.getSuperclass();
        String superReturn = superClass.toString();
        return superReturn;
    }
    
    // At this point, unit tests are required.
    // Autogenerated using IDE.
    
    // Since getting the interfaces of a class is entailed
    // by traversing an array containing elements of type Class,
    // two methods will be required. The first will traverse 
    // the array, and the second will be a wrapper which
    // returns strings of those Class elements.
    // There might be a way to get this into one form.
    public Class[] getClassInterfaces(Class x) {
        // Name of the interfaces the class implements
        Class classObject = x.getClass();
        Class[] classInterfaces = classObject.getInterfaces();
        return classInterfaces;
        // Since the interfaces are returned in an array,
        // traverse it.
        // In this case, we are only asked for the name, although
        // it is possible to retrieve other data about the interfaec
        // after each iteration.
    }
    
    // What I can do here instead is return the Class[] object,
    // and then create a loop which queries the above method.
    // This would return individual Class objects, which can 
    // then be cast to Strings. This is what I will be testing.
        // This would be an advanced refactoring, using:
    /*         if (classInterfaces.length > 0) {
            System.out.println("INSPECTING THE CLASS INTERFACES");
            for (Class classInterface : classInterfaces) {
                System.out.println("Interface: " + classInterface);
            }
            System.out.println("DONE INSPECTING THE CLASS INTERFACES");
        } 
    */
    // Going to save this for later, and instead test the getClassInterfaces
    // wrapper, obtained from "extract method" refactoring.
    
    // After these above refactorings, I pondered whether getting the
    // interfaces of a class would be checked as an Array, as opposed
    // to single elements. The test driver didn't say much to this effect.
    // Moved onto the next set of assignment specifications, and decided
    // to start writing separate methods instead of blocks within the
    // main inspect() method.
    
            // Methods the class declares
    // In the final version, the idea is to be able to
    // take this array containing elements of type String,
    // and then print them one at a time, along with their constituent behaviour.
    public String getMethods(Class x) {
        Method[] methods = x.getMethods();
        String castedMethods = Arrays.toString(methods);
        return castedMethods;
    }
    
    // Get exceptions of a single method. 
    // Single method may have multiple exceptions.
    // Return them in an array of Strings.
    public String getExceptions(Method m) {
        Class[] excepts = m.getExceptionTypes();
        String exception = null;
        if (excepts.length > 0) {
            exception = null;
        } else {
            for (Class except : excepts) {
                exception += except.getSimpleName() + " ";
            }
        }
        return exception;
    }
    
    // Get parameters of a single method. Follows
    // the same structure as getExceptions(..).
    public String getParameters(Method m) {
        Class[] params;
        params = m.getParameterTypes();
        String parameter = null;
        if (params.length > 0) {
            parameter = null;
        } else {
            for (Class param : params) {
                parameter += param.getSimpleName() + " ";
            }
        }
        return parameter;
    }
    
    // Get return type
    // There is only ever one return type for
    // a given method.
    public Class<?> getReturnType(Method m) {
        Class<?> ret;
        ret = m.getReturnType();
        return ret;
    }
    
    // Helper to be used in getReturnType(..).
    // I think the refactoring when making
    // the query in getReturnType(..) is called
    // self encapsulate field. Not sure.
    public String getReturnString(Class<?> r, Method m) {
        r = getReturnType(m);
        String toString = r.toString();
        return toString;
    }
    
    // Get modifiers of a single method.
    public String getModifiers(Method m) {
        return Modifier.toString(m.getModifiers());
    }

    public String getConstructors(Class x) {
        Constructor[] c = x.getConstructors();
        return Arrays.toString(c);
    }
    
    // Get parameter types of a single Constructor
    public String getConstParams(Constructor x) {
        String params = Arrays.toString(x.getParameterTypes());
        return params;
    }
    
    // Get parameter modifiers of a single Constructor.
    public String getConstMods(Constructor x) {
        String mods = Modifier.toString(x.getModifiers());
        return mods;
    }
    
    // Now that the "base cases" have been tested, and we know that
    // it is possible to return basic information from introspection
    // of a single object... we can now create void methods with side-effects
    // which query the parsed String objects from the above methods.
    // We are guaranteed that the side-effects will produce correct
    // results, since unit tests were generated and hit with expected results.
    
    // The structure of the following void methods was referenced from:
    // https://github.com/stevarms/CPSC501A2/blob/master/src/Inspector.java
    // My variations become apparent with the queries that result from
    // the refactoring methods that had been applied.
    
    public void inspectMethods(Object obj, Class classObject) {
        System.out.println("INSPECTING THE METHODS OF THE CLASS: " + classObject.getDeclaringClass());
        Method[] methods = classObject.getDeclaredMethods();
        if (methods.length > 0) {
            for (int i = 0; i < methods.length; i++) {
                Method x = methods[i];
                String y = getParameters(x);
                String a = getReturnString(classObject, x);
                String w = getModifiers(x);
                String z = getExceptions(x);
                
                System.out.println("The " + i + "th " + "method is: " + x.getName() 
                        + "\n\t Exception Types: " + z
                        + "\n\t Parameters: " + y 
                        + "\n\t Return Types: " + a
                        + "\n\t Modifiers: " + w ); 
            }
        } else {
            System.out.println("No methods exist for this class.");
        }
    }
        
}
