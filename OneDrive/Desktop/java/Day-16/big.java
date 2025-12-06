import java.math.BigDecimal;
import java.math.BigInteger;

public class big {
    public static void main(String[] args) {
        int a =30;
        int b=67;

        BigInteger A= BigInteger.valueOf(33);
        BigInteger B=new BigInteger("34575546413966316368");

        // constants
        BigInteger D= BigInteger.ZERO;

        //  addition
        BigInteger s= A.add(B);
        System.out.println(s);
        BigDecimal X=new BigDecimal("0.3");
        BigDecimal Y=new BigDecimal("0.04");
        BigDecimal X1=Y.subtract(X);
        System.out.println(X1);
    }
}
