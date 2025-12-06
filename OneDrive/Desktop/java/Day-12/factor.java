import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class factor {
    public static void main(String[] args) {
        int n=150;

        // O(n)
        // for (int i = 2; i <= n/2; i++) {
        //     if (n % i == 0) {
        //         System.out.print(i+" ");
        //     }
        // }
        factorSorted(n);
}
    // O(sqrt(n))
    static void factorSorted(int n) {
        List<Integer> factors = new ArrayList<>();

        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                factors.add(i);
                if (i != n / i) {
                    factors.add(n / i);
                }
            }
        }

        Collections.sort(factors);
        System.out.println(factors);
    }
}
