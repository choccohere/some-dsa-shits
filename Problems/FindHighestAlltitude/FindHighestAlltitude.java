package Problems.FindHighestAlltitude;

public class FindHighestAlltitude {
    static int largestAltitude(int[] gain) {
        int peak = 0;
        int sum = 0;
        for(int alt : gain){
            sum+=alt;
            peak = sum>peak?sum:peak;
        }
        return peak;
    }
    public static void main(String[] args) {
        int[] arr = {12,-3,-6,-6,7,8};

        System.out.println(largestAltitude(arr));
    }
    
}
