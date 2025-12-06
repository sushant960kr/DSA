import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        System.out.println("Enter any two number: ");
        int a=r.nextInt();
        int b=r.nextInt();
        int sum=a+b;
        System.out.print("Sum of two number is "+sum);
    }
}
