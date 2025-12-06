import java.util.Scanner;

public class factorial {
    static void fact(int num){
        int fact=1;
        for (int i = 1; i <=num; i++) {
            fact =fact*i;
        }
        System.out.println("Factorial of "+num+" is "+fact);
    }
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        System.out.print("Enter any number: ");
        int num=r.nextInt();
        fact(num);
    }
}
