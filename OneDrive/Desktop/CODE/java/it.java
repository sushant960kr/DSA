public class it {
    public static void main(String[] args) {
        Raju r = new Raju();
        r.develop();
        r.design(); 
    }
}

interface Client {
    void design();
    void develop();
}

abstract class Raj implements Client { 
    @Override
    public void develop() {
        System.out.println("Green, top Menu, three dot button");
    }
}

class Raju extends Raj {
    @Override
    public void design() {
        System.out.println("Green, top Menu, three dot button");
    }
}
