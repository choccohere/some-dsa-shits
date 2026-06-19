package Problems.ContainDuplicates;

import java.util.HashSet;

public class ContainDup {
    static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            }
            set.add(num);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr1 = {1,32,5,5,4,5,22,6};
        int[] arr2 = {1,32,4,5,22,6};

        System.out.println(containsDuplicate(arr1));
        System.out.println(containsDuplicate(arr2));
    }
}
