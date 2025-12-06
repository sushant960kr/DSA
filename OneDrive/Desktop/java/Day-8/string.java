import java.util.ArrayList;
import java.util.Arrays;

public class string {
    public static void main(String[] args) {
        String a="sushant";
        String b="sushant";
        System.out.println(a==b);

        String a1=new String("kunal");
        String b1=new String("  kunal");
        System.out.println(a1==b1);
        System.out.println(a1.equals(b1));
        System.out.println(a.charAt(1));
        System.out.println(Arrays.toString(new int[]{1,2,3,4}));
        float f=22.1314f;
        System.out.printf("format no is %.2f",f);

        System.out.println('a'+'b');
        System.out.println("a"+"b");
        System.out.println((char)('a'+3));

        System.out.println("Kunal"+ new ArrayList<>());

        
       char[] ch={'a','b','c','d','e'};
       System.out.println(Arrays.toString(ch.reverse));

    }
    
}