

public class rect {
    public static void main(String[] args) {
        int n=4;
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("Inverted pattern is ");
        for (int i = n; i > 0; i--) {
            for (int j = i; j >0; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Number Pattern is ");
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
