public class Hierar extends A{
    void Disp(){
        System.out.println("My name is Ankush");
    }
    public static void main(String[] args) {
        Hierar r=new Hierar();
        B ref =new B();
        r.input();
        ref.show();
        r.Disp();
    }
}
class A {
    void input(){
        System.out.println("Enter your name : ");
    }
}
class B extends A{
    void show(){
        System.out.println("My name is Ankit");
    }

}
