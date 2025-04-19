public class Overriding {
    
    public static void main(String[] args) {
     A r=new B();   
     r.draw();
    }
    
}
class A  {
   
    void draw(){ // override
        System.out.println("Square is the shape");
    }
}
class B extends A{
    void draw(){
        System.out.println("Not Mention the shape");
    }
}