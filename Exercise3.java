import java.security.spec.RSAOtherPrimeInfo;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Exercise3 {
    public static void main(String[] args) {
        String s = "franciscofrancisco";
        //System.out.println(s.indexOf("c",5));
        System.out.println(lengthOfLongestSubstring(s));

    }

    public static int lengthOfLongestSubstring(String s) {
        int result = 0;
        int i = 0;
        char carry;
        int lr =0;
        ArrayList<Character> cdn = new ArrayList<Character>();

        while (i < s.length()) {
            if (!cdn.contains(s.charAt(i))) {
                cdn.add(s.charAt(i));
                result=Math.max(cdn.size(), result);
            } else {
                carry = s.charAt(i);
                i = s.indexOf(carry, lr);
                lr=i+1;
                cdn.clear();
            }
            i++;
        }
        return result;
    }
}
