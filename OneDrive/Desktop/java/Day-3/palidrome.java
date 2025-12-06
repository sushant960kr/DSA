import java.util.Scanner;

public class palidrome {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        System.out.print("Enter any number: ");
        int num=r.nextInt();
        int rev=0;

        int original=num;
        while (num>0) {
            int digit = num%10;
             rev= rev*10+digit;
             num /=10;

        }
        if (original==rev) {
            System.out.print("Number is palidrome i.e, "+original);
        }else{
            System.out.print("Number is not palidrome i.e, "+original);
        }
    }
}
