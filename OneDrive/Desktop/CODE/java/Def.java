public class Def {
    public static void main(String[] args) {
        I r=new I();
        r.Disp();
    }
}
class I {
    int a; String b; boolean c;
    I(){
        a=100; b="Ram"; c=true;
    }
    void Disp(){
        System.out.println(a+" "+b+" "+c);
    }
}    