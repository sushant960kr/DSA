public class Nt2 {
    public static void main(String[] args) {
        try {
            String a="Ankit";
            System.out.println(a.toUpperCase());
        } catch (Exception e) {
            System.out.println(e);
        }
        finally{
            
            try {
                System.out.println(10/0);
            } catch (Exception e) {
                System.out.println(e);
            }
            finally{
                System.out.println("Learn Coding");
            }
        }
    }
}
