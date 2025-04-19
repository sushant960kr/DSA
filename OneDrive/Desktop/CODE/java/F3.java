import java.io.File;
import java.io.FileWriter;

public class F3 {
    public static void main(String[] args) {
        
        

        try {
            FileWriter f=new FileWriter("c:\\Users\\Sushant\\OneDrive\\Desktop\\oc.txt");
            try{
                f.write("Java Programming is the best language");
            }
            finally{
                f.close();
            }System.out.println("Successfully wrote data in file");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
