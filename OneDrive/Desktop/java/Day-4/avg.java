import java.util.Scanner;

public class avg {
    static int  averageOfThree(int a,int b,int c){
        int sum= a+b+c;
        int  avg=sum /3;
        return avg;

    }
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        System.out.println("Enter any three numbers: ");
        int a=r.nextInt();
        int b=r.nextInt();
        int c=r.nextInt();

        int result =averageOfThree(a, b, c);
        System.out.println("Average of 3 numbers is "+result);
    }
}
