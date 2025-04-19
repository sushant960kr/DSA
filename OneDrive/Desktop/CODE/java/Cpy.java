public class Cpy {
    public static void main(String[] args) {
       A r=new A();
       A r1=new A(r);
    }
}
class A{
    int a; String b;
    A(){
        a=10; b="Learncoding";
        System.out.println(a+" "+b);
    }
    A(A ref){
        a=ref.a;
        b=ref.b;
        System.out.println(a+" "+b);
    }
}

