package Problems.SearchIn2DMatrix;

public class Try1 {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int[] nums : matrix){
            if(binSearch(nums, target)) return true;
        }
        return false;  
    }
    public boolean binSearch(int[] arr, int target){
        int low = 0;
        int high = arr.length - 1;
        int mid;
        while(low<=high){
            mid = low + (high - low)/2;
            if(arr[mid] == target){
                return true;
            }else if(target > arr[mid]){
                low = mid + 1;
            }else if (target < arr[mid]){
                high = mid - 1;
            }
        }
        return false;
    }
}
 