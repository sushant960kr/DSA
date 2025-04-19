public class Instance {
    public static void main(String[] args) {
        A r=new A();
        r.Disp();
        int d=40;
        System.out.println(d);
    }
}
class A{
    int c=20;
    A(){
        System.out.println(c); 
    }
    
    {
        int a=10,b=20;
        System.out.println(a+b); 
    }
    void Disp(){
        int a=10,b=20;
        System.out.println(a+b);
    }
}
