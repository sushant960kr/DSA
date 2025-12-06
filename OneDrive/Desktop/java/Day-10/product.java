public class product {
    public static void main(String[] args) {
        int n=5;
        productToN(n);
        System.out.println(productToN(n));
        System.out.println("Sum of number is "+sumToN(n));
    }
    static int productToN(int n){
        
        if (n==1 || n==0) {
            return n;
        }
        return  productToN(n-1)*n;
    }
    static int sumToN(int n){
        if (n==1 || n==0) {
            return n;
        }
        return  sumToN(n-1)+n;
    }
}
