public class supr {
    public static void main(String[] args) {
        B r=new B();
        r.show();
    }   
}
class A{
    void show(){
        System.out.println("Hello Sushant");
        
    }
    
}
class B extends A{
    
    void show(){
        super.show();
        System.out.println("Hello");
        
    }
}
