package apna_college;

import java.util.*;

public class twodarray {
    public static void main(String[] args) {
        int arr[][] = new int[3][3];
        int n = 3;
        int m = 3;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                Scanner sc = new Scanner(System.in);
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
        }
        System.out.println();
    }
}