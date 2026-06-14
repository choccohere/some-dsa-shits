package Problems.FirstandLastElementElementinSortedArray;

class Trt1 {
    public int[] searchRange(int[] nums, int target) {
        int x = binSearch(nums, target, 0, nums.length);
        int y = x;
        int[] res = { x, y };
        if (x == -1) {
            return res;
        }
        while (y < nums.length) {
            res[1] = y;
            y = binSearch(nums, target, y, nums.length - 1);
        }
        return res;

    }

    public int binSearch(int[] nums, int key, int s, int e) {
        if (nums.length == 0)
            return -1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (nums[mid] == key)
                return mid;
            else if (nums[mid] > key)
                e = mid - 1;
            else
                e = mid + 1;
        }
        return -1;
    }
}
