public class Static {
    int a=10;
    static int  b=20;
    public static void main(String[] args) {
        Static r=new Static();
        Static.show();
        r.Disp();
    }
    static void show(){
        System.out.println("Show() "+ b);
    }
    void Disp(){
        System.out.println("Disp() "+a+" "+b);
    }
}
