package Problems.SearchInRotatedArray;

public class RotationCount {
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
        return -1;
    }

    static int rotationCount(int[] x){
        int pivot = pivot(x, 0, x.length - 1);
        return pivot + 1;
    }
    public static void main(String[] args) {
        int[] x = {44,53,57,67,72,92,11,22,32,35,40};
        int count = rotationCount(x);
        System.out.println(count);
    }
    
}
