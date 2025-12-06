import java.util.Scanner;

public class leap {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year=r.nextInt();

        if (year % 4== 0 || year % 400==0) {
            System.out.println("Leap year");
        }else{
            System.out.println("Not leap year");
        }
    }
}
