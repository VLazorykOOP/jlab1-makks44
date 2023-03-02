import java.util.Scanner;

public class taska2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get the values of a and b from the user
        System.out.print("Enter the value of a: ");
        double a = input.nextDouble();
        System.out.print("Enter the value of b: ");
        double b = input.nextDouble();

        // Get the array X from the user
        System.out.print("Enter the number of elements in X: ");
        int n = input.nextInt();
        int[] X = new int[n];
        System.out.print("Enter the elements of X separated by spaces: ");
        for (int i = 0; i < n; i++) {
            X[i] = input.nextInt();
        }

        // Initialize variables for the sum, product, max, and min
        double sumLessThanA = 0;
        double sumGreaterThanB = 1;
        int maxInABRange = Integer.MIN_VALUE;
        int minInABRange = Integer.MAX_VALUE;

        // Loop through each element of X and update the variables if necessary
        for (int i = 0; i < n; i++) {
            if (X[i] < a) {
                sumLessThanA += X[i];
            }
            if (X[i] > b) {
                sumGreaterThanB *= X[i];
            }
            if (X[i] >= a && X[i] <= b) {
                if (X[i] > maxInABRange) {
                    maxInABRange = X[i];
                }
                if (X[i] < minInABRange) {
                    minInABRange = X[i];
                }
            }
        }

        // Print the results
        System.out.println("Sum of elements in X less than a: " + sumLessThanA);
        System.out.println("Product of elements in X greater than b: " + sumGreaterThanB);
        System.out.println("Maximum element in X between a and b: " + maxInABRange);
        System.out.println("Minimum element in X between a and b: " + minInABRange);
    }
}
