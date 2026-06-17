package Searching.LinearSearch;

public class LinSearch {
    static int linIndexSearch(int[] a, int x) {
        if (a.length == 0)
            return -1;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == x) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] a = { 1, 2, 4, 55, 33, 555, 55, 66, 111 };
        // int[][] b = {
        //     {1,3,5},
        //     {22,44,55},
        //     {22,55,33,44,65}
        // };
        System.out.println(linIndexSearch(a, 111));
    }
}
