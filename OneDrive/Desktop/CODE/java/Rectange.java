import java.util.Scanner;

public class Rectange {
    public static void main(String[] args) {
        int a,b,ch;
        Scanner r=new Scanner(System.in);
        System.out.print("Enter the length: ");
        a=r.nextInt();
        System.out.print("Enter the breadth: ");
        b=r.nextInt();
        ch=a*b;
        System.out.println("Area of Rectange is " + ch);
    }
}
