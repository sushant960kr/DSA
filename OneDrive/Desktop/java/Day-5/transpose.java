import java.util.Scanner;

public class transpose {
    static void transposeMatrix(int[][] arr , int rows, int cols){
        int[][] ans =new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                ans[i][j]= arr[j][i];
            }
        }System.out.println("Transpose Matrix is ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(ans[i][j]+" ");
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
        }transposeMatrix(arr, rows, cols);
    }
}
