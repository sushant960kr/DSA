import java.util.Scanner;

public class IF {
    public static void main(String[] args) {
        int age;
        System.out.print("Enter your age : ");
        Scanner r=new Scanner(System.in);
        age=r.nextInt();
        if (age>=18) {
            System.err.println("Eligible for voting");
        }
    

        System.out.println("Thankyou!!!");
    }
}
