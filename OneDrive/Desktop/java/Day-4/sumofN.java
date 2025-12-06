import java.util.Scanner;

public class sumofN {
    static void sumof(int num){
        int sum=0;
        for (int i = 1; i <=num; i++) {
            sum +=i;
        }
        System.out.println("Sum of N natural number is "+sum);
    }
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        System.out.print("Enter any number: ");
        int num=r.nextInt();
        sumof(num);
    }
}
