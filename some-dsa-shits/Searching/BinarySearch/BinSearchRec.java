
import java.util.Scanner;

public class BinSearchRec {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr = { 1, 2, 3, 5, 55, 66 };

        System.out.println("Enter the number to be searched :");
        int target = in.nextInt();
        int ind = binarySearch(arr, target, 0, arr.length - 1);
        if (ind == -1) {
            System.out.println("Not Found!!!");
        } else {
            System.out.println("The number searched is at index " + ind);
        }
        in.close();

    }

    public static int binarySearch(int[] nums, int target, int start, int end) {
        int mid;
        mid = start + (end - start) / 2;

        if (start > end) {
            return -1; 
        }

        if (target == nums[mid]) {
            return mid;
        } else if (target < nums[mid]) {
            return binarySearch(nums, target, start, mid - 1);
        } else if (target > nums[mid]) {
            return binarySearch(nums, target, mid + 1, end);
        }
        return start;
    }

}
