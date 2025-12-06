/*
 * Input: nums = [1,2,3,1]

Output: true

Explanation:

The element 1 occurs at the indices 0 and 3.
 */

import java.util.Arrays;

public class duplicate {
    
    static boolean  containDuplicate(int[] num){
        
        for (int i = 0; i < num.length-1; i++) {
            if(num[i]== num[i+1]){
                return true;
            }
            
        }  return false;
    }
    public static void main(String[] args) {
        int[] nums={1,2,3,1};
        Arrays.sort(nums);
        boolean result=containDuplicate(nums);
        if (result) {
            System.out.println("Found");
        }else{
            System.out.println(" Not Found");
        }
    
    }
}
