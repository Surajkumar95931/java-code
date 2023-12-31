package apna_college;

import java.util.Scanner;

public class SORT_Insertion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("enter how many elements you want to add");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("enter array elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        Insertion(arr);
        System.out.println("after sorting");
        printArr(arr);


    }

    public static void Insertion(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i - 1;

            while (prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[prev + 1] = curr;
        }
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }
}
