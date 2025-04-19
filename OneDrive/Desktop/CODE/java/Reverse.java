import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        int a,b;
        Scanner r=new Scanner(System.in);
        System.out.print("Enter the number: ");
        a=r.nextInt();
        System.out.print("Reversed Number: ");
        while (a>0) {
            b = a % 10;
            System.out.println(b);
            a = a / 10;
        
        }
        System.out.println();
        r.close();
    }
}
