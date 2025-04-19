import java.util.Scanner;

    

public class Final {
    final void sum(){
        int a=10,b=20;
        System.out.println(a+b);
    }
    public static void main(String[] args) {
        final int A=10;
        int a;
        Scanner r=new Scanner(System.in);
        System.out.println("Enter the value of A ");
        a=r.nextInt();
        System.out.println("a is "+a);
        System.out.println("A is "+A);
        Final ref=new Final();
        ref.sum();
    }
    
}
