import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        System.out.print("Enter any number: ");
        int num=r.nextInt();
        int reverse=0;
        while (num>0) {
            int digit=num%10;
            reverse=reverse*10+digit;
            num /= 10;
        }
        System.out.println("Reverse of given number is : "+reverse);
    }
}
