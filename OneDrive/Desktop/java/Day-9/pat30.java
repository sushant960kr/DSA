

public class pat30 {
    public static void main(String[] args) {
        int  n=5;
        for (int i = 0; i < n+1; i++) {
            for (int spaces = 0; spaces < n-i; spaces++) {
                System.out.print("  ");
            }
            for (int j = i; j  >=1; j--) {
                System.out.print(j+" ");
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        // pat-17
        for (int i = n-1; i >= 1; i--) {
            for (int spaces = 1; spaces <= n-i; spaces++) {
                System.out.print("  "); 
            }
            for (int j = i; j  >=1; j--) {
                System.out.print(j+" ");
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        
    }
}
