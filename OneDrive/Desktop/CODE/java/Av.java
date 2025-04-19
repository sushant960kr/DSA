import java.util.Scanner;

public class Av {
    public static void main(String[] args) {
        double sum=0,average=0;
        int a[]=new int[5];
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
            sum=a[i]+sum;
        }
        System.out.println("/nAddition of elements are "+ sum);
        if (sum>0) {
            average=sum/5;
            System.out.println("Average of the array elements are  "+average);
        }


    }
}
