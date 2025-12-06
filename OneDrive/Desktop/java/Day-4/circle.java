import java.util.Scanner;

public class circle {
    static void  areaCir(int rad){
        double pi=3.14;
        double area = pi*rad*rad;
        double cir=2*pi*rad;
        System.out.println("Area of circle is "+area);
        System.out.println("circumference of circle is "+cir);
    }
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        System.out.print("Enter the radius of circle: ");
        int  rad=r.nextInt();
        areaCir(rad);
    }
}
