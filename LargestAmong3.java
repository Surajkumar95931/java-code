package apna_college;

import java.util.Scanner;
import java.util.Scanner;

public class LargestAmong3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int harshal[] = new int[3];
        for (int i = 0; i < 3; i++) {
            harshal[i] = sc.nextInt();
        }

        int maximum = max(harshal);
        System.out.println("Maximum among three numbers is: " + maximum);
    }

    static int maxi = Integer.MIN_VALUE;

    public static int max(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxi) {
                maxi = arr[i];
            }
        }
        return maxi;
    }
}

