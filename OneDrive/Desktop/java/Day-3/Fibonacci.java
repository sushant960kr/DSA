import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int num=r.nextInt();
        int a=0,b=1;
        int count=2;
        System.out.print("Fiboacci series up to N: "+ a + " " + b);
        for(int i=2;i<num;i++){
            int digit=a+b;
            System.out.print(" "+digit);
            a=b;
            b=digit;
        }
  
}
