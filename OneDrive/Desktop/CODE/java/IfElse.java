import java.util.Scanner;

public class IfElse {

    public static void main(String[] args) {
        int a;
        System.out.print("Enter the no : ");
        Scanner r=new Scanner(System.in);
        a=r.nextInt();
        if(a>=0)
        {
            System.out.println("positive nuber");
            
        }
        else{
            System.out.println("Negative number");
        }
    }
}