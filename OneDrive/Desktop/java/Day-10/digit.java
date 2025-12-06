public class digit {
    public static void main(String[] args) {
        int n=1234;
        System.out.println("Sum of digit is "+sumOFDigit(n));
    
        System.out.println("Product of digit is "+productOFDigit(n));
    }
    static int sumOFDigit(int n){
        if (n==0) {
            return 0;
        }
        return (n%10)+sumOFDigit(n/10);
    }

    static int productOFDigit(int n){
        if (n==0 || n==1) {
            return n;
        }
        return (n%10) * productOFDigit(n/10);
    }
}
