public class string {
    public static void main(String[] args) {
        System.out.println(skip("bacedfeapplebrbfbapple"));

        System.out.println(skipApp("bapplecd"));
    }
    static String skip(String str1){
        if(str1.isEmpty()){
            return "";
        }
        char ch=str1.charAt(0);
        if (str1.startsWith("apple")) {
            return skip(str1.substring(5));
        }
        else{
            return str1.charAt(0) + skip(str1.substring(1));

        }
    }

    static String skipApp(String str1){
        if(str1.isEmpty()){
            return "";
        }
        char ch=str1.charAt(0);
        if (str1.startsWith("app")) {
            return skipApp(str1.substring(3));
        }
        else{
            return str1.charAt(0) + skipApp(str1.substring(1));

        }
    }
}
