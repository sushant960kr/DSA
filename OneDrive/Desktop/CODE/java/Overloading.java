public class Overloading {
    void add(){
        int a=10,b=20,c=0;
        c=a+b;System.out.println(c);
    }
    void add(int x,int y){
        int c=0;
        c=x+y;
        System.out.println(c);
    }
    public static void main(String[] args) {
        Overloading r=new Overloading();
        r.add();
        r.add(15, 20);
        
    }
}
