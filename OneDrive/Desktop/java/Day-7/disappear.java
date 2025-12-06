import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
// 448 google question
public class disappear {
    public static List<Integer>  missingNumber(int[] nums) {
        int i=0;
        while (i < nums.length) {
            int correctIndex = nums[i]-1;
            if (nums[i] < nums.length && nums[i] != nums[correctIndex]) {
                
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
                ans.add(j + 1);
                                
            }
        }
        return  ans;
        
    }
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        int[] nums=new int[3];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < nums.length; i++) {
            nums[i]=r.nextInt();
        }
        List<Integer>  result = missingNumber(nums);
        System.out.println("All missing numbers are "+result);

    }
}
