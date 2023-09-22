package apna_college;

import java.util.Scanner;

public class ArrayFloatSum {
    public static void main(String[] args) {
        float arr[] = new float[5];

        float sum = 0;
        for (int i = 0; i < 5; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter value "+i + ""+" ");
            arr[i] = sc.nextFloat();
            sum = 0.0f;
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
