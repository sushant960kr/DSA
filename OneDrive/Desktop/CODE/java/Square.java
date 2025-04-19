import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        int a,ch;
        Scanner r=new Scanner(System.in);
        System.out.print("Enter the side  of square: ");
        a=r.nextInt();
        ch=a*a;
        System.out.println("Area of square is " +ch);
    }
}
