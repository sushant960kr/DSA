public class pattern {
    public static void main(String[] args) {
        int n=5;
        // for (int i = n; i >0 ; i--) {
        //     for (int j = i; j > 0; j--) {
        //         System.out.print("*"+" ");
        //     }System.out.println();
        // }
        triangle(4, 0);
        triangle1(4, 0);
    }
    static void triangle(int r,int c ){
        if (r == 0) {
            return;
        }
        if (c < r) {
            System.out.print("*"+" ");
            triangle(r, c+1);
        }else{
            System.out.println();
            triangle(r-1, 0);
        }
    }
    static void triangle1(int r,int c ){
        if (r == 0) {
            return;
        }
        if (c < r) {
            triangle1(r, c+1);
            System.out.print("*"+" ");
        }else{
            triangle1(r-1, 0);
            System.out.println();
        }
    }
}
