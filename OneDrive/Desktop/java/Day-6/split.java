/* Q NO= 410 on L.C  ==> Split Array Largest Sum
Input: nums = [7,2,5,10,8], k = 2
Output: 18
Explanation: There are four ways to split nums into two subarrays.
The best way is to split it into [7,2,5] and [10,8], where the largest sum among the two subarrays is only 18
 */
public class split {
    public  static int splitArray(int[] nums, int k) {
        int start=0;
        int end=0;
        for (int i = 0; i < nums.length; i++) {
            start= Math.max(start, nums[i]);  // conatim max array in last
            end += nums[i];
        }
        //  binary search
        while (start < end) {
            int mid = start + ( end -start)/2;
            //  calaculate how many pieces u can divide with max sum
            int sum=0;
            int pieces = 1;
            for (int num : nums) {
                if (sum + num > mid) {
                    //  u cannot add in sub array
                    sum=num;
                    pieces++;
                   
                }else{
                    sum +=num;
                }
            }
            if (pieces > k) {
                start = mid+1;
            }else{
                end=mid;
            }
        }
        return end;
    }
    public static void main(String[] args) {
        int[] nums={7,2,5,10,8};
        int k=2;
        int result=splitArray(nums, k);
        System.out.println("Split sum of largest array is  "+result);
    }
}
