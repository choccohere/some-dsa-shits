package Problems.MajorityElement;

public class MajorityElement {
    static  int majElement(int[] nums){
        int count = 0;
        for(int i : nums){
            int c = 0;
            for(int j : nums){
                if(i == j) c++;
                if(c > i/2) {
                    count++;
                };
            }

        }
        return count;
    }
    public static void main(String[] args) {
        int[] x = {1,1,1,2,2,2,2,2,2,4,5};
        System.out.println(majElement(x));
        
    }
    
}
