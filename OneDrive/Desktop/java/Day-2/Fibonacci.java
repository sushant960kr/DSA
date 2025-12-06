import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        System.out.println("Enter the value of N: ");
        int n=r.nextInt();

        int a=0,b=1;
        System.out.println("Fibonacci Series up to N is: ");
        for (int i = 2; i < n; i++) {
            int next = a + b;
            System.out.print(" " + next);
            a = b;
            b = next;
        }


    }
}
