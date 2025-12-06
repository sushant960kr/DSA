import java.util.Arrays;
import java.util.Scanner;

public class selection {
    static void swap(int[] arr, int first, int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
        }

    static void selection(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            // find max item from array
            int last=arr.length-i-1;
            int maxIndex=getMaxIndex(arr, 0, last);
            swap(arr,  maxIndex,last);
        }
    }
    private static int getMaxIndex(int[] arr, int start , int end){
        int max=start;
        for (int i = start; i <= end; i++) {
            if (arr[max] < arr[i]) {
                max=i;
            }
            
        }return max;
    }
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        int[] arr=new int[4];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=r.nextInt();
        }
        selection(arr);
        System.out.println("After Selection sort "+Arrays.toString(arr));
    }
}
