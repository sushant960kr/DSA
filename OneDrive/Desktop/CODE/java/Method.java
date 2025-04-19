import java.util.Arrays;
import java.util.Scanner;

public class Method {
    public static void main(String[] args) {
        int a[]=new int[5];
        int a2[]=new int[5];
        Scanner r=new Scanner(System.in);
        System.out.print("Enter the elements");
        for (int i=0;i<5;i++) {
            a[i]=r.nextInt();
        }
        System.out.print("Enter the elements in ARRay2: ");
        for (int i=0;i<5;i++) {
            a2[i]=r.nextInt();
        }
        boolean b=Arrays.equals(a,a2);
        System.out.println("Kya Dono Array Equal hai:  "+b);
    }
}
