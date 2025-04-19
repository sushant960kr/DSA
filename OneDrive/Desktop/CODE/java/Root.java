import java.util.Scanner;

public class Root {

    public static void main(String[] args) {
        int a;
        double b;
        Scanner r=new Scanner(System.in);
        System.out.print("Enter the number: ");
        a=r.nextInt();
        b=Math.sqrt(a);
        System.out.println("Square root of the no is "+b);
    }
}