package apna_college;

import java.util.Scanner;

public class Missing_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=10;
        int arr[]=new int[10];
        System.out.println("you can only type 1 to 10");
        for (int i=1;i<n;i++){
            System.out.println("enter "+i+ " number");
            arr[i]=sc.nextInt();
        }
        for (int i=1;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
