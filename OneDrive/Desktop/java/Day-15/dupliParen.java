import java.util.Stack;

public class dupliParen {
    
    
    public static boolean isDuplicate(String str){
        Stack<Character>  s=new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);
            if (ch==')') {
                int count=0;
                while (s.peek() != '(') {
                    s.pop();
                    count++;
                }
                if (count < 1) {
                    return true; // duplicate
                }else{
                    s.pop();
                }
            }else{
                s.push(ch);
            }
            
        }return false ; // no duplicate
    }
    public static void main(String[] args) {
        String str= "(a+b)"; // false
        // String str="((a+b))"; // true
        System.out.println(isDuplicate(str));

    }
}
