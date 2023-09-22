package apna_college;

import java.util.Scanner;

public class Recursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter");
        int c = sc.nextInt();
        re(c);
    }
    public static void re(int a) {
        if (a == 5) {

            System.out.println("value is 5 so loop break now");
            return;
        }
        System.out.println("Value is not 5. Calling re() again..\n enter number again.");
        Scanner sc = new Scanner(System.in);
        int nextValue = sc.nextInt();
        re(nextValue);
    }
}
