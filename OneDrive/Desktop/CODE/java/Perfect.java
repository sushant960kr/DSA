import java.util.Scanner;

public class Perfect {
    public static void main(String[] args) {
        int a,sum=0;
        Scanner r=new Scanner(System.in);
        System.out.print("Enter the number: ");
        a=r.nextInt();

        for(int i=1;i<a;i++)
        {
            if (a%i==0) {
                sum=sum+i;
            }

        }
        if (a==sum) {
            System.out.println("Perfect Number");
        }
        else{
            System.out.println("Not Perfect Number");
        }
    }
}
