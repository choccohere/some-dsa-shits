package Problems.MinimumNumberGame;

import java.util.Arrays;

// PATTERN : SORT AND SWAP
public class MinNumGame {
    static int[] numberGame(int[] nums) {

        Arrays.sort(nums);

        for (int i = 0; i < nums.length ; i += 2) {
            int temp = nums[i];
            nums[i] = nums[i + 1];
            nums[i + 1] = temp;
        }

        return nums;
    }
    
    public static void main(String[] args) {
        int[] arr = {132,34,54,65,32,66,43,236,75,10};  //even num of elements
        int[] minNum = numberGame(arr);
        for(int i = 0; i < minNum.length; i++){
            System.out.println(minNum[i]);
        }
        
    }
}
