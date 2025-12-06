
//  Diagonal sum
import java.util.Scanner;

public class diag {
    static void diagonalSum(int[][] arr, int rows, int cols){
        int sum=0;
        // for (int i = 0; i < rows; i++) {
        //     for (int j = 0; j < cols; j++) {
        //         if (arr[i]==arr[j]) {
        //             sum +=arr[i][j];
        //         }else if (i+j == arr.length-1) {
        //             sum +=arr[i][j];
        //         }
        //     }
        // }
        for (int i = 0; i < arr.length; i++) {
            // primary diagonal
            sum +=arr[i][i];
            // Secondary diagonal isme overlapping nhi hoga
            if (i != arr.length-i-1) {
                sum +=arr[i][arr.length-i-1];
            }
        }
        
        System.out.println("Diagonal Sum is "+sum);
        
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
        }
        diagonalSum(arr, rows, cols);
    }
}
