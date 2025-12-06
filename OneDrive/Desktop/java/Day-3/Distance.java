import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        System.out.print("Enter the fist distance: ");
        int a=r.nextInt();
        System.out.print("Enter the second distance: ");
        int b=r.nextInt();
        int dist=a-b;
        System.out.println("Distance b/w two point is "+dist);
    }
}
