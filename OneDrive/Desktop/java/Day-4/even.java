import java.util.Scanner;

public class even {
    static void isEven(int  a){
        if (a%2==0) {
            System.out.println("Even number");
        }
        else{
            System.out.println("Odd number");
        }
    }
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        System.out.print("Enter any number: ");
        int a=r.nextInt();
        isEven(a);
       
        
    }
}
