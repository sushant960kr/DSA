import java.util.Scanner;

public class prefix {
    static void prefixSum(int[] arr){
        int[] pre=new int[arr.length];
        pre[0]=arr[0];
        for (int i = 1; i < arr.length; i++) {
            
                pre[i]=arr[i]+pre[i-1]; 
        }
        System.out.println("Prefix sum is ");
        for (int i = 0; i < pre.length; i++) {
            System.out.print(pre[i]+",");
        }
    }
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        int[] arr=new int[5];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=r.nextInt();
        }
        prefixSum(arr);
    }
    
}