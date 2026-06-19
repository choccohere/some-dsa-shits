package Problems.RemoveDuplicates;

public class RemoveDuplicates {
    static int removeDuplicates(int[] nums) {
        int i = 0;
        for(int j = 0; j < nums.length; j++){
            if(nums[i]!=nums[j]){
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,2,2,3,4,4,5,6,6,6,6,7};
        System.out.println(removeDuplicates(arr));
    }
    
}
