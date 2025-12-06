import java.util.Scanner;

public class forsum {
    static void fourSum(int[] nums , int target){
        int n= nums.length;
        boolean found = false;
        for (int i = 0; i < n - 3; i++) {
            for (int j = i + 1; j < n - 2; j++) {
                for (int k = j + 1; k < n - 1; k++) {
                    for (int l = k + 1; l < n; l++) {
                        if (nums[i] + nums[j] + nums[k] + nums[l] == target) {
                            System.out.println("Quadruplet: [" + nums[i] + "," + nums[j] + "," + nums[k] + "," + nums[l] + "]");
                            found = true;
                        }
                    }
                }
            }
        }
        if (!found) {
            System.out.println("No quadruplet found");
        }
    }
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        System.out.print("Enter target element: ");
        int target=r.nextInt();
        int[] nums=new int[5];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < nums.length; i++) {
            nums[i]=r.nextInt();
        }
        fourSum(nums, target);
    }
}
