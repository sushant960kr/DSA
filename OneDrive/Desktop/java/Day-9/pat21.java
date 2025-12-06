
public class pat21 {
    public static void main(String[] args) {
        int n=7;
        for (int i = 1; i <=n; i++) {
            for (int j = n-i; j > 0; j--) {
                System.out.print(i+" ");
            }
            System.out.println( );
        }
    }
}
