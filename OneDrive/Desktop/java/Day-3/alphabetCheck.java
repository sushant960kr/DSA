import java.util.Scanner;

public class alphabetCheck {

    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        System.out.print("Enter any character: ");
        char ch=r.next().charAt(0);
        if (ch >= 'a'&& ch <='z') {
            System.out.println("Lowercase");
        }else{
            
            System.out.println("Uppercase");
        }
    }
}