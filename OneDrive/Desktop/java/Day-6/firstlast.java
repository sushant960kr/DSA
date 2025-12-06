/* Q.no 34 Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]
 */
import java.util.Arrays;
import java.util.Scanner;

public class firstlast {
    static int[] searchRange(int[] nums, int target) {

        int[] ans={-1,-1};

        //  check first occurance 
        int start=searchIndex(nums, target, true);
        int end =searchIndex(nums, target, false);
        ans[0]=start;
        ans[1]=end;
        return ans;

    }
    static int searchIndex(int[] nums, int target, boolean firstStartIndes){
        int ans =-1;
        int start = 0;
        int end=nums.length-1;
        while (start <= end) {
            int mid=start + (end-start)/2;
            if (nums[mid] < target) {
                start= mid +1;
            }else  if (nums[mid] > target) {
                end=mid-1;
            }else{
                ans=mid; // potential ans found
                if (firstStartIndes) {
                    end=mid-1;
                }else{
                    start=mid+1;
                }
                
            }
        }return ans;
    }
    // static void search(int[] nums , int target){
    //     for (int i = 0; i < nums.length; i++) {
    //         if (nums[i]== target) {
    //                 System.out.print(i+",");
    //             }
    //     }
    // }
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
       System.out.print("Enter the target element: ");
       int target=r.nextInt();
        int[] nums=new int[5];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < nums.length; i++) {
            nums[i]=r.nextInt();
        }
        // search(nums, target);
        int[] result=searchRange(nums, target);
        System.out.println("Output: " + Arrays.toString(result));
    }
}
