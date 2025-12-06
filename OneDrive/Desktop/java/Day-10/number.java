import java.util.Scanner;

public class number {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=r.nextInt();
        
        System.out.println("Numbers are increasing order");
        printIncreasing(n);
        System.out.println();
        System.out.println("Numbers are decreasing order");
        printDecreasing(n);

    }
    static void printIncreasing(int n){
        if ( n==1) {
            System.out.print(1+" ");
            return  ;
        }
        printIncreasing(n-1);
        System.out.print(n+" ");
    
    }

    static void printDecreasing(int n){
        if ( n==1) {
            System.out.print(1+" ");
            return  ;
        }
        System.out.print(n+" ");
        printDecreasing(n-1);
        
    }
}
