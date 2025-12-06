import java.util.Scanner;

public class lcm {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        System.out.println("Enter any two number: ");
        int a=r.nextInt();
        int b=r.nextInt();

        int x = a;  // Store original values
        int y = b;

        // Calculate HCF using Euclidean Algorithm
        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }

        int hcf = x;
        
        


        int lcm =(a*b) / hcf;
        System.out.println("HCF is: " + hcf);
        System.out.println("LCM is: "+lcm);
    }
}
