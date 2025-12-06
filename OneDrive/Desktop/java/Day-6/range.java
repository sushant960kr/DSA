import java.util.Scanner;

public class range {
    static void searchInRange(int[] nums, int target){
        if (nums.length==0) {
            System.out.println("Size is zero");
        }
        for (int i = 1; i < nums.length-2; i++) {
            if (nums[i]== target) {
                System.out.println("At Index "+i);
            }
        }
        System.out.println("Not found");
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
        searchInRange(nums, target);
    }
}
