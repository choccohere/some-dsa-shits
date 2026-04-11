// Problrm Number - 35 
// SearchInsertPosition
package Problems.SearchInsertPostion;

import java.util.Scanner;

public class Try1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr = { 1, 2, 3, 5, 55, 66 };
        System.out.println("Enter the number to be seached, if not exit the index of its insertion will be returned :");
        int target = in.nextInt();
        System.out.println("the number is/will be at index :" + searchInsert(arr, target));

        in.close();
    }

    public static int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;

            if (target == nums[mid]) {
                return mid;
            } else if (target < nums[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }
}
