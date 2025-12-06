//  position of element in infinite size of array
//  isme array.length nhi use kr skte hai
//  we are doubling the size and find the star and end to do binary search


import java.util.Scanner;

public class postion {
    static int findingRange(int[] nums, int target){
        //  first size with size 2
        int start=0;
        int end=1;
        //  check target comes in range
        while (target > nums[end]) {
            int newStart= end+1;
            //  double the box value
            end = end + (end-start+1) * 2;
            start = newStart;
        }
        return binarySearch(nums, target, start, end);
    }
    static int binarySearch(int[] nums, int target,int start, int end ){
       
        while (start <= end) {
            int mid=start + (end-start)/2;
            if (nums[mid] < target) {
                start= mid +1;
            }else  if (nums[mid] > target) {
                end=mid-1;
            }else{
               return mid;
            }
        }return -1;
    }
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
       System.out.print("Enter the target element: ");
       int target=r.nextInt();
       System.out.print("Enter the size of array: ");
       int n=r.nextInt();
        int[] nums=new int[n];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < nums.length; i++) {
            nums[i]=r.nextInt();
        }
        int pos = findingRange(nums, target);
        if (pos != -1) {
            System.out.println("Position is " + pos);
        } else {
            System.out.println("Element not found!");
        }
    }
}
