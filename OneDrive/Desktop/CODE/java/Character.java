import java.util.Scanner;

public class Character {
    public static void main(String[] args) {
        char ch;
        System.out.print("Enter the character: ");
        Scanner r=new Scanner(System.in);
        ch=r.next().charAt(0);
        System.out.println(ch);
    }
}
