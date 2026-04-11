package Problems.TwoSum;

import java.util.*;

public class TwoSumTry1 {
    public static void main(String[] args) {
        int[] a = { 1, 23, 4, 32 };
        int k = 33;
        int[] t = twoSum(a, k);
        System.out.println(Arrays.toString(t));

    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int a = target - nums[i];

            if (map.containsKey(a)) {
                return new int[] { i, map.get(a) };
            }
        }
        return new int[] {};
    }

}
