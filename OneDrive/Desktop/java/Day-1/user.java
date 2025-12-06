import java.util.Scanner;

public class user {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        int sum = 0;

        System.out.println("Enter numbers to add (enter 'x' to stop):");

        while (true) {
            String input = r.next();

            if (input.equalsIgnoreCase("x")) {
                break;  // exit the loop if input is 'x' or 'X'
            }

            try {
                int num = Integer.parseInt(input); // convert string to int
                sum += num;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Enter a number or 'x' to stop.");
            }
        }

        System.out.println("Sum of all numbers: " + sum);
    }
}
