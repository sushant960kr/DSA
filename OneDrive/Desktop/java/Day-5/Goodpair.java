/* A pair (i, j) is called good if nums[i] == nums[j] and i < j.
Input: nums = [1,2,3,1,1,3]
Output: 4
Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.
 */
import java.util.Scanner;

public class Goodpair {

    static int identicalPairs(int[] nums, int n) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    System.out.println("Indices: (" + i + "," + j + ")");
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = r.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = r.nextInt();
        }
        int result = identicalPairs(nums, n);
        System.out.println("Total good pairs: " + result);
    }
}
