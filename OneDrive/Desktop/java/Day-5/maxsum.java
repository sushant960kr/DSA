
//  MAX SUBARRAY SUM  & TC is with loop is O(n cube ) nd with prefix sum is O(n square )
import java.util.Scanner;

public class maxsum {

    static void maxSubArraySum(int[] arr) {
       
        int maxsum=Integer.MIN_VALUE;
        int prefix[] =new int[arr.length];
        prefix[0]=arr[0];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i]=prefix[i-1]+arr[i];
        }
       
        // System.out.println("Sub Arrays are:");
        for (int i = 0; i < arr.length; i++) {
            int start = i;
            
            for (int j = i; j < arr.length; j++) { // include single-element subarrays
                int end = j;
                int currSum=0;

                currSum= start ==0 ? prefix[end] : prefix[end] - prefix[start-1];

                // for (int k = start; k <= end; k++) {
                //     // currSum +=arr[k];

                // }
                // System.out.println("Current Sum of sub array is "+currSum );
                if (maxsum< currSum) {
                    maxsum=currSum;
                }
                
            }
           
        }System.out.println("Maximum sum is "+maxsum);
       
    }

    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt();
        }
        maxSubArraySum(arr);
    }
}
