public class tes {
    static int a=20; //static
    void fun(){
        int b=10;
        System.out.println(a+" "+b);
        ++a; ++b;
    }
    
    public static void main(String[] args) {
        tes r=new tes();
        r.fun();
        r.fun();
       

    }
}
