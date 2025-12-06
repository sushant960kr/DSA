import java.util.Scanner;

public class fibnoacci {
    // static int fibnoacci(int n){
    //     if (n==1 || n==0) {
    //          return n;
    //     }
    //      return  fibnoacci(n-1)+fibnoacci(n-2);
    // }

    static long fiboFormula(int n){
       return  (long)(Math.pow((1 + Math.sqrt(5) / 2), n));
    }
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=r.nextInt();
        // System.out.println("Fibnoacci number is "+fibnoacci(num));
        for (int i = 0; i < 50; i++) {
            System.out.println(fiboFormula(i));
        }
        System.out.println(fiboFormula(num));

    }
}
