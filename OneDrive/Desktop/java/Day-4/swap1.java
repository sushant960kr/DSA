import java.util.Scanner;

public class swap1 {
    static void swap(int a,int b){
        int temp=0;
        // before swapping
        System.out.println("Before Swapping");
        System.out.print("Value of A is "+a);
        System.out.println();
        System.out.print("Value of B is "+b);
        System.out.println();
        System.out.println("After Swapping ");
        // after swapping
        temp=a;
        a=b;
        b=temp;
        System.out.print("Value of A is "+a);
        System.out.println();
        System.out.print("Value of B is "+b);
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any two number: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        swap(a, b);
    }
}