import java.io.File;

public class F2 {
    public static void main(String[] args) {
        File f=new File("c:\\Users\\Sushant\\OneDrive\\Desktop\\lc.txt");
        if (f.exists()) {
            System.out.println("File Name: "+f.getName());
            System.out.println("File Name: "+f.getAbsolutePath());
            System.out.println("File Writable: "+f.canWrite());
            System.out.println("File Readable: "+f.canRead());
            System.out.println("File size: "+f.length());
           
        } else {
            System.out.println("Not Exists");
        }
    }
}
