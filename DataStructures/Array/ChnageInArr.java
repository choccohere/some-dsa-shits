package DataStructures.Array;

public class ChnageInArr {
    static void doubleArr(int[] nums){
        for(int i = 0; i < nums.length; i++){
            System.out.print("[" +  2*nums[i] + "]");
        }
    }
    static int[] reverseArray(int[] arr){
        int i = 0;
        int e = arr.length - 1;
        while(i < e){
            int temp = arr[i];
            arr[i] = arr[e];
            arr[e] = temp;

            i++; e--;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {121,324,654,643,67,43,21,998,23,9};
        for(int i = 0; i < arr.length; i++){
            System.err.print("[" + arr[i] + "]");
        }
        System.out.println();
        doubleArr(arr);
        System.out.println();
        int[] x= reverseArray(arr);
        for(int i = 0; i < x.length; i++){
            System.err.print("[" + x[i] + "]");
        }
        System.out.println();
        doubleArr(arr);
        
    }
    
}
