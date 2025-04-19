import java.util.Scanner;

public class Check {
    public static void main(String[] args) {
        int a;
        Scanner r=new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        a=r.nextInt();
        
        if (a>=1) {
            System.out.println("Positive number i.e," +a);
        } else {
            System.out.println("Negative number i.e," +a);
        }
    }
}
