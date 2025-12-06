import java.util.Scanner;

public class greet {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        System.out.print("Enter any name : ");
        String name =r.nextLine();
        System.out.println("Welcome back "+name);

    }
}
