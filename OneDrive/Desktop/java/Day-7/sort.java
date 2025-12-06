import java.util.Arrays;
import java.util.Scanner;

public class sort {
    static void bubbleSort(int[] arr){
        // run steps n-1 times
        for (int i = 0; i < arr.length; i++) {
            //for each pass, max item is at last index
            for (int j = 1; j < arr.length-i; j++) {
                if (arr[j] < arr[j-1]) {
                    // swap
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
        
    }
   
    
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        int[] arr=new int[10];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=r.nextInt();
        }
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
        int n=arr.length;
        System.out.println("Decreasing Order is ");
        for (int i = n-1; i >= 0; i--) {
            System.out.print(arr[i]+",");
        }
    }
}
