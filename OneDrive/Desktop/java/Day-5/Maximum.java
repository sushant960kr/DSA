import java.util.Scanner;

public class Maximum {
    static void maxElement(int[] arr){
        int max=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= max) {
                max=arr[i];
            }
        }
        System.out.println("Maximum Element is "+max);
    }
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        int[] arr=new int[5];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=r.nextInt();
        }
        maxElement(arr);
    }
}
