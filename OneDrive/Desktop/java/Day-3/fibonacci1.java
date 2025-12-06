import java.util.Scanner;

public class fibonacci1 {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        System.out.print("Enter the value of N : ");
        int num=r.nextInt();
        int a=0,b=1;
        int digit=0;
        System.out.print("Fibonaci series of given digit is "+a+" "+b);
        while (digit < num) {
         digit = a+b;
         System.out.print(" "+digit); 
         a=b;
         b=digit;  
        }
    }
}
