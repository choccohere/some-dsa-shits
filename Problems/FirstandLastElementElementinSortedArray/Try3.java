package Problems.FirstandLastElementElementinSortedArray;

public class Try3 {

    public static void main(String[] args) {
        int[] nums = { 11, 44, 55, 66, 74, 76, 76, 76, 76, 99, 100 };
        int[] res = searchRange(nums, 76);
        System.err.println(res[0] + " " + res[2]);
    }

    public static int[] searchRange(int[] nums, int target) {
        int x = binSearch(nums, target, true);
        int y = binSearch(nums, target, false);
        return new int[] { x, y };

    }

    public static int binSearch(int[] nums, int key, boolean findFirst) {
        int s = 0, e = nums.length - 1;

        if (nums.length == 0)
            return -1;
        int ans = -1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (nums[mid] == key) {
                ans = mid;
                if (findFirst)
                    e = mid - 1;
                else
                    s = mid + 1;
                return mid;
            } else if (nums[mid] > key)
                e = mid - 1;
            else
                s = mid + 1;
        }
        return ans;
    }

}
