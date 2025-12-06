// Write a program to count even the number of days he can go out in the month of August.

import java.util.Scanner;

public class countDays {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);

        System.out.print("Enter the number of days : ");
        int days=r.nextInt();
        int count=0;
        for (int i = 1; i <= days; i++) {
            if (i%2==0) {
                count++;
            }
        }
        System.out.println("Number of days he goes out is "+count);
    }
}
