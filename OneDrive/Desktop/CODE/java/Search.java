import java.util.Scanner;

public class Search {
    public static void main(String[] args) {
        int b,count=0,a[]=new int[5];
        Scanner r=new Scanner(System.in);
        System.out.print("Enter the elements: ");
        for(int i=0;i<5;i++)
        {
            a[i]=r.nextInt();
        }
        System.out.print("Elements are ");
        for(int i=0;i<5;i++)
        {
            System.out.print(a[i]+ " ");
        }
        System.out.print("\nEnter Search elements: ");
        b=r.nextInt();
        for(int i=0;i<5;i++)
        {
            if (a[i]==b) {
                count++;
            }
        }
        if (count>0) {
            System.out.println("Item found");
        }
        else{
            System.out.println("Item not found");
        }
    }
}
