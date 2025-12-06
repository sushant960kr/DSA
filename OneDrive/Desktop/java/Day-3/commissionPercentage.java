import java.util.Scanner;

public class commissionPercentage {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        System.out.println("Enter the amount: ");
        int amt=r.nextInt();
        System.out.println("Enter the commission given: ");
        int com=r.nextInt();
        double commPerct= ((double)com/amt) *100;
        System.out.println("Commission Percentage is "+commPerct+"%");
    }
}
