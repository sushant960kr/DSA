import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        int a;
        Scanner r=new Scanner(System.in);
        System.out.print("Enter the number: ");
        a=r.nextInt();
        if (a%1==0 && a%a==0) {
            System.out.println("Prime number");
        } else {
            System.out.println("Not Prime number");
        }
    }
}
