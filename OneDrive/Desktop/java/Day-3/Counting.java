import java.util.Scanner;

public class Counting {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num= r.nextInt();
        System.out.print("Enter the digit you want to check: ");
        int s=r.nextInt();
        int count=0;
        
        while (num>0) {
            int rem=num%10;
            if (rem==s) {
                count++;
            }
            num=num/10;
        }
        System.out.println("Number of time digit occur in the given number is "+count);
    }
}
