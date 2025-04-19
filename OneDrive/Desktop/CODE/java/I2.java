public class I2 {
    public static void main(String[] args) {
        A.show();
        B r=new B();
        r.a1();
        r.a2();
        
    }
}
interface A{
    void a1();

    void a2();
    public static void show(){
        System.out.println("cannot override interface");
    }
}
class B implements A{
    public void a1(){
        System.err.println("a1");
    }
    public void a2(){
        System.err.println("a2");
    }
}
