public class Encap {
    
    public static void main(String[] args) {
      A r=new A();
      r.setValue(100); 
      System.out.println(r.getValue()); 
    }
}
class A{
    private int Value;   //data hiding
    public void setValue(int x){  //data abstraction
        Value=x;
    }
    public int getValue(){
        return Value;
    }
}
