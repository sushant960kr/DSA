/*Array → {1, 2, 3}
Possible subarrays:
{1}, {2}, {3}, {1,2}, {2,3}, {1,2,3}
 */

import java.util.Scanner;

public class subarray {
    static void subArray(int[] arr) {
        int ts = 0; 
      
       
        System.out.println("Sub Arrays are:");
        for (int i = 0; i < arr.length; i++) {
            int start = i;
            
            for (int j = i; j < arr.length; j++) { // include single-element subarrays
                int end = j;
             
                for (int k = start; k <= end; k++) {
                    
                    System.out.print(arr[k] + " ");  
                   
                }
                ts++; // count each subarray
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total sub arrays: " + ts);
        
       
    }

    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        int[] arr = new int[3];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt();
        }
        subArray(arr);
    }
}
