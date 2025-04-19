import java.io.*;
public class F1 {
    public static void main(String[] args) {
        File file=new File("c:\\Users\\Sushant\\OneDrive\\Desktop\\lc.txt");
        try{
            if (file.createNewFile()) {
                System.out.println("file created");
            } else {
                System.out.println("Already available");
            }
        }
        catch(IOException e){
            System.out.println("Exception handled");
        }
    }
}
