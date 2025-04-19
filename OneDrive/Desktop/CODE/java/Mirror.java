import java.util.Scanner;

public class Mirror {
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

        System.out.println("Mirror Matrix is" );
        for (i = 0; i < 2; i++) {
            for (j = 1; j >=0; j--) {
                System.out.print(a[i][j]+" "); 
            }
            System.out.println();
        }
    }
}
