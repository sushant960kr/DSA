public class sorted {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,1 ,5,6};
        if (!isSorted(nums, 0)) {
            System.out.println("Not sorted");
        }else{
            System.out.println("Sorted Array");
        }
    
    }
    static boolean isSorted(int[] nums, int index){
        if (index == nums.length-1) {
            return true;
        }
        return nums[index] < nums[index+1] && isSorted(nums, index+1);
    }
}
