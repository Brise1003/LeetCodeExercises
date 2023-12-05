import java.util.Arrays;

public class CanPlaceFlowers {

    public static void main(String[] args) {
        int [] flowerbed = { 0,0,0,0,1};
        int n = 2;

        System.out.println(canPlaceFlowers(flowerbed, n));
    }

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int flowers = 0;

        for(int i = 0;i<flowerbed.length; i++){
           if(flowerbed[i] == 0){
               int prev=(i==0 || flowerbed[i-1]==0)?0:1;
               int next=(i==flowerbed.length-1 || flowerbed[i+1]==0)?0:1;

               if (prev==0 && next==0){
                   flowerbed[i] = 1;
                   flowers++;
               }
           }
        }

        return flowers>=n;
    }
}
