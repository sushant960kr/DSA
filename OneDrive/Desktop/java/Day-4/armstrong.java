import java.util.Scanner;

public class armstrong {

    static boolean isArmstrong(int num){
        int original = num;
        int sum = 0;
        int digits = String.valueOf(num).length();  // number of digits

        while(num > 0){
            int digit = num % 10;
            sum += Math.pow(digit, digits);  // raise to power of number of digits
            num /= 10;
        }
        return original == sum;
    }

    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int num = r.nextInt();

        // Check the given number
        if (isArmstrong(num)) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is not an Armstrong number.");
        }

        // Print all Armstrong numbers less than the given number
        System.out.println("Armstrong numbers less than " + num + " are:");
        for (int i = 1; i < num; i++) {
            if (isArmstrong(i)) {
                System.out.print(i+" ");
            }
        }
    }
}
