//  skip the character
public class skip {
    public static void main(String[] args) {
        String str="baccad";
        // System.out.println("Skip character "+skipCharacter(str));

        character("baaccaaddeeaa", "");


    }
    static String skipCharacter(String str){
        StringBuilder st=new StringBuilder();
        
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != 'a') {
                st.append(str.charAt(i));
            }
        }
        return st.toString();
    }
    
    //  by recursion
    static void character(String str1, String p){
        if(str1.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=str1.charAt(0);

        if (ch=='a') {
            character(str1.substring(1), p);
        }else{
            character( str1.substring(1),  p+ch);
        }
    }

    
}
