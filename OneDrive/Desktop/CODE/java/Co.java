public class Co {
    public static void main(String[] args) {
        B r=new B();
        r.show();
    }
}
class A{
    A show(){
        System.out.println("Learn Coding");
        return this;
    }
}
class B extends A{
    @Override
    B show(){
        System.out.println("Please like");
        return this;
    }
}
