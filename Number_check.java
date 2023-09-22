package apna_college;

import java.util.Scanner;

public class Number_check {
    public static void main(String[] args) {
        int n = 10;
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter number");
            int a = sc.nextInt();

            if (a == n) {
                System.out.println("Number matches!");
                break;
            }
        }
    }
}
