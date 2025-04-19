public class Multi extends B {
    void division(){
        a=100;b=20;
        c=a/b;
        System.out.println("Division of two numbers is "+c);
    }
    public static void main(String[] args) {
        B r=new B();
        r.add();
        r.Subtract();
        r.Multiply();
        Multi ref=new Multi();
        ref.division();
    }
}
class A
{
    int a,b,c;
    void add(){
        a=10;b=20;
        c=a+b;
        System.out.println("Sum of two numbers is "+c);
    }
    void Subtract(){
        a=100;b=50;
        c=a-b;
        System.out.println("Subtraction of two numbers is "+c);
    }

}
class B extends A
{
    void Multiply(){
        a=10;b=20;
        c=a*b;
        System.out.println("Multiplication of two numbers is "+c);
    }

}
