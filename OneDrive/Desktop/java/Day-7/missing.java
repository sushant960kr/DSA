import java.util.Arrays;
import java.util.Scanner;

public class missing {
    public static int missingNumber(int[] nums) {
        int i=0;
        while (i < nums.length) {
            int correctIndex = nums[i];
            if (nums[i] < nums.length && nums[i] != nums[correctIndex]) {
                
                int temp = nums[i];
                nums[i] = nums[correctIndex];
                nums[correctIndex] = temp;
            } else {
                i++;
            }
        }
        // search for missing element
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j) {
                return j;
            }
        }
        return  nums.length;
        
    }
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        int[] nums=new int[3];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < nums.length; i++) {
            nums[i]=r.nextInt();
        }
        int result=missingNumber(nums);
        System.out.println("Missing Number is "+result);
    }
}
