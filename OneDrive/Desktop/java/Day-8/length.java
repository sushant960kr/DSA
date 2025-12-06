import java.util.Scanner;

public class length {
    public  static int lengthOfLastWord(String s) {
        int count = 0;
        int i = s.length() - 1;

        
        while (i >= 0 && s.charAt(i) == ' ') i--;

        // count characters of last word
        while (i >= 0 && s.charAt(i) != ' ') {
            count++;
            i--;
        }

        return count;
    }
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s=r.nextLine();
        int result=lengthOfLastWord(s);
        System.out.println("Length of last word is "+result);
    }
}
