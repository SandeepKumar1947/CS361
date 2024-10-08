package circle;

/**
 * @author Sandeep Kumar
 *
 */
public class DemoCircle {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // Create a Circle object
        Circle c = new Circle();
        c.centerX = 5.0;
        c.centerY = 5.0;

        // Create a ColoredCircle object
        ColoredCircle cc = new ColoredCircle();
        cc.centerX = 6.0;
        cc.centerY = 6.0;

        System.out.println("c - x = " + c.centerX + " y = " + c.centerY);
        System.out.println("cc - x = " + cc.centerX + " y = " + cc.centerY);

        // Draw the Circle
        c.draw(); // Drawing a Circle...

        // Upcasting
        c = cc; // c now refers to cc

        System.out.println("c: Circle = cc: ColoredCircle");
        System.out.println("c - x = " + c.centerX + " y = " + c.centerY);
        c.draw(); // Drawing a ColoredCircle...

        System.out.println("cc - x = " + cc.centerX + " y = " + cc.centerY);
        cc.draw(); // Drawing a ColoredCircle...

        // Create two Circle objects with the same values
        Circle c1 = new Circle();
        c1.centerX = 6.0;
        c1.centerY = 6.0;
        c1.radius = 6.0;

        Circle c2 = new Circle();
        c2.centerX = 6.0;
        c2.centerY = 6.0;
        c2.radius = 6.0;

        // Print c1 and c2 using toString
        System.out.println("c1: " + c1.toString());
        System.out.println("c2: " + c2.toString());

        // Make a deep copy of c1 with clone
        Circle c3 = null;
        try {
            c3 = (Circle) c1.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        // Check if c3.equals(c1) is true and print the appropriate message
        if (c3 != null && c3.equals(c1)) { // Added null check for c3
            System.out.println("c3.equals(c1) is true");
        } else {
            System.out.println("c3.equals(c1) is false");
        }
    }
}