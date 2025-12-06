import java.util.ArrayList;

public class linear {
    public static void main(String[] args) {
        int[] nums={3,2,1,18,3,9};
        int target=18;
        System.out.println("Found at index "+isFound(nums, target, 0));

        findAllIndex(nums, 3, 0);
        System.out.println("Found 3 at indexes "+list);
    }
    static int isFound(int[] nums, int target, int index){
        if (index == nums.length-1) {
            return -1;
        }
        if (nums[index] ==  target) {
            return index;
        }else{
            return  isFound(nums, target, index+1);
        }
    }

     static ArrayList<Integer> list=new ArrayList<>();
    static void findAllIndex(int[] nums, int target, int index){
        if (index == nums.length-1) {
            return ;
        }
        if (nums[index] ==  target) {
            list.add(index);
        }
        findAllIndex(nums, target, index+1);
    }
}
