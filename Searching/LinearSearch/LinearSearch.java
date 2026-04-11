package Searching.LinearSearch;

public class LinearSearch {

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

    static int linElementSearch(int[] a, int x) {
        if (a.length == 0)
            return -1;

        for (int element : a) {
            if (element == x)
                return element;
        }
        return -1;
    }

    static boolean LinearSearch2D(int[][] a, int x) {
        if (a.length == 0)
            return false;
        for (int row = 0; row < a.length; row++) {
            for (int col = 0; col < a[row].length; col++) {
                if (a[row][col] == x)
                    return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] a = { 1, 2, 4, 55, 33, 555, 55, 66, 111 };
        int[][] b = {
            {1,3,5},
            {22,44,55},
            {22,55,33,44,65}
        };
        System.out.println(linIndexSearch(a, 111));
        System.out.println(linElementSearch(a, 111));
        System.out.println(LinearSearch2D(b, 111));
        System.out.println(LinearSearch2D(b, 33));
    }
}