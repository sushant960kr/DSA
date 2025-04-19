import java.util.Scanner;

public class Traingle {
    public static void main(String[] args) {
        int a,b,c,sp;
        double Area;
       
        Scanner r=new Scanner(System.in);
        System.out.print("Enter the values of 1st side : ");
        a=r.nextInt();
        System.out.print("Enter the values of 2nd side: ");
        b=r.nextInt();
        System.out.print("Enter the values of 3rd side: ");
        c=r.nextInt();
        sp=(a+b+c)/2;
        System.out.println("Semi-perimeter of Traingle is " +sp);
        Area=Math.sqrt(sp*(sp-a)*(sp-b)*(sp-c));
        System.out.println("Area of triangle is " +Area);
    }
}
