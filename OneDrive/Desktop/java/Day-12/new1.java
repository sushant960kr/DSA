public class new1 {
    public static void main(String[] args) {
        int num = 50;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                System.out.println("not prime");
                return ;
            }
        }System.out.println("prime");
        // for (int i = 2; i <= num; i++) {
        //     System.out.println(i + " " + rangeOfPrime(i));
        // }
    }

    static boolean rangeOfPrime(int num) {
        if (num <= 1) {
            return false;
        }
        int c = 2;
        while (c * c <= num) {
            if (num % c == 0) {
                return false;
            }
            c++;
        }
        return true;
    }
}
