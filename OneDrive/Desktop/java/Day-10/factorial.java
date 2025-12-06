import java.util.Scanner;

public class factorial {

    static int factorial(int num){
        if ( num  <= 2 ) {
            return num;
        }
        return factorial(num-1)*num;
    }
    public static void main(String[] args) {
        Scanner r=new  Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=r.nextInt();
        System.out.println("Factorial of number is "+factorial(num));
    }
}
