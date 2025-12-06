import java.util.Scanner;

public class PythagoreanTriplet {

    static boolean isPythagoreanTriplet(int a, int b, int c) {
        // Find the largest number (hypotenuse)
        int max = Math.max(a, Math.max(b, c));
        int x, y;

        if (max == a) {
            x = b;
            y = c;
        } else if (max == b) {
            x = a;
            y = c;
        } else {
            x = a;
            y = b;
        }

        return (max * max == x * x + y * y);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (isPythagoreanTriplet(a, b, c)) {
            System.out.println("It is a Pythagorean triplet.");
        } else {
            System.out.println("It is NOT a Pythagorean triplet.");
        }
    }
}
