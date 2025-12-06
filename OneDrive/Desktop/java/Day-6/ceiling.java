//  floor and ceil of a number
import java.util.Arrays;
import java.util.Scanner;

public class ceiling {
    // no which is greater than or equal to target
    static int ceilingOfNumber(int [] arr, int target){

        Arrays.sort(arr);
        int start=0;
        int end=arr.length-1;
        while (start <= end) {
            int mid=start + (end-start)/2;
            if (arr[mid] < target) {
                start= mid +1;
            }else  if (arr[mid] > target) {
                end=mid-1;
            }else{
                return mid;
            }
        }return start;
    }
    // no which is smaller than or equal to target
    static int  floorOfNumber(int [] arr, int target){
        Arrays.sort(arr);
        int start=0;
        int end=arr.length-1;
        while (start <= end) {
            int mid=start + (end-start)/2;
            if (arr[mid] < target) {
                start= mid +1;
            }else  if (arr[mid] > target) {
                end=mid-1;
            }else{
                return mid;
            }
        }return end ;
    }

    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
       System.out.print("Enter the target element: ");
       int target=r.nextInt();
        int[] arr=new int[5];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=r.nextInt();
        }
        int r1=ceilingOfNumber(arr, target);
        int r2=floorOfNumber(arr, target);
        System.out.println("Ceil of the target is at index "+r1);
        System.out.println("Floor of targe is at index "+r2);
    }
}