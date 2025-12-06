import java.util.Scanner;

public class discount {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        System.out.print("Enter the cost of product: ");
        int cost=r.nextInt();
        int ds=0;
        if (cost > 10000) {
            ds=cost-1000;
            System.out.println(ds);
        }
        else if (cost <10000) {
            ds =cost+1000;
            System.out.println(ds);
        }
    }
}
