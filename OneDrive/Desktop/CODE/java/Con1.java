import java.io.Console;
public class Con1 {
    public static void main(String[] args) {
        Console obj=System.console();
        System.out.print("Enter Username: ");
        String str=obj.readLine();

        System.out.print("Enter Password: ");
        char[] ch = obj.readPassword();
        //String a=String.valueOf(ch); // to see password

        System.out.println("Username is "+str);
        System.out.println("Password is  "+a);
    }
}
