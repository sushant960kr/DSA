public class E implements B {
    @Override
    public void add(){
        int a=10,b=20,c=0;
        c=a+b;
        System.out.println("Addition is "+c);
    }
    @Override
    public void sub(){
        int a=100,b=20,c=0;
        c=a-b;
        System.out.println("Subtraction is "+c);
    }
    public static void main(String[] args) {
        B  r=new E();
        r.add();
        r.sub();
    }
}
interface A{
    void sub();
}
interface B extends A{
    void add();
}
