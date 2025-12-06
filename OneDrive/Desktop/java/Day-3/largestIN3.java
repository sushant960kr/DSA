import java.util.Scanner;

public class largestIN3 {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        System.out.println("Enter the three numbers: ");
        int a=r.nextInt();
        int b=r.nextInt();
        int c=r.nextInt();
        if (a > b && a >c ) {
            System.out.println(a+" is the largest among three numbers");
        }
        else if (b>a && b>c) {
            System.out.println(b+" is the largest among three numbers");
        }
        else if (c>a && c>a) {
            System.out.println(c+" is the largest among three numbers");
        }
    }
}
