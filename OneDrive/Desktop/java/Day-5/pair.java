/*It’s basically taking two elements from the array at a time and forming (a, b) pairs.
For example:
Array → {2, 4, 6, 8}
Pairs → (2,4), (2,6), (2,8), (4,6), (4,8), (6,8)
 */

import java.util.Scanner;

public class pair {
    static void printPair(int[] arr, int target){
        System.out.println("Pair element of given array is: ");
        int tp=0; // n(n-1)/2  ; n is elements
        for (int i = 0; i < arr.length; i++) {
            int curr=arr[i];
            for(int j=i+1;j<arr.length;j++){
                System.out.print("("+curr+","+arr[j]+")");
                tp++;
                
            }System.out.println();
        }
        System.out.println("Total Pairs is "+tp);
    }
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        int target=5;
        int[] arr=new int[5];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=r.nextInt();
        }
        printPair(arr,target);
    }
}
