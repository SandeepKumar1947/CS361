public class Recursion {
    public static int evaluate(int n, boolean innermost) {
        if (innermost) {
            System.out.println("Innermost evaluation: evaluate(" + n + ")");
        } else {
            System.out.println("Outermost evaluation: evaluate(" + n + ")");
        }

        if (n == 0) {
            return 0;
        }

        if (innermost) {
            System.out.println("Before recursion: Adding 1 to the result of evaluate(" + (n - 1) + ")");
            int result = 1 + evaluate(n - 1, true);
            System.out.println("Returning from evaluate(" + n + ") -> " + result);
            return result;
        } else {
            int result = evaluate(n - 1, false);
            System.out.println("Returning from evaluate(" + n + ") -> " + (result + 1));
            return result + 1;
        }
    }

    public static void main(String[] args) {
        int n = 5;

        System.out.println("Performing Innermost Evaluation:");
        int innermostResult = evaluate(n, true);
        System.out.println("Result (Innermost): " + innermostResult);

        System.out.println("\n----------------------------------\n");

        System.out.println("Performing Outermost Evaluation:");
        int outermostResult = evaluate(n, false);
        System.out.println("Result (Outermost): " + outermostResult);
    }
}
