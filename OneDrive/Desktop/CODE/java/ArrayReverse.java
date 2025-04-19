import java.util.Scanner;

public class ArrayReverse {
    public static void main(String[] args) {
        int a[] = new int[5];
        Scanner r = new Scanner(System.in);

        System.out.print("Enter the elements: ");
        for (int i = 0; i < 5; i++) {
            a[i] = r.nextInt();
        }

        System.out.print("Array Elements are: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(a[i] + " ");
        }

        System.out.print("\nArray elements in reverse order:");
        for (int i = 4; i >= 0; i--) {  
            System.out.print(a[i] + " ");
        }
        
    }
}
