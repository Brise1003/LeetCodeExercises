import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GraetestNumberOfCandies {

    public static void main(String[] args) {
        int[] candies={2,3,5,1,3};
        System.out.println(kidsWithCandies(candies, 3));
    }

    public static List<Boolean> kidsWithCandies(int [] candies, int extraCandies){
        List<Boolean> result = new ArrayList<Boolean>(candies.length);
        for (int i=0;i<candies.length;i++){
            int maxTemporal=0;
            for (int j=0;j<candies.length;j++){
                if (candies[i]+extraCandies>=candies[j]){
                    maxTemporal++;
                }
            }

            if(maxTemporal==candies.length){
                result.add(true);
            }else {result.add(false);}
        }
        return result;
    }
}
