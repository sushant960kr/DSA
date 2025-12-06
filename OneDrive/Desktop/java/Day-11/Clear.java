

public class Clear {
    public static void main(String[] args) {
        int n = 13;  // binary = 1101
        int i = 2;   // clear the 2nd bit (0-based)

        int newNum = n & ~(1 << i);

        System.out.println("Original number: " + n + " (" + Integer.toBinaryString(n) + ")");
        System.out.println("After clearing " + i + "th bit: " + newNum + " (" + Integer.toBinaryString(newNum) + ")");
    
    }
}
