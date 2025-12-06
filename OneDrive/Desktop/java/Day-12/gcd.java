public class gcd {
    public static void main(String[] args) {
        int a=4;
        int  b=8;
       System.out.println("HCF is "+gcd(a, b));
       System.out.println("LCM is "+lcm(a, b));
    }
    static int gcd(int a, int b){
        if (a==0) {
            return b;
        }
        return gcd(b%a, a);
    }
    static int lcm(int a , int b)
    {
        return a*b / gcd(a, b);
    }
}
