public class Simp extends A {
    void Disp(){
        roll=1; name="ankit";marks=89;
        System.out.println(roll+" "+name+" "+marks+" ");
    }
    public static void main(String[] args) {
        Simp r=new Simp();
        r.Disp();
    }
}
class A{
    int roll,marks;
    String name;
    void input(){
        System.out.println("Enter roll and marks: ");
    }
}

