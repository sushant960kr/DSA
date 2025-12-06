import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        System.out.print("Enter any number: ");
        int num= r.nextInt();
        int c=2;
        double num1=Math.sqrt(num);
        while ( c < num1 ) {
            if (num % c == 0) {
                System.out.print("Not Prime number i.e, "+num);
                return ;
            }c=c+1;
            
        }
        
            System.out.println("Prime number "+num);
        
        
    }
}
