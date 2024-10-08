package circle;

/**
 * @author Sandeep Kumar
 *
 */

public class Circle extends GraphicObject implements Cloneable {

    // No use of encapsulation
    public double centerX, centerY; // Center coordinates
    public double radius; // Radius of the circle
    public int windowNumber; // Associated window number (context-specific)

    /**
     * Default constructor
     */
    public Circle() {
        this.centerX = 0;
        this.centerY = 0;
        this.radius = 1; // Default radius
    }

    // Overloaded constructor for creating a Circle with specific parameters
    public Circle(double centerX, double centerY, double radius) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
    }

    // Overridden method from GraphicObject
    @Override
    void draw() {
        System.out.println("Drawing a Circle...");
    }

    // Overloaded method that draws the circle in a specific color
    public void draw(int color) {
        System.out.println("Drawing a Circle in color: " + color + "...");
    }

    // Method to calculate the circumference of the circle
    public double circumference() {
        return 2.0 * Math.PI * radius; // Use Math.PI for better precision
    }

    // Method to calculate the area of the circle
    public double area() {
        return Math.PI * radius * radius; // Use Math.PI for better precision
    }

    // Method to check if this circle overlaps with another circle
    public boolean overlaps(Circle other) {
        return ((centerX - other.centerX) * (centerX - other.centerX)
                + (centerY - other.centerY) * (centerY - other.centerY)) < ((radius + other.radius)
                        * (radius + other.radius));
    }

    // Move the circle to a new position
    @Override
    void moveTo(int newX, int newY) {
        this.centerX = newX; // Update centerX to newX
        this.centerY = newY; // Update centerY to newY
    }

    // Convert circle properties to string
    @Override
    public String toString() {
        return "Circle: centerX = " + centerX + ", centerY = " + centerY + ", radius = " + radius;
    }

    // Override equals method to compare circles based on their properties
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true; // Same object reference
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false; // Not the same class or null
        }
        Circle other = (Circle) obj; // Cast to Circle
        return this.centerX == other.centerX && this.centerY == other.centerY && this.radius == other.radius;
    }

    // Clone method to create a new instance of Circle
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); // Calls the default clone method to create a new instance
    }
}
