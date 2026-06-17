package DataStructures.Array;

public class MinMaxElement {
    static int min(int[] arr){
        int min = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(min < arr[i]){
                min = arr[i];
            }
        }
        return min;
    }
    static int max(int[] arr){
        int max = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(max > arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {121,324,654,643,67,43,21,998,23,9};

        int min = min(arr);
        int max = max(arr);

        System.out.println("max element :" + max + "\n" + "min elsement :" + min);

    }
}
