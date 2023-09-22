package apna_college;

import java.util.Scanner;
import java.util.Scanner;

public class Loop1 {
    public static void main(String[] args) {
//        int num = 65;
//        Scanner sc = new Scanner(System.in);
//
//        while (true) {
//            System.out.println("Please type a number:");
//            int na = sc.nextInt();
//
//            if (na != num) {
//                System.out.println("Try again. The number is not " + na);
//            } else {
//                System.out.println("your number is equal.");
//                break;
//            }
//        }
//        int n = 4;
//        for (int i=0;i<4;i++){
//            for (int j=0;j<n-i;j++){
//                System.out.print("* ");
//            }
//            System.out.println(" ");
//        }
//        int n = 5;
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= n - i; j++) {
//                System.out.print(" ");
//            }
//            for (int k = 1; k <= i; k++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        for (int i = 1; i <= 4; i++) {
//            for (int j = 1; j < 4 - i; j++) {
//                System.out.print(" ");
//            }
//            for (int k = 1; k <= i; k++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
                for (int k = 1; k <= i; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }




