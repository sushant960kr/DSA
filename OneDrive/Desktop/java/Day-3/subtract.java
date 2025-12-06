//  Subtract the Product and Sum of Digits of an Integer

import java.util.Scanner;

public class subtract {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        System.out.println("Enter any  number: ");
        int num=r.nextInt();
        int digitsum=0;
        int digitproduct=1;
        for (int i = 0; i < num; i++) {
           int rem=num%10;
           digitsum +=rem;
           digitproduct *=rem;
           num /=10;
        }
        double subtract= digitproduct-digitsum;
        System.out.print("Sum of digit is "+digitsum);
        System.out.println();
        System.out.print("Product of digit is "+digitproduct);
        System.out.println();
        System.out.print("Subtract the Product and Sum of Digits of an Integer is "+subtract);

    }
}
