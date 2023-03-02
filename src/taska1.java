import java.util.Scanner;

public class taska1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input values for a and b
        System.out.print("Enter value for a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter value for b: ");
        double b = scanner.nextDouble();

        // Evaluate the expression
        double result = a + (a + b - 1) / (Math.pow(a, 2) + 2) - Math.pow(a * b, 3);

        // Print the result
        System.out.println("Result: " + result);
    }
}