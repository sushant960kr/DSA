//  Input: "aaabbcccdd"
//  Output: "a3b2c3d2"

import java.util.Scanner;

public class compression {
    static String compressionOfString(String str){
        String newStr="";
        for (int i = 0; i < str.length(); i++) {
            Integer count=1;
            while (i < str.length()-1 && str.charAt(i)==str.charAt(i+1)) {
                count++;
                i++;
            }newStr +=str.charAt(i);
            if (count > 1) {
                newStr += count.toString();
            }

        }
        return newStr;
    }
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str=r.nextLine();
        System.out.println("Compress String is : "+compressionOfString(str));
    }
}
