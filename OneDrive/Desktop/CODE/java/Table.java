import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        int a;
        Scanner r=new Scanner(System.in);
        System.out.print("Enter the value of a:  ");
        a=r.nextInt();
        for(int i=1;i<=10;i++)
        {
            System.out.println(a+" * "+i+" = "+a*i);
        }
        
    }
}
