public class square {
    public static void main(String[] args) {
        int n=40;
        int p=2;
        // for (int i = 2; i <= Math.sqrt(n); i++) {
        //     if (i*i== n) {
        //         System.out.println(i);
        //     }
        // }
        
        System.out.printf("%.3f",sqrt(n, p));
    }
    static double sqrt(int n, int p){
        int start=0;
        int end=n;
        double root=0.0;
        while (start <= end) {
            int m=start +(end-start)/2;
            if (m*m == n) {
                return m;
            }
            if (m*m > n ) {
                end=m-1;
            }else{
                start=m+1;
            }
        }
        double incr=0.1;
        for (int i = 0; i < p; i++) {
            while (root*root <= n ) {
                root +=incr;
            }
            root -=incr;
            incr /=10;
        }
        
        return root;
    }
}
