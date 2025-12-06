import java.util.Scanner;

public class occurance {
    static void printOccurence(int[] arr, int x){
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==x) {
                count++;
            }
        }
        System.out.println("X is appers in this arrays is "+count+" times");
    }
    public static void main(String[] args) {
        // Scanner r=new Scanner(System.in);
        
        Scanner r=new Scanner(System.in);
        int[] arr=new int[5];
        int x=5;
        // System.out.print("Enter the search element: ");
        System.out.println("Enter the elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=r.nextInt();
        }
        printOccurence(arr, 5);
    }
}
