import java.util.Scanner;

public class Add {
    public static void main(String[] args) {
        int a,b;
        Scanner r=new Scanner(System.in);

        System.err.print("Enter the value of a :");
        a=r.nextInt();
        System.err.print("Enter the value of b :");
        b=r.nextInt();

        System.err.print("Sum of a and b is : " + (a+b));
    }
}
