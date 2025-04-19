import java.util.Scanner;

public class Big {
    public static void main(String[] args) {
        int a[]= new int[5];
        Scanner r=new Scanner(System.in);
        System.out.print("Enter the elements: ");
        for(int i=0;i<a.length;i++)
        {
            a[i]=r.nextInt();
        }
        int max=a[0];
        for(int i=1;i<5;i++)
        {
            if (a[i]>max) {
                max=a[i];
            }
        }
        System.out.println("Biggest element in given Array is "+max);
        int min=a[0];
        for(int i=1;i<5;i++)
        {
            if (a[i]<min) {
                min=a[i];
            }
        }

        System.out.println("Smallest element in given Array is "+min);
    }
}
