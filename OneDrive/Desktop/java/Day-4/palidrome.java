import java.util.Scanner;

public class palidrome {
    static void sumofDigit(int num){
        int original=num;
        int rev=0;
        while (num>0) {
            int digit=num%10;
            rev=rev*10+digit;
            num /=10;
        }
        if (original== rev) {
            System.out.println("Number is palidrome "+original);
        }else{
            System.out.println("Number is not palidrome "+original);
        }
        
    }
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        System.out.print("Enter any number: ");
        int num=r.nextInt();

        sumofDigit(num);
        

        
    }
}
