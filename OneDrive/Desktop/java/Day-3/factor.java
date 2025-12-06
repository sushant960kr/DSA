import java.util.Scanner;

public class factor {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        System.out.print("Enter any number: ");
        int num=r.nextInt();
        System.out.println("Factor of the given number is ");
        for (int i = 1; i <= num; i++) {
            if (num % i ==0) {
                System.out.print(i+" ");
            }
        }
    }

}
