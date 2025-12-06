import java.util.Scanner;

public class evenOdd {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        System.out.print("Enter any number: ");
        int num=r.nextInt();
        if (num %2 ==0) {
            System.out.println("Even number ");
        }else{
            System.out.println("Odd number");
        }
    }
}
