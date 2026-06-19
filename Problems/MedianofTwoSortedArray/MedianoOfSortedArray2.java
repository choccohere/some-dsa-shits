package Problems.MedianofTwoSortedArray;

import java.util.Arrays;

public class MedianoOfSortedArray2 {
    static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] merged = mergeArray(nums1, nums2);
        int l = merged.length;
        if(l % 2 == 0){
            return (merged[l/2]+(merged[l/2 - 1]))/2.0;
        }else{
            return merged[l/2];
        }
    }
    static int[] mergeArray(int[] nums1, int[] nums2){
        int[] merged = new int[nums1.length+nums2.length];
        for (int i = 0; i < merged.length; i++){
            if(i < nums1.length){
                merged[i] = nums1[i];
            }else{
                merged[i] =nums2[i - nums1.length];
            }
        }
        
        Arrays.sort(merged);
        return merged;
    }
    public static void main(String[] args) {
        int nums1[] = { 1, 2, 3, 4, 5 };
        int nums2[] = { 4, 5, 6, 7, 8 };
        System.out.println(findMedianSortedArrays(nums1, nums2));
        int nums[] = mergeArray(nums1, nums2);
        for (int n : nums) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
}
