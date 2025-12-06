// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to the target.
import java.util.Scanner;

public class twosum {
    static void twoSum(int[] arr,int target){
        System.out.println("Two sum pairs checking :  ");
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println("Indices: " + i + " and " + j);
                    System.out.println("Elements: " + arr[i] + " + " + arr[j] + " = " + target);
                    System.out.println();
                    found = true;
                }
            }
        }
        if (!found) {
            System.out.println("No pairs found.");
        }
    }
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        System.out.print("Enter the target element: ");
        int target=r.nextInt();
        int[] arr=new int[5];
        System.out.println("Enter the elements of array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=r.nextInt();
        }
        twoSum(arr, target);
    }
}
