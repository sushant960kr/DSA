import java.util.Scanner;

public class Gretestno {
    public static void main(String[] args) {
        int a,b;
        Scanner r=new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        a=r.nextInt();
        System.out.print("Enter the value of b: ");
        b=r.nextInt();
        if (a>b) {
            System.out.println("A is greater  " +a);
        } else {
            System.out.println("B is greater  " +b);
        }
    }
}
