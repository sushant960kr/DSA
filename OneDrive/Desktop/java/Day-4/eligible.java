import java.util.Scanner;

public class eligible {
    static void isEligible(int age){
        if (age >18) {
            System.out.println("Eligible for vote");
        }else{
            System.out.println("Not Eligible for vote");
        }
    }
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age=r.nextInt();
        isEligible(age);
    }
}
