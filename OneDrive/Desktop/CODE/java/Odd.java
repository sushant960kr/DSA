import java.util.Scanner;

public class Odd {
    public static void main(String[] args) {
       int n;
       System.err.print("enter ur no: "); 
       Scanner r=new Scanner(System.in);
       n=r.nextInt();
       if (n%2==0) 
       {
        System.out.println("Even  number");
        
       }
       else{
        System.out.println("odd number");
       }
    }
}
