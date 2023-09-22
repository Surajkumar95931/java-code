package apna_college;

import java.util.*;

public class practice3 {
    public static void main(String[] args) {
        int arr[] = {5, 6, 8, 2, 3, 12, 7, 11};
        int key = 3;
        System.out.println("original array");
        print(arr);
        System.out.println("sorted array");
        sort(arr);
        print(arr);
        System.out.println("Binary search if this array");
        int index=bs(arr,key);
        if (index!=-1){
            System.out.println("found at "+index);
        }else{
            System.out.println("not found");
        }

    }

    public static void sort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

    }

    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int bs(int arr[], int val) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + end / 2;
            if (arr[mid] == val) {
                return mid;
            } else if (arr[mid] < val) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

}
