package Problems.PeakInAmountainArray;

public class PeakInAMontainArray {
    static int peakIndexInMountainArray(int[] arr) {
        int s = 0;
        int e = arr.length - 1;
        while( s < e){
            int mid = s + (e - s) / 2;
            if(arr[mid] < arr[mid + 1]){
                s = mid + 1;
            }else{
                e = mid;
            }
        }
        return s;
    }
    public static void main(String[] args) {
        int arr[] = {1,22,45,56,73,43,11,4};
        System.out.println(peakIndexInMountainArray(arr) + " " + arr[peakIndexInMountainArray(arr)]);

    }    
}
