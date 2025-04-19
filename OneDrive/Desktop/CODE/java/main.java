import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        R r=new R();
        r.input();
        r.output();

    }
}
interface client{
    void input();
    void output();
}
class R implements client
{
    String name;
    double sal;
    @Override
    public void input(){
       Scanner r=new Scanner(System.in) ;
       System.out.println("Enter Username:");
       name=r.nextLine();
       System.out.println("Enter Salary:");
       sal=r.nextDouble();
    }
    @Override
    public void output()
    {
        System.out.println(name);
        System.out.println(sal);
    }
}
