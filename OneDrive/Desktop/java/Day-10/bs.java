import java.util.Scanner;

public class bs {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6,7,8};
        int  target=7;
        int result=search(nums, target, 0, nums.length-1);
        System.out.println("Found at index: "+result);

    }
    static int search(int[] nums,int target ,int s, int e){
       if (s > e) {
        return -1;
       }
        int m= s+(e-s)/2;
        if (nums[m]==target) {
            return m;
        }
        if (target <nums[m]) {
            search(nums, target, s, m-1);
        }
        return search(nums, target, m+1, e);
    }
}
