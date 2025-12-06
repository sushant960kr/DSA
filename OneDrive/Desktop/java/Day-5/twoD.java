import java.util.Scanner;

public class twoD {
    static void twoDArray(int[][] arr, int rows, int cols){
        System.out.println("2D Arrray is ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
               System.out.print( arr[i][j]+" ");
            }System.out.println();
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
        }
        twoDArray(arr, rows,cols);

    }
}
