public class ts {
    int a;
    ts(int a){
       this.a=a;

    }
    void show(){
        System.out.println(a);
    }
    public static void main(String[] args) {
        ts r=new ts(100);
        System.out.println(r);
        r.show();
    }
}
