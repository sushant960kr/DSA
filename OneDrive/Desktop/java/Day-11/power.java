
public class power {

    public static void main(String[] args) {
        int base=3;
        int power=6;
        int ans=1;
         
        // while (power > 0) {
        //     if ((power & 1) == 1) {
        //         ans *= base;
        //     }
        //      base *=base;
        //      power = power >> 1;
        // }
        // System.out.println(ans);

        int ans1=1;
       System.out.println("Initial value of ans1: " + ans1);
        for (int i = 1; i <= power; i++) {
            ans1= ans1 * base;
        }
        System.out.println("Power of number is "+ans1);
    }
}