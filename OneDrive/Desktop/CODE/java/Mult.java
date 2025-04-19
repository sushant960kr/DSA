public class Mult implements A,B {
     public void show(){
        System.out.println("Interface of A ");
    }
    public void disp(){
        System.out.println("Interface of B");
    }
    public static void main(String[] args) {
        Mult r=new Mult();
        r.show();
        r.disp();
    }
}
 
interface A{
    void show();
}
interface B{ 
    void disp();
    
}