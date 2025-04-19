import java.util.Scanner;

public class Even {
    public static void main(String[] args) {
        int n;
        System.out.print("Enter the number of range: ");
        Scanner r=new Scanner(System.in);
        n=r.nextInt();

        for(int i=0; i<=n ;i +=2)
        {
            System.out.print(i + " ");
        }
    }
}
