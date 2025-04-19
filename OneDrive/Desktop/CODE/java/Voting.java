import java.util.Scanner;

public class Voting {
    public static void main(String[] args) {
        int age;
        Scanner r=new Scanner(System.in);
        System.out.print("Enter your age :" );
        age=r.nextInt();
        if (age>=18) {
            System.out.println("you are eligible to vote");
        } else {
            System.out.println("Not eligible");
        }
    }
}
