public class manipulation {
    public static void main(String[] args) {
        int n=8;
        int ans= addOne(n);
        System.out.println(ans);
    }
    public static int addOne(int n) {
        int carry = 1;
        while (carry != 0) {
            int sum = n ^ carry;       // add without carry
            carry = (n & carry) << 1;  // calculate carry
            n = sum;
        }
        return n;
    }

}
