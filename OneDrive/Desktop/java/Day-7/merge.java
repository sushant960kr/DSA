import java.util.Arrays;
import java.util.Scanner;

public class merge {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        int[] arr=new int[5];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i]= r.nextInt();
        }
        System.out.println(Arrays.toString(mergesort(arr)));

    }

    static int[] mergesort(int[] arr){
        if (arr.length==1) {
            return arr;
        }
        int mid = arr.length/2;
        int[] left=mergesort(Arrays.copyOfRange(arr, 0,mid));
        int[] right=mergesort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left,right);
    }
    private static int[] merge(int[] first, int[] second){
        int[]  mix = new int[first.length+ second.length];

        int i=0;
        int j=0;
        int k=0;

        while (i < first.length && j < second.length) {
            if (first[i] < second[j]) {
                mix[k] =first[i];
                i++;
            }
            else{
                mix[k]= second[j];
                j++;
            }k++;
        }
        //  may be one of array is not complete
        // copy the remaining elements
        while (i < first.length) {
            mix[k]=first[i];
            i++;
            k++;
        }
        while (j < second.length) {
            mix[k]=second[j];
            j++;
            k++;
        }
        return mix;
    }
}

