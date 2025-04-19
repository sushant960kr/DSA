public class Stati {
    public static void main(String[] args) {
       A r=new A(); 
       r.Disp();
    }
    
}
class A{
    int x,y;
    {
        System.out.println("Hello Sushant");  //Instance block
    }
    static{
        System.out.println("Learn coding"); //Static block
    }
    void Disp(){
        x=10;
        y=20;
        System.out.println("Sum is "+(x+y));
    }

}