public class Nt1 {
    public static void main(String[] args) {
        try {
            System.out.println(10/0);
        } catch (Exception e) {
            System.out.println(e);
            try {
                String a=null;
                System.out.println((a.toUpperCase()));
            } catch (Exception c) {
                System.out.println(c);
            }
        }System.out.println("Hello");
    }
}