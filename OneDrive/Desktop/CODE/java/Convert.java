import java.util.Scanner;

public class Convert {
    public static void main(String[] args) {
        char ch,ch2;
        System.out.print("Enter any character: ");
        Scanner r=new Scanner(System.in);
        ch=r.next().charAt(0);
        if (ch>='A' && ch<='Z') {
            ch2=Character.toLowercase(ch);
            System.out.println("Lowercase " +ch2);
        } else {
            ch2=Character.toUppercase(ch);
            System.out.println("Uppercase " +ch2);
        }
    }
}
