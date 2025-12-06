import java.util.Scanner;

public class max {
    static void minMax(int a, int b, int c) {
        int max = a;
        int min = a;

        if (b > max) max = b;
        if (c > max) max = c;

        if (b < min) min = b;
        if (c < min) min = c;

        System.out.println("Maximum number is: " + max);
        System.out.println("Minimum number is: " + min);
    }

    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        System.out.print("Enter any three numbers: ");
        int a = r.nextInt();
        int b = r.nextInt();
        int c = r.nextInt();
        minMax(a, b, c);
    }
}
