import java.util.Scanner;

public class Sum1 {
    public static void main(String[] args) {
        int a,b,sum=0;
        Scanner r=new Scanner(System.in);
        System.out.print("Enter number: ");
        a=r.nextInt();
        while (a>0) {
            b=a%10;
            sum=sum+b;
            a=a/10;
        }
        System.out.println("Sum of digits is "+sum);
    }
}
