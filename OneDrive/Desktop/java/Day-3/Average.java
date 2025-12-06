import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        System.out.print("Enter the  numbers: ");
        int num=r.nextInt();
        int sum=0;
        double avg=0;
        
        for (int i = 1; i <= num; i++) {
            sum +=i;
        }
        avg=sum/num;
        System.out.println("Sum of N numbers is "+sum);
        System.out.println("Average of N numbers is "+avg);
    }
}
