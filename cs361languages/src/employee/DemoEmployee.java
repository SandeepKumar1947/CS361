package employee;

/**
 * @author Sandeep Kumar
 *
 */

// Resource: https://www.baeldung.com/java-type-casting

// Complete the provided code

public class DemoEmployee {

    /**
     * @param args
     */
    public static void main(String[] args) {

        Employee emp1 = new Employee("John", "Smith", "123456790");
        PartTimeEmployee pEmp1 = new PartTimeEmployee("Jane", "Smith", "123456777", 17.5);

        // Upcasting
        Employee emp3 = pEmp1;
        System.out.println("emp3:");
        emp3.whoAmI(); // Call to whoAmI() will refer to PartTimeEmployee's method

        // Here, emp3 will execute the overridden method from PartTimeEmployee
        // emp3.whoAmI() prints "I am a Part-Time Employee" because the actual object is a PartTimeEmployee

        // Checking instance type
        if (emp3 instanceof PartTimeEmployee) {
            System.out.println("emp3 instance of Part-Time Employee"); // printed
        } else {
            System.out.println("emp3 not instance of Part-Time Employee");
        }

        // Downcasting 1
        // Uncomment and run the code
        // This would fail at runtime because emp1 is not a PartTimeEmployee
        // PartTimeEmployee pEmp3 = (PartTimeEmployee) emp1; 
        // This instruction does not compile because emp1 is of type Employee and cannot be cast to PartTimeEmployee

        // Downcasting 2
        if (emp3 instanceof PartTimeEmployee) {
            System.out.println("emp3 instance of Part-Time Employee"); // printed
            PartTimeEmployee pEmp4 = (PartTimeEmployee) emp3; // cast required
            System.out.println("Hourly Rate: " + pEmp4.getHourlyRate()); // Prints the hourly rate
        } else {
            System.out.println("emp3 not instance of Part-Time Employee");
        }
    }
}
