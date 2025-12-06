/*Input: nums = [-1,0,3,5,9,12], target = 9
Output: 4
Explanation: 9 exists in nums and its index is 4
 */
import java.util.Arrays;
import java.util.Scanner;

public class binary {
     public  static int search(int[] nums, int target) {
        
        
        int start=0 , end=nums.length-1;
        boolean isAsc= nums[start] < nums[end];

        while (start <= end ) {
           
                int mid=start+ (end - start)/2;
                if (nums[mid]== target) {
                    return mid;
                }
                if (isAsc) {
                    if (target > nums[mid] ) {
                        start = mid+1;
                    }else{
                      end=mid-1;
                    }
                }else{
                    if (target < nums[mid] ) {
                         start = mid+1;
                    }else{
                        end=mid-1;
                    }
                }
        }

        return -1;
    }
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        System.out.print("Enter target element: ");
        int target = r.nextInt();
        int[] nums=new int[5];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < nums.length; i++) {
            nums[i]=r.nextInt();
        }
        int index = search(nums, target);
        if (index != -1) {
            System.out.println("Key found at index: " + index);
        } else {
            System.out.println("Key not found in the array.");
        }
    }
}
