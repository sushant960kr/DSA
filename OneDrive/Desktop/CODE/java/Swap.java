import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        int a,b,temp;
        Scanner r=new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        a=r.nextInt();
        System.out.print("Enter the value of b: ");
        b=r.nextInt();
        System.out.println("Before Swapping "+ a+" "+b);
        temp=a;
        a=b;
        b=temp;
        System.out.println("After Swapping "+ a+" "+b);

    }
}
