public class I3 {
    public static void main(String[] args) {
        B r=new B();
        A.call();
        r.sub(13,5);
    }
}
interface A{
    private static void add(int x, int y){
        System.out.println("Sum of two number "+(x+y));
    }
    public static void call(){
        add(10, 20);
    }
}
class B implements A{
    public void sub(int x, int y){
        System.out.println("Subtraction of two number "+(x-y));
    }
}