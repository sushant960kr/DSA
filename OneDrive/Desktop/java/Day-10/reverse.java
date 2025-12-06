public class reverse {
    public static void main(String[] args) {
        int n=121;
        System.out.println("Original Number: "+n);
        int reversed = reverseNumber(n);
        System.out.println("Reversed number: " + reversed);
    }
    static int reverseNumber(int n){
       int digits = (int)(Math.log10(n)) + 1;
       return helper(n, digits);

    }
    private static int helper(int n, int digits){
        if (n % 10 == n) {
            return n;
        }
        int rem = n %10;
        return rem * (int)Math.pow(10, digits-1) +helper(n/10, digits-1);
    }

    // //  simple way
    // static int sum=0;
    // static void reverseNo(int n){
    //     if (n==0) {
    //         return ;
    //     }
    //     int rem = n%10;
    //     sum= sum*10+rem;
    //     reverseNo(n/10);
    // }
}
