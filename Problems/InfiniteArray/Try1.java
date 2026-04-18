package Problems.InfiniteArray;

public class Try1 {
    public static void main(String[] args) {
        int[] nums = { 10, 33, 44, 55, 66, 77, 88, 99, 111, 222, 333, 444, 555, 666, 777, 888, 999 };
        int target = 888;

        int found = -1;
        int start = 0;
        int end = 1;
        while (true) {
            try{
                if(nums[end]>=target) break;
                int x = start;
                end = end + (end - x + 1) * 2;
                start = x;
            }catch(Exception e){
                break;
            }
        }
        found = binarySearch(nums, target, start, end);
        System.out.println(found);
    }

    public static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = (start + end) / 2;

            if (target == arr[mid]) {
                return mid;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            }
        }
        return -1;
    }

}
