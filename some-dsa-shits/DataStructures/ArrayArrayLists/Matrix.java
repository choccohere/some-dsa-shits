import java.util.Scanner;

public class Matrix {
    static int[][] Mul(int x[][], int y[][], int row1, int col1, int row2, int col2) {
        int[][] res = new int[row1][col2];
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col2; j++) {
                for (int k = 0; k < col1; k++) {
                    res[i][j] += x[i][k] * y[k][j];
                }
            }
        }
        return res;
    }

    static int matSum(int x[][], int row, int col) {
        int sum = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                sum += x[i][j];
            }
        }
        return sum;
    }

    static int matMax(int x[][], int row, int col) {
        int max = x[0][0];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (x[i][j] > max) {
                    max = x[i][j];
                }
            }
        }
        return max;
    }

    static int matMin(int x[][], int row, int col) {
        int min = x[0][0];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (x[i][j] < min) {
                    min = x[i][j];
                }
            }
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Enter number : ");
                arr[i][j] = sc.nextInt();
            }
        }

        int sum = matSum(arr, 3, 3);
        System.out.println(" sum of array = " + sum);
        int max = matMax(arr, 3, 3);
        System.out.println(" Max of array = " + max);
        int min = matMin(arr, 3, 3);
        System.out.println(" Min of array = " + min);

        int[][] res = new int[3][3];
        res = Mul(arr, arr, 3, 3, 3, 3);

        System.out.println("Result Array :");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println("\n");
        }

        sc.close();
    }

}
