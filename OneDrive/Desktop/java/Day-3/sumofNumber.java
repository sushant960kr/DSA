// Take integer inputs till the user enters 0 and print the largest number from all.

import java.util.Scanner;

public class sumofNumber {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        int num;
        int largest = Integer.MIN_VALUE;
        int sum = 0;

        System.out.println("Enter numbers (enter 0 to stop):");

        while (true) {
            num = r.nextInt();

            if (num == 0) {
                break;
            }

            sum += num;

            if (num > largest) {
                largest = num;
            }
        }

        if (sum == 0) {
            System.out.println("No numbers were entered.");
        } else {
            System.out.println("The sum of numbers is: " + sum);
            System.out.println("The largest number entered is: " + largest);
        }

    }
}
