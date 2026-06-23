package Problems.MinimumSumSubArray;


public class MiniSizeArraySum {
    static int minSubArrayLen(int target, int[] nums) {

        int left = 0;
        int sum = 0;
        int min = Integer.MAX_VALUE;

        for (int right = 0; right < nums.length; right++) {

            sum += nums[right];

            while (sum >= target) {

                min = Math.min(min, right - left + 1);

                sum -= nums[left];
                left++;
            }
        }

        return min == Integer.MAX_VALUE ? 0 : min;
    }

    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6,7};
        int[] arr2 = {1,2,3,4,5};
        
        System.out.println(minSubArrayLen(7, arr1));
        System.out.println(minSubArrayLen(7, arr2));
    }
}
