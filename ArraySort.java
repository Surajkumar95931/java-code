package apna_college;

import java.util.Arrays;

public class ArraySort {

    public static void printarr(int arr[]) {
//        for (int i = 0; i <arr.length; i++) {
//            System.out.print(arr[i]);
//        }
    }

    public static void main(String[] args) {
        int arr[] = {2, 5, 6, 3, 4};

        // Sort the array using Arrays.sort()
        Arrays.sort(arr);
        //Arrays.reverse(arr);
        // Print the sorted array
        System.out.println("Sorted Array:");
        printarr(arr);
    }
}