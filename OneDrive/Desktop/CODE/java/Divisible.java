import java.util.Scanner;

public class Divisible {
    public static void main(String[] args) {
        int a;
        Scanner r=new Scanner(System.in);
        System.out.print("Enter the number: ");
        a=r.nextInt();
        if (a%5==0) {
            System.out.println("The given number is divisible by 5");
        } else {
            System.out.println("The given number is not divisible by 5");
        }
    }
}
