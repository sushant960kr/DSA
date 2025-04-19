public class Const {
    public static void main(String[] args) {
        A r=new A();
        A r1=new A(0);
        A r2=new A("test");

    }
}
class A{
    int a=10,b=20,d=30;
    A(){
        System.out.println(a+" "+b);
    }
    A(int c){
        c=a+b;
        System.out.println(c);
    }
    A(String z){
        z = "Sushant";
        System.out.println(d+" \n"+z);
    }
}
