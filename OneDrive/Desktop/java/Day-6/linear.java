import java.util.Scanner;

public class linear {
    static void searchTarget(int[] nums, int target){
        for (int i = 0; i < nums.length; i++) {
            
            if (nums[i]==target) {
                System.out.println("Found at "+i);
            }
        }
    }
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        System.out.print("Enter the target element: ");
        int target=r.nextInt();
        int[] nums=new int[5];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < nums.length; i++) {
            nums[i]=r.nextInt();
        }
        searchTarget(nums, target);
    }
}
