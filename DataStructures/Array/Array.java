package DataStructures.Array;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter number : ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Array :");
        for (int i = 0; i < 5; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}
