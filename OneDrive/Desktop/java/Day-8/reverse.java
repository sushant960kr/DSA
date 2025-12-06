import java.util.Scanner;

public class reverse {
    static void reverseString(String str){
        int n=str.length();
        for (int i = n-1; i >=0; i--) {
            System.out.print(str.charAt(i));
        }
    }
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str=r.nextLine();
        reverseString(str);
    }
}
