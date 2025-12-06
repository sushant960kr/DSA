/*armstrong number is equal to the sum of its own digit each raised to the power of the number of digits.

*/
import java.util.Scanner;

public class Arnstrong {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = r.nextInt();

        int original = num;
        int result = 0;
        int n = String.valueOf(num).length();

        while (num != 0) {
            int digit = num % 10;
            result += Math.pow(digit, n);
            num /= 10;
        }

        if (original == result) {
            System.out.println(original + " is an Armstrong number.");
        } else {
            System.out.println(original + " is NOT an Armstrong number.");
        }
    }
}
