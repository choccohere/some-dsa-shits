package Problems.MaxSubarray;

public class MaxSubArray {
    static int maxSubArray(int[] nums) {
        int ans = 0;
        for(int start = 0; start < nums.length; start++){
            for( int end = start + 1; end < nums.length; end++){
                int sum = 0;
                for(int cur = start; cur <= end; cur++){
                    sum += nums[cur];
                    ans = Math.max(ans, sum);
                    
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] x = {1,2,3,4,5};
        System.out.println(maxSubArray(x));
    }
    
    
}
