import java.util.Arrays;
import java.util.Scanner;

public class copyof {
    public static void main(String[] args) {
        int  a[]=new int[5];
    
        Scanner r=new Scanner(System.in);
        System.out.print("Enter the elements: ");
        for(int i=0;i<5;i++)
        {
            a[i]=r.nextInt();
        }
        int a2[]= Arrays.copyOf(a,5);
        System.out.print("Enter data in Array: ");
        for(int i=0;i<5;i++)
        {
            System.out.print(a2[i]+" ");
        }
    }
}
