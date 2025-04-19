import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        int a,b,ch;
        Scanner r=new Scanner(System.in);

        System.out.print("Enter the value of a :");
        a=r.nextInt();
        System.out.print("Enter the value of b :");
        b=r.nextInt();
        System.out.print("Enter your choice...");
        ch=r.nextInt();
        switch (ch) {
            case 1:System.out.println("Sum" + (a+b));
                break;
            
            case 2:System.out.println("Division" + (a/b));
                break;
            case 3 :System.out.println("multiply" + (a*b));
                break;    
            default:System.out.println("Invalid Choice....");
                break;
        }
        

    }
}
