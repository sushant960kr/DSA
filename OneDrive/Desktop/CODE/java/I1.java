public class I1 {
    public static void main(String[] args) {
        B r=new B();
        r.a1();
        r.a2();
        r.a3();
        A.a4();
        
    }
}
interface A{
    void a1();
    void a2();
     default void a3(){
        System.out.println("a3");
    }
    public static void a4(){
        System.out.println("hi");
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
