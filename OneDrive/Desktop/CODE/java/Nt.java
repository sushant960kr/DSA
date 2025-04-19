public class Nt {

    public static void main(String[] args) {
        try {
            try {
                int a[]={10,20,30};
                System.out.println(a[2]);
                
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e);
            }
            System.out.println(10/0);
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
    }
}