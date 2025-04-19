import java.util.Scanner;

public class Cal {
    public static void main(String[] args) {
        int n,i,sum=0;
        System.out.print("Enter the number: ");
        Scanner r=new Scanner(System.in);
        n=r.nextInt();

        if (n%2==0) {
            for( i=0;i<=n;i=i+2)
            {
                sum=sum+i;
                

            }
            System.out.print("Sum of Even no: " + sum);
        } else {
            for(i=1;i<=n;i +=2)
            {
                sum=sum+i;


            }
            System.out.print("Sum of Odd no: " + sum);
            
        }
    }
}
