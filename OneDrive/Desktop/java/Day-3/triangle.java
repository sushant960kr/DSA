import java.util.Scanner;

public class triangle {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        System.out.println("Enter the sides of traingle: ");
        int a=r.nextInt();
        int b=r.nextInt();
        int c=r.nextInt();
        double perimeter= a+b+c;
        double area = 1/2 * a*b;
        System.out.print("Perimeter of triangle is "+perimeter);
        System.out.println();
        System.out.print("Area of triangle is "+area);
    }
}
