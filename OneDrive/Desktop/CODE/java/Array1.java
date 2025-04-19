import java.util.Arrays;
public class Array1 {
    public static void main(String[] args) {
        String a[]={"learn","coding","keywords","education"};
        System.out.println("tostring()" +Arrays.toString(a));
        System.out.println("aslist()"+Arrays.asList(a));
        int arr[][]={{10,20},{30,40}};
        System.out.println("deeptostring()"+Arrays.deepToString(arr));
    }
}
