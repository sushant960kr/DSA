import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        System.out.println("Enter the length and breadth of rectangle: ");
        double l=r.nextInt();
        double b=r.nextInt();

        double perimeter=2 *(l+b);
        double area = l*b;
        System.out.print("Perimeter of rectangle is "+perimeter);
        System.out.println();
        System.out.print("Area of rectangle is "+area);

    }
}
