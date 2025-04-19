import java.util.Scanner;

public class Swap1 {
    public static void main(String[] args) {
        int a,b;
        Scanner r=new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        a=r.nextInt();
        System.out.print("Enter the value of b: ");
        b=r.nextInt();
        System.out.println("Before Swapping "+ a+" "+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After Swapping "+ a+" "+b);
    }
}
