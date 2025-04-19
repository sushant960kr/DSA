import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        int size,i;
        Scanner r=new Scanner(System.in);
        System.out.print("Enter size of array:");
        size=r.nextInt();
        int a[]=new int[size];
        for(i=0;i<size;i++){
            a[i]=r.nextInt();
            
        }System.out.print("Elements are ");
        for(i=0;i<size;i++)
        {
            System.out.print(a[i]+ " ");
        }
    }
}
