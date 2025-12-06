public class zeros {
    public static void main(String[] args) {
        int n=30204;
        System.out.println("Number of zeros are "+noOFZeros(n));
    }
    
    static int noOFZeros(int n){
        return helper(n, 0);
    }
    private static int helper(int n, int c){
        if (n==0) {
            return c;
        }
        int rem = n % 10;
        if (rem == 0) {
            return helper(n/10, c+1);
        }
        return helper(n/10, c);
    }
}
