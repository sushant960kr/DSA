import java.util.Arrays;
import java.util.Scanner;

public class cyclic {
    static void cyclicSort(int[] arr){
        int i=0;
        
        while (i < arr.length) {
            int correctindex=arr[i]-1;
            if (arr[correctindex] != arr[i]) {
                int temp=arr[i];
                arr[i]=arr[correctindex];
                arr[correctindex]=temp;
            }else{
                i++;
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
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
