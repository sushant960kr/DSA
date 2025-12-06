public class palidrome {
    static int sum = 0;

    public static void main(String[] args) {
        int n = 121;
        if (palic(n)) {
            System.out.println(n + " is a palindrome");
        } else {
            System.out.println(n + " is not a palindrome");
        }
    }

    static boolean palic(int n) {
        sum = 0; // reset sum before reversing
        return n == reverseNo(n);
    }

    static int reverseNo(int n) {
        if (n == 0) {
            return sum;
        }
        int rem = n % 10;
        sum = sum * 10 + rem;
        return reverseNo(n / 10);
    }
}
