import java.util.Scanner;

public class palidrome {
    public static boolean isPalidrome(String s){
        int start=0;
        int end=s.length()-1;
        while (start <= end) {
            if (s.charAt(start)!= s.charAt(end)) {
                return false;
            }start++;
            end--;
        }
        return true;
    }
    static void countVowel(String s){
        s.toLowerCase();
        int count=0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
                count++;
            }
        }System.out.println("Total number of vowels is "+count);
    }
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        System.out.println("Enter any string: ");
        String s=r.nextLine();
        if (isPalidrome(s)) {
            System.out.println(s + " is a palindrome.");
        } else {
            System.out.println(s + " is not a palindrome.");
        }
        countVowel(s);
        

        
    }
}
