import java.util.Arrays;
import java.util.Scanner;

public class duplic {
    public static int findDuplicate(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correctIndex = nums[i] - 1; 
            if (nums[i] != nums[correctIndex]) {
                int temp = nums[i];
                nums[i] = nums[correctIndex];
                nums[correctIndex] = temp;
            } else {
                i++;
            }
        }

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j + 1) {
                return nums[j]; 
            }
        }
        return -1;
    }
    public static int findAllDuplicate(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correctIndex = nums[i] - 1; 
            if (nums[i] != nums[correctIndex]) {
                int temp = nums[i];
                nums[i] = nums[correctIndex];
                nums[correctIndex] = temp;
            } else {
                i++;
            }
        }

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j + 1) {
                return nums[j]; 
            }
        }
        return -1;
    }


    public static void main(String[] args) {
         Scanner r=new Scanner(System.in);
        int[] nums=new int[3];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < nums.length; i++) {
            nums[i]=r.nextInt();
        }
        int result=findDuplicate(nums);
        System.out.println("Duplicates value are "+result);
    }
}
