// sum of positive even numbers and the sum of positive odd numbers from a list of numbers (N) entered by the user. The list terminates when the user enters a zero.

import java.util.Scanner;

public class oddEven {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        int num;
        int largest = Integer.MIN_VALUE;
        int sumodd= 0;
        int sumeven=0;

        System.out.println("Enter numbers (enter 0 to stop):");

        while (true) {
            num = r.nextInt();

            if (num == 0) {
                break;
            }

            
            if (num %2==0) {
                sumeven +=num;
            }else{
                sumodd+=num;
            }
        }
        System.out.println("Sum of even postive number is "+sumeven);
        System.out.println("Sum of odd postive number is "+sumodd);

          
    }
}
