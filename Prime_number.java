package apna_college;

import java.util.Scanner;

public class Prime_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n th number");
        int n = sc.nextInt();
        for (int i = 2; i <= n; i++) {
            if (isprime(i)) {
                System.out.println(i + " ");
            }
        }
        System.out.println();
    }

    public static boolean isprime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}
