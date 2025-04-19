import java.util.Scanner;

public class Tax {
    public static void main(String[] args) {
       int salary;
       double tax;
       Scanner r=new Scanner(System.in);
       System.out.println("Enter your salary:");
       salary=r.nextInt();
        if (salary<10000) {
            System.out.println(salary + "No tax");
        }
        else if (salary>10000 && salary<=100000) {
            tax=salary*0.10;
            System.out.println(salary+ " " + tax);
        }
        else {
            tax=salary*0.20;
            System.out.println(salary+ " " + tax);
        }
    }
}
