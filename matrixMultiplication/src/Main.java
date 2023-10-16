import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        final long start = System.currentTimeMillis();
        int row1, col1, row2, col2;
        row1 = 1100;
        col1 = 1200;
        row2 = 1200;
        col2 = 1111;

        // Requirement check for matrix multiplication
        if (col1 != row2) {
            System.out.println("Matrix multiplication is not possible");
            return;
        }

        int[][] a = new int[row1][col1];
        int[][] b = new int[row2][col2];
        int[][] c = new int[row1][col2];

        // Input the values of matrices
        System.out.println("Entering values for matrix A.");
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col1; j++) a[i][j] = (int)(Math.random() * 100);
        }
        System.out.println("Matrix A: " + Arrays.deepToString(a));
        System.out.println("Entering values for matrix B.");
        for (int i = 0; i < row2; i++) {
            for (int j = 0; j < col2; j++) b[i][j] = (int)(Math.random() * 100);
        }
        System.out.println("Matrix B: " + Arrays.deepToString(b) + "\n");

        // Perform matrix multiplication
        // Using for loop
        System.out.println("Multiplying matrices...");
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col2; j++) {
                // Initialize the element C(i,j) with zero
                c[i][j] = 0;

                // Dot product calculation
                for (int k = 0; k < col1; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        System.out.println("Matrix C: " + Arrays.deepToString(c));
        final long finnish = System.currentTimeMillis();
        System.out.println("\nTotal execution time: " + (finnish - start));
    }
}
