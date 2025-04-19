import java.util.Scanner;

public class insert {
    public static void main(String[] args) {
        int size,loc,item,i;
        Scanner r=new Scanner(System.in);
        System.out.print("Enter Array size: ");
        size=r.nextInt();

        int a[]=new int[size+1];
        System.out.print("Enter the elements: ");
        for(i=0;i<size;i++)
        {
            a[i]=r.nextInt();
        }
        System.out.print("Enter Array location: ");
        loc=r.nextInt();
        System.out.print("Enter new elements: ");
        item=r.nextInt();
        for(i=size;i>loc;i--)
        {
            a[i]=a[i-1];

        }
        a[loc]=item;
        size++;
        System.out.print("Array after insertion is ");
        for(i=0;i<size;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
