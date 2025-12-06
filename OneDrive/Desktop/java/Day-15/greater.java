//  Q. No->  496
/*      Input: nums = [1,2,1]
        Output: [2,-1,2]
 */

import java.util.Stack;

public class greater {
    public static void main(String[] args) {
        int nums[]={1,2,1};
        Stack<Integer> s=new Stack<>();
        int nxtGreater[] = new int[nums.length];
        for (int i = nums.length-1; i>=0; i--) {
            while (!s.isEmpty() && nums[s.peek()] <= nums[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nxtGreater[i]= nums[s.peek()];
            }else{
                nxtGreater[i] = nums[s.peek()];
            }
            s.push(i);
        }
        for (int i = 0; i < nxtGreater.length; i++) {
            System.out.print(nxtGreater[i]+" ");
        }System.out.println();
    }
}
