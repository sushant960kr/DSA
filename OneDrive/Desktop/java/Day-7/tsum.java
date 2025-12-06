import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class tsum {
    public  static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                for (int k = j+1; k < nums.length; k++) {
                    if (i != j && i != k &&  j != k && nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> arr=Arrays.asList(nums[i], nums[j], nums[k]);
                        Collections.sort(arr); // to avoid duplicates in different orders
                        if (!ans.contains(arr)) {
                            ans.add(arr);
                        }
                    }
                }
            }
        }
        return ans;
        
    }
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        int[] nums=new int[6];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < nums.length; i++) {
            nums[i]=r.nextInt();
        }
        List<List<Integer>> result =threeSum(nums);
        System.out.println("Triplets: " + result);

    }
    
}
