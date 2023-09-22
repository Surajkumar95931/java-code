package apna_college;

import org.w3c.dom.ls.LSOutput;

public class SORT_Selectionsort {
    public static void main(String[] args) {
        double arr[] = {12.4, 11.5, 19.5, 32.53, 46.51};
        System.out.println("original array");
        print(arr);
        Selectsort(arr);
        System.out.println("sorted array");
        print(arr);
    }

    public static void Selectsort(double arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minpos = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minpos] > arr[j]) {
                    minpos = j;
                }
            }
            double temp = arr[minpos];
            arr[minpos] = arr[i];
            arr[i] = temp;
        }
    }


    public static void print(double arr[]) {
        for (int i = 0; i < arr.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(arr[i]);
        }
        System.out.println();
    }


}
