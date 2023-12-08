public class MaximunAverageSubarray_SlidingWindow {

    public static void main(String[] args) {
        int[] nums = {-2,-1,-4,-6};
        int k = 2;

        System.out.println(findMaxAverage(nums, k));
    }

    public static double findMaxAverage(int[] nums, int k) {
        double mav = 0;
        double mean = 0;

        for (int i=0; i<k;i++)
            mean += nums[i];

        mav=mean;
        for (int i=k;i<nums.length;i++){
            mean += nums[i]-nums[i-k];
            mav = Math.max(mean, mav);
        }
        mav/=k;

        return mav;
    }
}
