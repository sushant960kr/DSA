import java.util.Scanner;

public class reverse {
    static void reverseArray(int[] arr){
        System.out.println("Reverse array is: ");
        for(int i=4; i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        int[] arr=new int[5];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=r.nextInt();
        }
        reverseArray(arr);
    }
}
