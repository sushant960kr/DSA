//  sum of digit

import java.util.Scanner;

public class sum {
    static void  sumOFDigit(int num){
        int sum=0;
        while (num>0) {
            int digit=num%10;
            sum = sum+digit;
            num /=10;
        }
        System.out.println("Sum of digit is "+sum);
        
    }
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        System.out.print("Enter any number: ");
        int num=r.nextInt();
        sumOFDigit(num);
    }
}
