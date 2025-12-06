import java.util.Scanner;

public class square {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        System.out.print("Enter the side of square: ");
        int side =r.nextInt();
        double perimeter = 4*side;
        double area =side*side;
        System.out.println("Perimeter of Square is "+perimeter);
        System.out.println("Area of square is "+area);
    }
}
