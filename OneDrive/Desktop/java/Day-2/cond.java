import java.util.Scanner;

public class cond {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        System.out.println("Enter any two number:");
        int a=r.nextInt();
        int b=r.nextInt();
        int result=0;

        System.out.println("Enter any operator: ");
        char op=r.next().charAt(0);
        if (op == '+') {
            result=a+b;
            System.out.println("sum is "+result);
        }else if (op == '-') {
            result=a-b;
            System.out.println("subtraction is "+result);
        }
        else if (op == '*') {
            result=a*b;
            System.out.println("multiplication  is "+result);
        }
        else if (op == '/') {
            result=a-b;
            System.out.println("Division  is "+result);
        }
    }
}
