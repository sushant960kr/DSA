import java.util.Scanner;

public class rupeeToUSD {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        System.out.print("Enter the amount in rupees: ");
        float rupees=r.nextInt();

        float usd = rupees*88;
        System.out.println("Amount in doller is $"+usd);
    }
}
