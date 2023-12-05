import java.util.ArrayList;
import java.util.Arrays;

public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        String s = "ac";

        System.out.println(longestPalindrome(s));
    }

    public static String longestPalindrome(String s) {
        if(s == null || s.length() < 1)return "";

        int start = 0;
        int end = 0;

        for (int i=0; i<s.length(); i++){
            int len1 = expandFromMiddle(s, i, i);
            System.out.println(len1);
            int len2 = expandFromMiddle(s, i, i+1);
            System.out.println(len2);
            int len = Math.max(len1, len2);
            if(len > end - start){
                start = i - ((len-1) / 2);
                end = i + (len / 2);
            }
        }
        return s.substring(start, end + 1);
    }

    public static int expandFromMiddle( String s, int left, int right){
        if(s == null || left > right) return 0;

        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
        }
        return right - left -1;
    }

    public static boolean isPalindrome(String s){
        String rvsString = "";
        s = String.format(s).toLowerCase().replace(" ","");

        for (int i = s.length()-1; i>=0; i--){
            rvsString += s.charAt(i);
        }

        if(rvsString.equals(s)){
            return true;
        }else {
            return false;
        }

    }
}
