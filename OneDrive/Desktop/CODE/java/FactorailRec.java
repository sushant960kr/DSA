import java.util.Scanner;

public class FactorailRec {
    public static void main(String[] args) {
        int n;
        Scanner r=new Scanner(System.in);
        System.out.print("Enter any number: ");
        n=r.nextInt();
        FactorailRec ref=new FactorailRec();
        
        int result =ref.fact(n);
        System.out.print("Factorial of given number is " +result);
    }
    int fact(int n)
    {
        if(n==1){
            return 1;
        }
        else{
            return n*fact(n-1);
        }
    }
}
