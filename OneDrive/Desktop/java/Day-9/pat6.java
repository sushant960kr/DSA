

public class pat6 {
    public static void main(String[] args) {
        int n=5;
        for (int i = 1; i <= n; i++) {        // rows
            for (int j = 1; j <= n - i; j++) { // spaces
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {     // stars
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("Inverted is ");
        for (int i = n; i >0; i--) {        // rows
            for (int j = i; j >0; j--) { // spaces
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {     // stars
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
