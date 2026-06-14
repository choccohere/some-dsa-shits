
class Try2 {
    public int[] searchRange(int[] nums, int target) {
        int x = binSearch( nums, target, 0, nums.length - 1);
        int y = binSearch( nums, target, 0, nums.length - 1);
        return new int[]{x, y};
        
    }
    public int binSearch(int[] nums, int key, int s, int e){
        if( nums.length == 0) return -1;
        while(s <= e){
            int mid = s + ( e - s ) / 2;
            if(nums[mid] == key) return mid;
            else if( nums[mid] > key ) e = mid -1;
            else s = mid + 1;
        }
        return -1;
    }
    public int binSearchRev(int[] nums, int key, int s, int e){
        if( nums.length == 0) return -1;
        while(s >= e){
            int mid = s + ( e - s ) / 2;
            if(nums[mid] == key) return mid;
            else if( nums[mid] > key ) e = mid + 1;
            else s = mid - 1;
        }
        return -1;
    }
}