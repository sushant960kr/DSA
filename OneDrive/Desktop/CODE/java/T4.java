public class T4 {
    public static void Wait() throws InterruptedException{
        for(int i=1;i<=10;i++){
            System.out.println(i);
            Thread.sleep(1000);
        }
    }
    public static void main(String[] args) {
        try {
            Wait();
            System.out.println(10/0);
        } catch (Exception e) {
            System.out.println("Exception handled");
        }
        System.out.println("main method ended");
    }
}
