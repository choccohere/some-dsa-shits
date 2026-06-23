package Problems.PeakElement;

public class FindPeakElement {
    static int findPeakElement(int[] nums) {
        int s = 0;
        int e = nums.length - 1;
        int mid = 0;
        while( s < e){
            mid = s + (e - s) / 2;
            if(nums[mid] < nums[mid + 1]){
                s = mid + 1;
            }else{
                e = mid;
            }
        }
        return s;
    }

    public static void main(String[] args) {
        int[] arr = {11,22,33,543,56,7,8};
        System.out.println(findPeakElement(arr));
    }
    
}
