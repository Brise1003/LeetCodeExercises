import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ExamenOracle {

    public static void main(String[] args) {
//        int n=100;
//        fizzBuzz(n);
//        String s = "011001";
//        System.out.println(getSubstringCount(s));

        List<Integer> x = new ArrayList<>();
        x.add(0);
        x.add(2);

        List<Integer> y = new ArrayList<>();
        y.add(0);
        y.add(4);

        System.out.println(minArea2(x,y,2));
        //System.out.println(minArea(x,y,2));
    }

    public static long minArea2(List<Integer> x, List<Integer> y, int k){
        List<Integer> X = new ArrayList<>();
        List<Integer> Y = new ArrayList<>();

        for (int i=0; i<k; i++){
            X.add(x.get(i));
            Y.add(y.get(i));
        }

       int dx = Collections.max(X)-Collections.min(X)+2;
       int dy = Collections.max(Y)-Collections.min(Y)+2;

        Long result = (long) Math.max(dx, dy);
        return result*result;

    }

    public static long minArea(List<Integer> x, List<Integer> y, int k){
        int X[] = {0, 0};
        int Y[] = new int [2];
        Long result = 0L;

        for (int i = 0; i<k; i++){
            if(X[0]>=x.get(i)){
                X[0]=x.get(i)-1;
            }
            if(X[1] <= x.get(i)){
                X[1]=x.get(i)+1;
            }
            if(Y[0]>=y.get(i)){
                Y[0]=y.get(i)-1;
            }
            if(Y[1] <= y.get(i)){
                Y[1]=y.get(i)+1;
            }
        }

        result = (long) Math.max(X[1]-X[0], Y[1]-Y[0]);
        System.out.println(Arrays.toString(X) + Arrays.toString(Y));
        return result*result;
    }


    public static int getSubstringCount(String s) {
        int result = 0;
        int cnt [] = new int [2];

        for(int i =0; i<s.length();i++){
            int num = s.charAt(i) - '0';
            if( i == 0 ||s.charAt(i)!=s.charAt(i-1))
                cnt[num] = 0;
            cnt[num]++;
            if (cnt[num] <= cnt[1-num])
                ++result;
        }

        return result;
    }

    public static void fizzBuzz(int n) {
        int i;

        for( i=1; i<=n; i++){
            if(i%3==0 && i%5 == 0){
                System.out.println(i + "FizzBuzz");
            }else if(i%3 == 0){
                System.out.println(i + "Fizz");
            }else if(i%5 == 0){
                System.out.println(i + "Buzz");
            }else{
                System.out.println(i);
            }
        }
    }

    public static int countBinarySubstrings(String s){
        int count = 0, i = 1, prev = 0, curr = 1;

        while(i<s.length()){
            if(s.charAt(i-1) != s.charAt(i)){
                count += Math.min(prev, curr);
                prev = curr;
                curr = 1;
            } else {
                curr++;
            }
            System.out.println(i+" "+count+" "+curr+" "+prev);
            i++;
        }
        return count += Math.min(prev, curr);
    }
}
