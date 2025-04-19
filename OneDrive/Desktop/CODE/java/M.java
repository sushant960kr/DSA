public class M {
    public static void main(String[] args) {
        H r=new H();
        r.Developer();
        Java ref=new Java();
        ref.Developer();
    }
}
abstract class Programming{
    public abstract void Developer();
}
class H extends Programming{
    @Override
    public void Developer()
    {
        System.out.println("Tim Berners Lee");
    }
}
class Java extends Programming{
    @Override
    public void Developer()
    {
        System.out.println("James Gosling");
    }
}