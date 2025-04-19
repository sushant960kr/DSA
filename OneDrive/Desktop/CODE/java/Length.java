import java.util.Scanner;

public class Length {
    public static void main(String[] args) {
        int a[]=new int[5];
        Scanner r=new Scanner(System.in);
        System.out.print("Enter the elements: ");
        for(int i=0;i<5;i++)
        {
            a[i]=r.nextInt();
        }
        System.out.println("Array Elements are: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(a[i] + " ");
        }System.out.println("\nLength of array"+a.length);
    }
}
