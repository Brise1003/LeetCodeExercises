import java.lang.module.FindException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MedianOfTwoSortedArrays {
    public static void main(String[] args) {
        int nums1[] = { 0, 3, 4, 6, 7};
        int nums2[] = { 2, 6, 7, 9};

        int mediannumbers [] = {0, 2, 3, 4, 6, 6, 7, 7, 9};

        System.out.println(findMedianSortedArrays(nums1, nums2));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2){
        ArrayList<Integer> resultList = new ArrayList<Integer>(nums1.length + nums2.length);
        double median = 0;
        int index = 0;

        for(int i = 0; i<nums1.length;i++){
            resultList.add(i,nums1[i]);
        }
        for(int i = 0; i<nums2.length;i++){
            resultList.add(i,nums2[i]);
        }
        Collections.sort(resultList);

        if(resultList.size()%2 == 0){
            index = resultList.size()/2;
            median = (double) (resultList.get(index-1)+resultList.get(index))/2;
        }else {
            index = resultList.size()/2;
            median = (double) resultList.get(index);
        }

        return median;
    }
}
