import java.util.Scanner;

public class salary {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        System.out.println("Enter your salary: ");
        int salary =r.nextInt();
        if (salary > 10000) {
            int ns= salary+1000;
            System.out.println("Salary is "+ns);
        } else {
            int es= salary+2000;
            System.out.println("Salary is "+es);
        }
    }
}
