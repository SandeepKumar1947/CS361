public class Recursion {
    private static int counter = 0;

    public static void main(String[] args) {
        System.out.println("Result: " + recursiveFunction(3));
        System.out.println("Total function calls: " + counter);
    }

    public static int recursiveFunction(int n) {
        counter++;
        System.out.println("Entering recursiveFunction with n = " + n);
        
        if (n <= 1) {
            System.out.println("Base case reached. Returning 1.");
            return 1;
        }
        
        int result = n * recursiveFunction(n - 1);
        System.out.println("Calculated result for n = " + n + ": " + result);
        return result;
    }
}