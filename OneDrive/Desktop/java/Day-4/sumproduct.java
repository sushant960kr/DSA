import java.util.Scanner;

public class sumproduct {
    static void sumProduct(int a, int b){
        int sum=a+b;
        int product=a*b;
        System.out.println("Sum of two number is "+sum);
        System.out.println("Prodcut of two number is "+product);
    }
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        System.out.println("Enter any two number: ");
        int a=r.nextInt();
        int b=r.nextInt();
        sumProduct(a, b);
    }
}
