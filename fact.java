package apna_college;

import java.util.Scanner;

public class fact {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int fact = 1;
//        System.out.println("enter the number");
//        int num = sc.nextInt();
//        for (int i = 1; i <= num; i++) {
//            fact = fact * i;
//        }
//        System.out.println(fact);
        int x=fibonacci(6);
        System.out.println(x);
  }
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
