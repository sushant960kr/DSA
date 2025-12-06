import java.util.Scanner;

public class largest {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        System.out.println("Enter any two number:");
        int a=r.nextInt();
        int b=r.nextInt();
        if (a > b ) {
            System.out.println("A is largest");
        }else{
            System.out.println("B is largest");
        }
    }
}
