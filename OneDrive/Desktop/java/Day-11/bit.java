
public class bit {
    public static void main(String[] args) {
        int n=15;
        int i = 2;   //  (0-based)  check

        int bit = (n >> i) & 1;

        System.out.println("The " + i + "th bit of " + n + " is: " + bit);
        
        
        //  set a particular index bit to 1
        int n1 = 23;  
        int i1 = 5;   

        int newNum = n1 | (1 << i1);
        
        
        System.out.println("Original number: " + n1 + " (" + Integer.toBinaryString(n1) + ")");
        System.out.println("After setting " + i1 + "th bit: " + newNum + " (" + Integer.toBinaryString(newNum) + ")");
    }
}
