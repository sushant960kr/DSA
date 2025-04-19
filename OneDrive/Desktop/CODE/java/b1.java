class Co {
    int a; String name;
    /*Co(){
        a=0; name =null;
    }*/
    void show(){
        System.out.println(a+" "+name);
    }
}
public class b1 {
    public static void main(String[] args) {
        Co ref=new Co();
        ref.show();
    }
    
}
