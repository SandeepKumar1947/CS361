package reflection;


/**
 * @author Sandeep Kumar
 *
 */

import java.lang.reflect.Method;

public class Reflection {

    public void correspondingClass(Object o) {
        if (o == null)
            throw new IllegalArgumentException("Object passed is null");

        System.out.println("Inspecting class: " + o.getClass().getName());
    }

    public void inheritanceChain(Object o) {
        if (o == null)
            throw new IllegalArgumentException("Object passed is null");

        System.out.println("Inheritance chain:");
        Class<?> currentClass = o.getClass();
        StringBuilder chain = new StringBuilder();

        while (currentClass != null) {
            if (chain.length() > 0) {
                chain.insert(0, " inherits from ");
            }
            chain.insert(0, currentClass.getSimpleName());
            currentClass = currentClass.getSuperclass();
        }

        System.out.println(chain);
    }

    public void listMethods(Object o) {
        if (o == null)
            throw new IllegalArgumentException("Object passed is null");

        Method[] methods = o.getClass().getMethods();

        System.out.println("\nList of methods:");
        for (Method method : methods) {
            System.out.println(method.getName());
        }
    }

    public Reflection() {
    }

    public static void main(String[] args) {
        Reflection r = new Reflection();

        // Demonstration on String object
        System.out.println("Demonstration on String object:");
        String str = "Hello, Reflection!";
        r.correspondingClass(str);
        r.inheritanceChain(str);
        r.listMethods(str);

        System.out.println("\n------------------------\n");

        // Demonstration on ColoredCircle object
        System.out.println("Demonstration on ColoredCircle object:");
        ColoredCircle cc = new ColoredCircle();
        r.correspondingClass(cc);
        r.inheritanceChain(cc);
        r.listMethods(cc);
    }
}

// Assuming ColoredCircle class for demonstration
class Circle {
}

class ColoredCircle extends Circle {
}