import java.util.Arrays;
import java.util.Scanner;

public class twosum {
    static void twoSum(int[] nums, int target){
        Arrays.sort(nums);
        if (nums.length==0) {
            System.out.println("Size is zero");
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i]+nums[j]  == target) {
                    System.out.println("Found at indices ("+i+","+j+")");
                }
            }
        }
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
        twoSum(nums, target);
    }
}
