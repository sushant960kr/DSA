public class abst {
    public static void main(String[] args) {
        Dog r=new Dog();
        r.sound();
        lion ref=new lion();
        ref.sound();
    }
}
class Dog extends animal{
    public void sound(){
        System.out.println("Dog is barking");
    }
}
class lion extends animal{
    public void sound(){
        System.out.println("Lion is Roar");
    }
}
abstract class animal{
    animal(){
        System.out.println("All Animals....");
    }
    public abstract void sound();

}
