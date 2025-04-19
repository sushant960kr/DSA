import java.util.Scanner;

public class Leap {
    public static void main(String[] args) {
       int year;
        Scanner r=new Scanner(System.in);
        System.out.print("Enter the year: ");
        year=r.nextInt();
        if (year%100==0 && year%400==0 || year%100!=0 && year%4==0) 
        {
            System.out.println("Leap year i.e," +year);
            
        } else {
            System.out.println("Not leap year");
        }
    }
}
