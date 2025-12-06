import java.util.Scanner;

public class palidrome {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        System.out.print("Enter any string: ");
        String original = r.nextLine();

        System.out.print("Enter any number: ");
        int num=r.nextInt();
        int reverse=0;
        int original1=num;

        String reversed = "";
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed += original.charAt(i);
        }

        if (original.equalsIgnoreCase(reversed)) {
            System.out.println("\"" + original + "\" is a Palindrome.");
        } else {
            System.out.println("\"" + original + "\" is NOT a Palindrome.");
        }

        while (num > 0) {
            int digit=num%10;
            reverse=reverse*10+digit;
            num /=10;
        }
        if (original1==reverse) {
            System.out.println(original1 +" is a palidrome number.");
        }
        else{
            System.out.println(original1 +" is not a palidrome number.");
        }



    }
}
