import java.util.Scanner;

public class MatrixAdd {
    public static void main(String[] args) {
        int i, j;
        int a[][] = new int[2][2];
        int b[][] = new int[2][2];
        int c[][] = new int[2][2];
        Scanner r = new Scanner(System.in);

        System.out.print("Enter the elements of First Matrix: ");
        for (i = 0; i < 2; i++) {
            for (j = 0; j < 2; j++) {
                a[i][j] = r.nextInt();
            }
        }
        System.out.print("Enter the elements of Second Matrix: ");
        for ( i = 0; i < 2; i++) {
            for ( j = 0; j < 2; j++) {
                b[i][j] = r.nextInt();
            }
        }



        System.out.println("First Matrix is " );
        for (i = 0; i < 2; i++) {
            for (j = 0; j < 2; j++) {
                System.out.print(a[i][j]+" "); 
            }
            System.out.println();
        }
        System.out.println("Second Matrix is " );
        for ( i = 0; i < 2; i++) {
            for ( j = 0; j < 2; j++) {
                System.out.print(b[i][j]+" ");  
            }
            System.out.println();
        }

        System.out.println("Sum of two Matrix is " );
        for (i = 0; i < 2; i++) {
            for (j = 0; j < 2; j++) {
                 c[i][j]=a[i][j]+b[i][j]; 
                 System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
        
        
    }
}
