package Problems.ContainerWithMostWater;

public class ContainerWithMostWater {
    static int maxArea(int[] height) {

        int maxArea = 0;

        int l = 0;
        int r = height.length - 1;

        while (l < r) {

            int h = Math.min(height[l], height[r]);
            int w = r - l;

            maxArea = Math.max(maxArea, h * w);

            if (height[l] < height[r]) {
                l++;
            } else {
                r--;
            }
        }

        return maxArea;
    }

    public static void main(String[] args) {
        int[] arr = {1,5,3,4,2,10,4,9,8};
        int area = maxArea(arr);
        System.out.println(area);
    }
    
}
