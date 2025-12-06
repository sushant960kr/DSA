import java.util.Scanner;

public class power {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        System.out.println("Enter the number and power: ");
        int num=r.nextInt();
        int power=r.nextInt();
        int result = 1;

        for (int i = 1; i <= power; i++) {
            result *= num;
        }

        System.out.println(num + " raised to the power " + power + " is: " + result);
    }
}
