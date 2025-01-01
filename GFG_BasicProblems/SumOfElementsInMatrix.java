/**
 * Given a non null integer matrix Grid of dimensions NxM.Calculate the sum of its elements.
 */
import java.util.Scanner;

public class SumOfElementsInMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter rows and columns for the matrix: ");
        int r = sc.nextInt(), c = sc.nextInt(), sum = 0;

        System.out.println("Enter elements into the 2D array: ");
        int[][] matrix = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.printf("Enter matrix[%d][%d]: ", i, j);
                matrix[i][j] = sc.nextInt();
            }
        }
        for (int[] rows : matrix) {
            for (int ele : rows) {
                sum += ele;
            }
        }

        System.out.println("Sum of all elements in 2D matrix is: " + sum);
        sc.close();
        return;
    }
}