import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class F6 {
    public static void main(String[] args) {
        
        try (FileInputStream r = new FileInputStream("C:\\Users\\Sushant\\OneDrive\\Desktop\\lc.txt");
             FileOutputStream w = new FileOutputStream("C:\\Users\\Sushant\\OneDrive\\Desktop\\ac.txt")) {

            int i;
            while ((i = r.read()) != -1) { 
                w.write(i); 
            }

            System.out.println("Data copied successfully");

        } catch (IOException e) { 
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
