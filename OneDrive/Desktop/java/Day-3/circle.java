import java.util.Scanner;

public class circle {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        System.out.print("Enter the radius: ");
        int rad=r.nextInt();
        double PI=3.14;
       
        double area = (3.14 * rad * rad);
        double perimeter = 2 *PI *rad;
        System.out.print("PErimeter of circle is "+perimeter);
        System.out.print("Area of circle is "+area);


    }
}
