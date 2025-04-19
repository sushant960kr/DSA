import java.util.Scanner;

public class AddArray {
    public static void main(String[] args) {
        int sum = 0;int a[]=new int[5];
        Scanner r=new Scanner(System.in);
        System.out.print("Enter the element ");
        for(int i=0;i<5;i++)
        {
            a[i]=r.nextInt();
        }
        System.out.print("Array Elements are " );
        for(int i=0;i<5;i++)
        {
            System.out.print(a[i]+ " ");
            sum=a[i]+sum;
        }
        System.out.println("\nAddition of element are "+sum);
    }
}
