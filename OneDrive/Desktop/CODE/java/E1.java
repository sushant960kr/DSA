public class E1 {
    public static void main(String[] args) {
        try {
            int a=10;
            System.out.println(a);
            int [] c= new int[5];
            System.out.println(c[4]);

            String b="null";
            System.out.println(b.toUpperCase());
        } 
        catch(ArrayIndexOutOfBoundsException b){
            System.out.println(b);
        }
        catch (ArithmeticException e) {
            System.out.println(e);
        }
        
        catch(StringIndexOutOfBoundsException a){
            System.out.println(a);
        }
        catch(Exception x){
            System.out.println("all type exception handled");
        }
    }
}
