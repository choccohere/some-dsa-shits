package Searching.BinarySearch;

import java.util.Scanner;

public class BinarySearch {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr = { 1, 2, 3, 5, 55, 66 };

        System.out.println("Enter the number to be searched :");
        int target = in.nextInt();
        int ind = binarySearch(arr, target);
        if (ind == -1) {
            System.out.println("Not Found!!!");
        } else {
            System.out.println("The number searched is at index " + ind);
        }
        in.close();

    }

    public static int binarySearch(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;

            if (target == nums[mid]) {
                return mid;
            } else if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            }
        }
        return -1;
    }

}
