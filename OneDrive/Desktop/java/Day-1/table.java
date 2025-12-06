import java.util.Scanner;

public class table {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        System.out.print("Enter any number: ");
        int num = r.nextInt();
        System.out.println("Table  of the number is ");
        for(int i=1 ; i<=10;i++){
            System.out.println(num +"*"+i+"="+num*i);
        }

    }
}
