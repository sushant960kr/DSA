import java.util.Scanner;

public class search1 {
    static void searchIn2D(int[][] nums, int target){
        if (nums.length == 0) {
            System.out.println("Size is zero");
        }
        boolean found = false;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                if (nums[i][j] == target) {
                    System.out.println(+target+" Found element at index ("+i+","+j+")");
                    found=true;
                }
            }
        }
        if (!found) {
            System.out.println(target + " not found in the array.");
        }
    }
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        System.out.print("Enter the target element: ");
        int target=r.nextInt();
        int[][] nums=new int[3][3];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                nums[i][j]=r.nextInt();
            }
        }
        searchIn2D(nums, target);
    }
}
