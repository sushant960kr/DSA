// Input: nums = [2,2,1]
// Output: 1

import java.util.Arrays;
import java.util.Scanner;

public class single {
    public static int singleNumber1(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i += 2) {
            if (nums[i] != nums[i + 1]) {
                return nums[i];
            }
        }
        return nums[nums.length - 1]; 
    }
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        int[] nums=new int[5];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < nums.length; i++) {
            nums[i]=r.nextInt();
        }
        int result= singleNumber1(nums);
        System.out.println("Single Number(Element) is "+result);
    }
}
