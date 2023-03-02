import java.util.Scanner;

public class taska3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get the size of the matrices
        System.out.print("Enter the size of the matrices: ");
        int n = input.nextInt();

        // Create matrices A and B
        int[][] A = new int[n][n];
        int[][] B = new int[n][n];

        // Fill matrices A and B with values
        System.out.println("Enter the values for matrix A:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                A[i][j] = input.nextInt();
            }
        }

        System.out.println("Enter the values for matrix B:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                B[i][j] = input.nextInt();
            }
        }

        // Create matrix X by multiplying each row of A by the maximum element in the corresponding row of B
        int[][] X = new int[n][n];
        for (int i = 0; i < n; i++) {
            int maxB = B[i][0];
            for (int j = 1; j < n; j++) {
                if (B[i][j] > maxB) {
                    maxB = B[i][j];
                }
            }
            for (int j = 0; j < n; j++) {
                X[i][j] = A[i][j] * maxB;
            }
        }

        // Print matrix X
        System.out.println("Matrix X:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(X[i][j] + " ");
            }
            System.out.println();
        }
    }
}
