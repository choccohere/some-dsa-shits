
import java.util.Scanner;

public class BinSearchBothOrder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr = { 1, 2, 3, 5, 55, 66 };
        int[] a = { 22, 12, 11, 7, 5, 3, 1 };
        System.out.println("Enter the number to be searched :");
        int target = in.nextInt();
        int ind = binarySearch(arr, target, 0, arr.length - 1);
        if (ind == -1) {
            System.out.println("Not Found!!!");
        } else {
            System.out.println("The number searched is at index " + ind);
        }
        int i = binarySearch(a, target, 0, a.length - 1);
        if (i == -1) {
            System.out.println("Not Found!!!");
        } else {
            System.out.println("The number searched is at index " + i);
        }
        in.close();

    }

    public static int binarySearch(int[] nums, int target, int start, int end) {
        int mid;
        mid = start + (end - start) / 2;
        // Increasing Order Sorted Array
        if (start > end) {
            return -1;
        }
        if (nums[start] < nums[end]) {

            if (target == nums[mid]) {
                return mid;
            } else if (target < nums[mid]) {
                return binarySearch(nums, target, start, mid - 1);
            } else if (target > nums[mid]) {
                return binarySearch(nums, target, mid + 1, end);
            }
        }
        // Decreasing Order Sorted Array
        else {

            if (target == nums[mid]) {
                return mid;
            } else if (target > nums[mid]) {
                return binarySearch(nums, target, start, mid - 1);
            } else if (target < nums[mid]) {
                return binarySearch(nums, target, mid + 1, end);
            }
        }
        return -1;
    }
}
