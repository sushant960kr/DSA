
public class butterfly {
    public static void main(String[] args) {
        int n = 4;

        // Top half
        for (int i = 1; i <= n; i++) {
            // left stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // spaces
            for (int j = 1; j <= 2*(n-i); j++) {
                System.out.print("  ");
            }
            // right stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Bottom half
        for (int i = n; i >= 1; i--) {
            // left stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // spaces
            for (int j = 1; j <= 2*(n-i); j++) {
                System.out.print("  ");
            }
            // right stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
