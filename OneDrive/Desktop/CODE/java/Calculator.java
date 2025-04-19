import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int a,b,ch;
        Scanner r=new Scanner(System.in);
        System.out.print("Enter the values of a: ");
        a=r.nextInt();
        System.out.print("Enter the values of b: ");
        b=r.nextInt();
        System.out.print("Select Operation: ");
        ch=r.nextInt();
        if (ch==1) {
            ch=a+b;
            System.out.println("Sum of the number is " +ch);
        }
        else if (ch==2) {
            ch=a-b;
            System.out.println("Subtraction of the number is " +ch);

        }
        else if (ch==3) {
            ch=a*b;
            System.out.println("Multiplication of the number is " +ch);
        }
        else if (ch==4) {
            ch=a/b;
            System.out.println("Division of the number is " +ch);
        }
        else if (ch>=5) {
            System.out.println("Invalid Options");
        }
        

    }
}
