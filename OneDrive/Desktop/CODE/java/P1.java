
public class P1 {
    public static void main(String[] args) {
        A t = new A(); 
        t.start(); 
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

class A extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Sushant");
        }
    }
}
