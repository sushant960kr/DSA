public class Thrd {
    public static void main(String[] args) {
        A r=new A();
        Thread t=new Thread(r);
        t.start();
        for (int i = 0; i < 5; i++) {
            System.out.println("Main Thread");
            
        }
    }
}
class A implements Runnable{
    public void run(){
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Sushant Kumar");
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
