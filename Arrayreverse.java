package apna_college;
import java.util.*;
import java.util.Arrays;
import java.util.Collections;

public class Arrayreverse {
    public static void main(String[] args) {
        int number []= {5, 6, 1, 2, 9, 55,56,58,59};

        System.out.println("original number");
        printArray(number);


        System.out.println("\nreverse array");
        reverse(number);
        printArray(number);
    }

    public static void reverse(int number[]) {
        int first = 0;
        int last = number.length - 1;
        while (first < last) {
            int temp = number[last];
            number[last] = number[first];
            number[first] = temp;
            first++;
            last--;
        }

    }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}

