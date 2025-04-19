import java.util.Scanner;

public class Nn {
    public static void main(String[] args) {
        int n, sum=0;
        System.out.print("Enter no of terms: ");
        Scanner r=new Scanner(System.in);
        n=r.nextInt();
        for(int i=1;i<=n;i++)
        {
            sum=sum+i;
            
        }
        System.out.print("Addition " + sum);
    }
}
