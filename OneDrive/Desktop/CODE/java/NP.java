public class NP {
    public static void main(String[] args) {
        
        String str="Sushant";
        System.out.println("Main Method Started");
        try {
            int a=Integer.parseInt(str);
            System.out.println(a);

            System.out.println("Exception");
        } catch (Exception e) {
            System.out.println(e);
        }

        try {
            int a=10,b=20,c=0;
            c=a+b;
            System.out.println("Sum of the no is "+c);

            System.out.println("Exception");
        } catch (Exception e) {
            System.out.println(e);
        }
        finally
        {
            System.out.println("hello");
        }
        System.out.println("Main Method Ended");
       
        
       
    }
}