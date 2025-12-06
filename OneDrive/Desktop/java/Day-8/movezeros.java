import java.util.Scanner;
import java.util.Arrays;

public class movezeros {

    
    public static void moveZeroes(int[] nums) {
        int n = nums.length;
        int[] temp = new int[n];
        int index = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {   // by default array mai 0 rehta hai
                temp[index++] = nums[i];
            }
        }

        System.out.println("New Array is: " +Arrays.toString(temp));
    }

    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        int[] nums = new int[5];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = r.nextInt();
        }

        moveZeroes(nums); 

        // System.out.println("New Array is: " + Arrays.toString(nums));
    }
}
