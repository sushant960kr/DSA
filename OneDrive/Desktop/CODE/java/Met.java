import java.util.Scanner;

public class Met {

    int a,b,c=0;
    Scanner ref=new Scanner(System.in);
    public static void main(String[] args) {
        Met r=new Met();
        r.input();
        r.process();
        r.output();
        
    }
    void input()
    {
        System.out.println("Enter the value: ");
        a=ref.nextInt();
        b=ref.nextInt();

    }
    void process()
    {    
        c=a+b; 
    }
    void output()
    {
        System.out.print("Sum of the number is "+c);
    }
}
