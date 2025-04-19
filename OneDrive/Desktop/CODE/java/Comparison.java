import java.util.Scanner;
import java.util.Arrays;

public class Comparison {
    public static void main(String[] args) {
        int a[]= new int[5];
        int a1[]= new int[5];
        Scanner r=new Scanner(System.in);
        System.out.print("Enter the elements: ");
        for(int i=0;i<a.length;i++)
        {
            a[i]=r.nextInt();
        }
        System.out.print("Enter the elements in a1: ");
        for(int i=0;i<a.length;i++)
        {
            a1[i]=r.nextInt();
        }
        if (Arrays.equals(a,a1)) {
            System.out.println("Both are Equals");
        } else {
            System.out.println("Both are not Equals");
        }
    }
}
