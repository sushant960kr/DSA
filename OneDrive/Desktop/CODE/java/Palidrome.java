import java.util.Scanner;

public class Palidrome {
    public static void main(String[] args) {
      int a,c,s=0,r;
      Scanner ref=new Scanner(System.in);
      System.out.print("Enter the number: ");
      a=ref.nextInt();
      c=a;
      
      while (a>0) {
        r=a%10;
        s=(s*10)+r;
        a=a/10;

      }
      if (c==s) {
        System.out.println("Palidrome Number");
      }
      else{
        System.out.println("Not Palidrome Number");
      }
    }
}
