// Row Colums matrix
import java.util.*;

public class MatrixSearch {

    static int[] findIndices(int[][] arr, int rw, int cl, int target) {
        // Start from top-right corner
        int row = 0;
        int col = cl - 1;

        while (row < rw && col >= 0) {
            if (arr[row][col] == target) {
                return new int[]{row, col};
            }
            if (arr[row][col] < target) {
                row++; 
            } else {
                col--; 
            }
        }
        return new int[]{-1, -1}; 
    }


    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);

        System.out.print("Enter the target: ");
        int target = r.nextInt();

        System.out.print("Enter rows and columns of array: ");
        int rw = r.nextInt();
        int cl = r.nextInt();

        int[][] arr = new int[rw][cl];
        System.out.println("Enter the elements row-wise (sorted in row and column): ");
        for (int i = 0; i < rw; i++) {
            for (int j = 0; j < cl; j++) {
                arr[i][j] = r.nextInt();
            }
        }

        int[] result = findIndices(arr, rw, cl, target);
        if (result[0] != -1) {
            System.out.println("Found at indices " + Arrays.toString(result));
        } else {
            System.out.println("Target not found in matrix.");
        }
    
    }
}
