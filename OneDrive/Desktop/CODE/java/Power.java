import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        int n,p,result=1;
        Scanner r=new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        n=r.nextInt();
        System.out.print("Enter the value of p: ");
        p=r.nextInt();
        for (int i = 1; i <= p; i++) {
           result= n*result;
        }
        System.out.println("Power of a  given number is " + result);
    }
}
