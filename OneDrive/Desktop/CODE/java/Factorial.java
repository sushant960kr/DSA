import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int a,fact=1;
        Scanner r=new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        a=r.nextInt();
        for(int i=1;i<=a;i++)
        {
            fact=fact*i;
        }
        System.out.println("factorial of given number is " +(fact));
    }
}
