package Problems.SearchInRotatedArray;

public class RAS {
    static int search(int[] nums, int target) {
        int p = pivot(nums, 0, nums.length - 1);
        int ans1 = binSearch(nums, target, 0, p);
        if(ans1 == -1){
            int ans2 = binSearch(nums, target, p + 1, nums.length - 1);
            return ans2;
        }
        return ans1;
        
    }
    static int binSearch(int[] nums, int target, int s, int e){
        while(s <= e){
            int mid = s + (e - s)/2;
            if(nums[mid] == target){
                return mid;
            }else if(target < nums[mid]){
                e = mid - 1; 
            }else{
                s = mid + 1;
            }
        }
        return -1;
    }
    static int pivot(int[] nums, int s, int e){
        while ( s <= e ){
            int mid = s + (e - s)/2;
            if(mid < e && nums[mid] > nums[mid + 1]){
                return mid;
            }else if(mid > s && nums[mid] < nums[mid - 1]){
                return mid - 1;
            }else if(nums[s] >= nums[mid]){
                e = mid - 1;
            }else if(nums[s] < nums[mid]){
                s =  mid + 1;
            }
        }
        return s;
    }

    public static void main(String[] args) {
        int[] x = {44,53,57,67,72,92,22,32,35,40};
        int target = search(x, 22);
        System.out.println(target);
    }
    
}
