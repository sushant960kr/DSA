import java.util.Scanner;

public class spiral {

    static void spiralMatrix(int[][] arr, int rows, int cols){
        int startRows=0, endRow=rows-1;
        int startCol=0, endCols=cols-1;
        System.out.println("Spiral element is: ");
        while (startRows <=endRow && startCol <=endCols) {
            //top
            for(int j=startCol; j<=endCols ;j++){
                System.out.print(arr[startRows][j]+" ");
            }
            //right
            for (int i =startRows+1; i <= endRow; i++) {
                System.out.print(arr[i][endRow]+" ");
            }
            //bottom
            for(int j=endCols-1; j>=startCol ;j--){
                System.out.print(arr[endRow][j]+" ");
            }
            // left
            for (int i = endRow-1; i >= startRows+1; i--) {
                System.out.print(arr[i][startCol]+" ");
            }
            startCol++;
            startRows++;
            endRow--;
            endCols--;
        }
        System.out.println();


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
        spiralMatrix(arr, rows, cols);
        
    }
}
