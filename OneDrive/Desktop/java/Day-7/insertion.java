import java.util.Arrays;
import java.util.Scanner;

public class insertion {
    static void swap(int[] arr, int first, int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
        }
    static void insertionSort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j > 0; j--) {
                if (arr[j] < arr[j-1]) {
                    swap(arr,j, j-1);
                }else{
                    break;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        int[] arr=new int[4];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=r.nextInt();
        }
        insertionSort(arr);
        System.out.println("After Insertion sort "+Arrays.toString(arr));
    }
}
