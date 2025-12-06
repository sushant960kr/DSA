import java.util.Scanner;

public class largest {
    static void indicesOfLargest(int[] nums){
        int indices=0;
        int temp=0;
        for (int  i = 0; i < nums.length; i++) {
            if (nums[i]>= temp ) {
                temp=nums[i];
                indices=i;
            }
        }
        System.out.println("Largest element in array is "+temp+" at indices "+indices);
    }
    static void minimumElement(int[] nums){
        int ans=nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]< ans) {
                ans=nums[i];
            }
        }
        System.out.println("Minimum element is "+ans);
    }

    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        int[] nums=new int[5];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < nums.length; i++) {
            nums[i]=r.nextInt();
        }
        indicesOfLargest(nums);
        minimumElement(nums);
    }

}