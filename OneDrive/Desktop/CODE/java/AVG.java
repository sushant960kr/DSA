import java.util.Scanner;

public class AVG {
    public static void main(String[] args) {
        int a,b,c,d,e,sum;
        Scanner r=new Scanner(System.in);
        System.out.println("Enter the marks of five subjects : ");
        a=r.nextInt();
        b=r.nextInt();
        c=r.nextInt();
        d=r.nextInt();
        e=r.nextInt();
        sum=(a+b+c+d+e);
        System.out.println("Total Marks: " +sum);
        double average=sum/5.0;
        System.out.println("The average of five marks is: " + average);
    }
}
