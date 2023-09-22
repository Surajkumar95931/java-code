package apna_college;

import java.util.Scanner;

public class Fibonacci_Series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int first=0;
        int second=1;
        System.out.println("enter the nth term");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print(first+" ");
            int next=first+second;
            first=second;
            second=next;
        }
    }
}
