
// Rotate Matrix by 90 degree clockwise
//  transpose matrix kai rows ko reverse print kr dege 
import java.util.Scanner;

public class rotate {
    static void rotateClockwise(int[][] arr , int rows, int cols){
        // Step 1: Transpose the matrix
        int[][] ans = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                ans[j][i] = arr[i][j];
            }
        }

        // Step 2: Reverse each row of transposed matrix
        System.out.println("Rotated Matrix is:");
        for (int i = 0; i < cols; i++) {
            for (int j = cols - 1; j >= 0; j--) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows=r.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols=r.nextInt();
        int[][] arr=new int[rows][cols];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j]=r.nextInt();
            }
        }rotateClockwise(arr, rows, cols);
    }
}
