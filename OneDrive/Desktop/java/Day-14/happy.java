public class happy {
    public static void main(String[] args) {
        int n=19;
        System.out.println(isHappy(n));
    }
    public  static boolean isHappy(int n) {
        for (int i = 0; i < 1000; i++) {
            int sum = 0;
            while (n > 0) {
                int digit = n % 10;
                sum += digit * digit;
                n /= 10;
            }
            n = sum;
            if (n == 1) {
                return true; // Happy number
            }
        }
        return false;
    }
}
