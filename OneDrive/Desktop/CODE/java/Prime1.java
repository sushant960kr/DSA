import java.util.Scanner;

public class Prime1 {
    public static void main(String[] args) {
        int a,b,i,j;
        Scanner r=new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        a=r.nextInt();
        
        b=r.nextInt();
        for( i=a;i<=b;i++)
        {
            for ( j = 2; j <=i; j++) {
                if (i%j==0) 
                    break;
                
                
                }
                if (i==j) {
                    System.out.print(j+"  "); 
                
            }
        }
    }
}
