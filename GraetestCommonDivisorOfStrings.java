import com.sun.source.tree.ReturnTree;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GraetestCommonDivisorOfStrings {

    public static void main(String[] args) {
        System.out.println(gcdOfStrings("ababab", "ab"));
    }

    public static String gcdOfStrings(String str1, String str2){

       if(str2.length()>str1.length())return gcdOfStrings(str2, str1);

       if(str2.equals(str1))return str1;

       if(str1.startsWith(str2))return gcdOfStrings(str1.substring(str2.length()), str2);

       return "";
    }

}
