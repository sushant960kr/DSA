import java.util.Scanner;

public class factor {
    public static void main(String[] args) {
        int a;
        Scanner r=new Scanner(System.in);
        System.out.print("Enter any number: ");
        a=r.nextInt();
        for(int i=1;i<=a;i++)
        {
            if (a%i==0) {
                System.out.print(i+" ");
            }

        }
    }
}
