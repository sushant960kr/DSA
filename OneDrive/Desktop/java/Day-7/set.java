/* Set Duplicate
Input: nums = [1,2,2,4]
Output: [2,3]
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class set {

    public static int[] findErrorNums(int[] nums) {
        int i=0;
        while (i < nums.length) {
            int correctIndex = nums[i]-1;
            if (nums[i] <= nums.length && nums[i] != nums[correctIndex]) {
                
                int temp = nums[i];
                nums[i] = nums[correctIndex];
                nums[correctIndex] = temp;
            } else {
                i++;
            }
        }
        // just find missing element
        List<Integer> ans=new ArrayList<>();
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j+1) {
                return new int[] {nums[j],j+1};
                                
            }
        }
        return  new int[] {-1,-1};
    }
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        int[] nums=new int[3];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < nums.length; i++) {
            nums[i]=r.nextInt();
        }

        int[] result=findErrorNums(nums);
        System.out.println("Set Mismatch is "+result);
    }
}
