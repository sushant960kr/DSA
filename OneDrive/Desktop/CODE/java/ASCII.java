import java.util.Scanner;

public class ASCII {
    public static void main(String[] args) {
        char ch;
        System.out.print("Enter any character: ");
        Scanner r=new  Scanner(System.in);
        ch=r.next().charAt(0);
        int a=ch;
        System.out.print("ASCII value of "+ch +" is " + a);
    }
}
