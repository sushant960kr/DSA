import java.io.FileReader;

public class F4 {
    public static void main(String[] args) {
        try {
            FileReader f=new FileReader("c:\\Users\\Sushant\\OneDrive\\Desktop\\oc.txt");
            try{
                int i;
                while((i=f.read())!=-1){
                    System.out.print((char)i);
                }

            }
            finally{
                f.close();
                System.out.println("\nFile closed");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
