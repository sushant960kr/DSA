import java.util.Scanner;

public class Descending {
    public static void main(String[] args) {
        int temp, a[]=new int[5];
        Scanner r=new Scanner(System.in);
        System.out.print("Enter the elements: ");
        for(int i=0;i<5;i++)
        {
            a[i]=r.nextInt();
        }
        for(int i=0;i<5;i++)
        {
            for(int j=i+1;j<5;j++)
            {
                if (a[i]<a[j]) {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }

            }
        }
        System.out.print("Sorted array in desscending order: ");
        for(int i=0;i<5;i++)
        {
            System.out.print(a[i]+ " ");
        }
    }
}
