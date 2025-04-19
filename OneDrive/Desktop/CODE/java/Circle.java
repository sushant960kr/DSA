import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        double a,Area;
        final double PI=3.14;
        Scanner r=new Scanner(System.in);
        System.out.print("Enter the radius: ");
        a=r.nextInt();
        Area=PI*a*a;
        System.out.println("Area of Circle is " +Area);

    }
}
