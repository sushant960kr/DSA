import java.util.Scanner;

public class ncrNpr {
    // Method to calculate factorial
    public static int factorial(int num) {
        int fact = 1;
        for (int i = 2; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);

        System.out.print("Enter value of n: ");
        int n = r.nextInt();

        System.out.print("Enter value of r: ");
        int rVal = r.nextInt();

        if (rVal > n) {
            System.out.println("r should not be greater than n.");
            return;
        }

        int nFact = factorial(n);
        int rFact = factorial(rVal);
        int nMinusRFact = factorial(n - rVal);

        int nCr = nFact / (rFact * nMinusRFact);
        int nPr = nFact / nMinusRFact;

        System.out.println("nCr (Combination): " + nCr);
        System.out.println("nPr (Permutation): " + nPr);
    }
}
