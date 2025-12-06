import java.util.Arrays;

public class xor {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 1, 2, 1, 3, 6, 4};
    
        int result = duplicate(arr);
        System.out.println("Unique element: " + result);
    }

    private static int duplicate(int[] arr) {
        int unique = 0;
        for (int i : arr) {
            unique ^= i;   
         }
        return unique;
    }
}
