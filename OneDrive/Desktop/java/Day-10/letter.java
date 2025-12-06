//  lc - 17

import java.util.ArrayList;
import java.util.List;

public class letter {
    public static void main(String[] args) {
        pad("","12");
        System.out.println(letterCombinations("12", ""));

        System.out.println("No of combination: "+padCount("", "12"));
    }
    public static List<String> letterCombinations(String digits, String p) {
        if (digits.isEmpty()) {
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        // it will convert '2' into 2
        int digit = digits.charAt(0) - '0';
    
        List<String> list = new ArrayList<>();  // ✅ fixed: String with capital S
        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);
            list.addAll(letterCombinations(digits.substring(1), p + ch)); // ✅ fixed: correct param order
        }
        return list;
    }
    
    static void pad(String p, String up){
        if (up.isEmpty()) {
            System.out.println(p);
            return; 
        }
        int count=0;
        //  it will convert '2' into 2
        int digit = up.charAt(0) - '0';
        for (int i = (digit -1 ) * 3; i < digit * 3; i++) {
            char ch= (char)('a'+ i);
          pad( p+ch , up.substring(1));
        }
    }
    //  count the no of combination
    static int  padCount(String p, String up){
        if (up.isEmpty()) {
            return 1; 
        }
        int count=0;
        //  it will convert '2' into 2
        int digit = up.charAt(0) - '0';
        for (int i = (digit -1 ) * 3; i < digit * 3; i++) {
            char ch= (char)('a'+ i);
           count +=padCount( p+ch , up.substring(1));
        }
        return count;
    }
}
