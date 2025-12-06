import java.util.Scanner;

public class Electricity {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        System.out.print("Enter the unit consumed: ");
        int unit=r.nextInt();
        System.out.print("Enter the rate of unit of electricity: ");
        int rate=r.nextInt();
        double bill=unit*rate;
        System.out.println("Electricity bill of the given units is "+bill);
    }
}
