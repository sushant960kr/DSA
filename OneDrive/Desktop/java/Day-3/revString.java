import java.util.Scanner;

public class revString {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        System.out.print("Enter any string: ");
        String str=r.nextLine();
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }

        System.out.println("Reversed string: " + reversed);
    }
}
