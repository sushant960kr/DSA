import java.util.Scanner;

public class Delete {
    public static void main(String[] args) {
        int loc ,size;
        Scanner r=new Scanner(System.in);

        
        System.out.print("Enter the size of array: ");
        size=r.nextInt();

        if (size <= 0) {
            System.out.println("Invalid array size!");
            return;
        }

        int a[]=new int[size];
         System.out.print("Enter the elements: ");
        for(int i=0;i<a.length;i++)
        {
            a[i]=r.nextInt();
        }

        System.out.print("Enter the location: ");
        loc=r.nextInt();

        if (loc < 0 || loc >= size) {
            System.out.println("Invalid index! Must be between 0 and " + (size - 1));
            return;
        }

        for(int i=loc;i<(size-1);i++)
        {
            a[i]=a[i+1];
        }
        size--;

        System.out.print("Array after deletion: ");
        for(int i=0;i<size-1;i++)
        {
            System.out.print(a[i]+" ");
        }

    }
}
