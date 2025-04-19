import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        int i, j;
        int a[][] = new int[2][2];
        Scanner r = new Scanner(System.in);

        System.out.println("Enter the elements: ");
        for (i = 0; i < 2; i++) {
            for (j = 0; j < 2; j++) {
                a[i][j] = r.nextInt();
            }
        }
        r.close(); 
         
        System.out.println("Matrix Array is:");
        for (i = 0; i < 2; i++) {
            for (j = 0; j < 2; j++) {
                System.out.print(a[i][j] + " "); 
            }
            System.out.println(); 
        }
    }
}
