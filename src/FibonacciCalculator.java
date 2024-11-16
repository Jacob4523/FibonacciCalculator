public class FibonacciCalculator {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java -jar FibonacciCalculator.jar <integer>");
            return;
        }

        int fValue;
        try {
            fValue = Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            System.out.println("The argument must be an integer.");
            return;
        }

        int result = fibonacci(fValue);
        System.out.println("Fibonacci number at position " + fValue + " is " + result);
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}