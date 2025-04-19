import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        int a,rem=0,arm=0,b;
      Scanner ref=new Scanner(System.in);
      System.out.print("Enter the number: ");
      a=ref.nextInt();
      b=a;
      while (a>0) {
        rem =a%10;
        arm=(rem*rem*rem)+arm;
        a=a/10;

      }
      if (b==arm) {
        System.out.println("Armstrong Number");
      } else {
        System.out.println("Not armstrong number");
      }
    }
}
