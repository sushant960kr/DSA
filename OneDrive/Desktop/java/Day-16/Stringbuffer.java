public class Stringbuffer {
    public static void main(String[] args) {

        //  constructor 1
        StringBuffer sb=new StringBuffer();

        //  constructor 2
        StringBuffer sb2=new StringBuffer("kunal");

        //  constructor 3
        StringBuffer sb3=new StringBuffer(30);

        sb.append("Sushant");
        sb.reverse().toString();

        String str=sb.toString();
        System.out.println(str);
    }
}
