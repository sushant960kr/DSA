public class WZ {

    public static void main(String[] args) {
        B r=new B();
        r.show();
    }
}
class A{
    
    void show(){
        System.out.println("Super class");
    }
}
class B extends A{
    @Override
    void show(){
        System.out.println("Sub class");
    }
}