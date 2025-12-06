import java.util.Arrays;
import java.util.Scanner;

public class lc389 {
    static char findTheDifference(String s, String t) {
       char[] ch=s.toCharArray();
       char[] ch1=t.toCharArray();
       Arrays.sort(ch);
       Arrays.sort(ch1);
     
       for (int i = 0; i < ch.length; i++) {
        if (ch[i] != ch1[i]) {
            return ch1[i];  
        }
        
    }return ch1[ch1.length - 1];
}

    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        System.out.println("Enter two string: ");
        String s=r.nextLine();
        String t=r.nextLine();
        System.out.println(findTheDifference(s, t));
    }
}