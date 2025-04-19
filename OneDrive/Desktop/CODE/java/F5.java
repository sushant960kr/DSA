import java.io.File;

public class F5 {
    public static void main(String[] args) {
        File f=new File("c:\\Users\\Sushant\\OneDrive\\Desktop\\S.txt");
        File r=new File("c:\\Users\\Sushant\\OneDrive\\Desktop\\Ss.txt");
        if (f.exists()) {
            System.out.println(f.renameTo(r));
            System.out.println("Successfully Renamed");
        } else {
            System.out.println("File not found");
        }
    }
}
