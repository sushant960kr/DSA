import java.util.Scanner;

public class evendigits {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);

        int[] nums = new int[5];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = r.nextInt();
        }

        int count = 0;
        for (int num : nums) {
            if (hasEvenDigits(num)) {
                count++;
            }
        }

        System.out.println("Count of numbers with even number of digits: " + count);
    }

    // helper method to check digit count
    static boolean hasEvenDigits(int num) {
        int digits = 0;
        num = Math.abs(num); // handle negative numbers
        if (num == 0) return false; // zero has 1 digit
        while (num > 0) {
            num /= 10;
            digits++;
        }
        return digits % 2 == 0;
    }
}
