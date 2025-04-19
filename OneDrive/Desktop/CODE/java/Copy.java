import java.util.Scanner;

public class Copy {
    public static void main(String[] args) {
        int a[]=new int[5];
        int b[]=new int[5];
        Scanner r=new Scanner(System.in);
        System.out.print("Enter elements:");
        
        for(int i=0;i<5;i++)
        {
            a[i]=r.nextInt();


        }
        System.out.print("Array Elements are " );
        for(int i=0;i<5;i++)
        {
            System.out.print(a[i]+ " ");
        }
        System.out.print("\n2nd Array Elements are " );
        for(int i=0;i<5;i++)
        {
            b[i]=a[i];
            System.out.print(a[i]+ " ");
        }
    }
}
