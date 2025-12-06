import java.util.Scanner;

public class hello{
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        System.out.print("Enter the name: ");
        String name=r.nextLine();
        System.out.println("Hello "+name);
    }
}