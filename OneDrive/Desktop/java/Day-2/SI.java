import java.util.Scanner;

public class SI {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        System.out.print("Enter the principal: ");
        int p=r.nextInt();

        System.out.print("Enter the time: ");
        int t=r.nextInt();

        System.out.print("Enter the ROI: ");
        int ra=r.nextInt();

       float si=(p*t*ra) / 100;
       System.out.println("Simple Intrest is "+si);

    }
}
