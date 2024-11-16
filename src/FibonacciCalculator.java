import java.util.Scanner;

public class FibonacciCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int f = scanner.nextInt();
        scanner.close();
        
        int result = fibonacci(f);
        System.out.println("Fibonacci number at position " + f + " is " + result);
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}