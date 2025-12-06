public class poweroftwo {
    public static void main(String[] args) {
        int n = 6;

        if (n > 0 && (n & (n - 1)) == 0) {
            System.out.println(n + " is a Power of Two");
        } else {
            System.out.println(n + " is Not a Power of Two");
        }
    }
}
