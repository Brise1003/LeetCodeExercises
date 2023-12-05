import java.util.Arrays;
import java.util.Scanner;

public class exercise1 {

    public static int target;
    public static int response;

    public static int[] getNumbers(){
        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers do you want to insert?");
        response = sc.nextInt();
        int [] nums = new int[response];

        for(int i=0;i<response;i++)
        {
            System.out.println("Insert your vector numbers: ");
            nums[i] = sc.nextInt();
        }
        System.out.println("Insert the target number: ");
        target=sc.nextInt();
        System.out.println(Arrays.toString(nums));
        return nums;
    }

    public static int [] twoSum(int [] nums, int target){
        /*Given an array of integers nums and an integer target, return indices
        of the two numbers such that they add up to target. You may assume that
        each input would have exactly one solution, and you may not use the same
        element twice. You can return the answer in any order.*/
        int [] first2 = new int[2];
        for(int i=0;i<nums.length;i++){
            for (int j=0;j< nums.length;j++){
                if(nums[j]+nums[i] == target && i!=j){
                    first2[0]=i;
                    first2[1]=j;
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(first2));
        return first2;
    }
}
