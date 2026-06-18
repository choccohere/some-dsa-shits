package Problems.MaxSubarray;

public class SubArray {
    static void subArray(int[] nums) {
        // int ans = 0;
        for(int start = 0; start < nums.length; start++){
            for( int end = start + 1; end < nums.length; end++){
                for(int cur = start; cur <= end; cur++){
                    System.out.print("[" + nums[cur] + "]");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[] x = {1,2,3,4,5};
        subArray(x);
    }
    
}
