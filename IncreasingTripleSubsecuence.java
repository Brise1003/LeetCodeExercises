public class IncreasingTripleSubsecuence {

    public static void main(String[] args) {
        int[] nums = {20, 100, 10, 12, 5, 13};
        System.out.println(increasingTriplet(nums));
    }

    public static boolean increasingTriplet(int[] nums) {
        int[] low = new int[nums.length];
        int[] high = new int[nums.length];
        int temp = nums[0];
        low[0] = nums[0];
        high[nums.length - 1] = nums[nums.length - 1];

        for (int i = 1; i < nums.length; i++) {
            if (temp > nums[i]) {
                temp = nums[i];
                low[i] = temp;
            } else {
                low[i] = temp;
            }
        }

        temp = nums[nums.length - 1];

        for (int i = nums.length - 2; i >= 0; i--) {
            if (temp < nums[i]) {
                temp = nums[i];
                high[i] = temp;
            } else {
                high[i] = temp;
            }
        }

        /*[20,  20, 10, 10, 5]
          [20, 100, 10, 12, 5, 13]
          [    100, 13, 13, 13, 13]*/

        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i] > low[i - 1] && nums[i] < high[i + 1]) {
                return true;
            }
        }
        return false;
    }
}