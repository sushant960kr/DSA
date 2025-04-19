import java.util.Scanner;

public class Transpose {
    public static void main(String[] args) {
        int i, j;
        int a[][] = new int[2][2];
        
        
        Scanner r = new Scanner(System.in);

        System.out.println("Enter the elements of First Matrix:");
        for (i = 0; i < 2; i++) {
            for (j = 0; j < 2; j++) {
                a[i][j] = r.nextInt();
            }
        }
        System.out.println("First Matrix is" );
        for (i = 0; i < 2; i++) {
            for (j = 0; j < 2; j++) {
                System.out.print(a[i][j]+" "); 
            }
            System.out.println();
        }
        System.out.println("Transpose Matrix:");
        for (i = 0; i < 2; i++) {
            for (j = 0; j < 2; j++) {
                System.out.print(a[j][i]+" ");
            }
            System.out.println();
        }
    }
}
