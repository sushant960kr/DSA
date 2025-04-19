import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
        int n,count=0;
        System.out.print("Enter the value on n: ");
        Scanner r=new Scanner(System.in);
        n=r.nextInt();
        while (n>0) {
            n=n/10;
            count++;
        }
        System.out.println("No. of digits " +count);
    }
}
