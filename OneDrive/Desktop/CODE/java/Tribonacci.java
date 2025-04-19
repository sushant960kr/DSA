import java.util.Scanner;

public class Tribonacci {
    public static void main(String[] args) {
        int term,a=0,b=1,c=2,d;
        System.out.print("Enter terms: ");
        Scanner r=new Scanner(System.in);
        term=r.nextInt();
        for(int i=1;i<=term;i++)
        {
            System.out.print(a+" ");
            d=a+b+c;
            a=b;
            b=c;
            c=d;

        }
    }
}
