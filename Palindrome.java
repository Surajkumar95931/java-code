package apna_college;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = sc.nextInt();
        System.out.println(reverse(a));
        System.out.println(sumOf(a, reverse(a)));
        int result = repeatPalinAndAdd(a);
        System.out.println("Final Palindrome Sum: " + result);
    }

    // check palindrome
    public static boolean palin(int number) {
        int palindrome = number;
        int reverse = 0;
        while (palindrome != 0) {
            int remainder = palindrome % 10; // find the last digit of the number
            reverse = reverse * 10 + remainder;
            palindrome = palindrome / 10; // remove the last digit when we divide by 10
        }
        return number == reverse;
    }

    // reverse a number
    public static int reverse(int number) {
        int reverse = 0;
        while (number != 0) {
            int remainder = number % 10; // find the last digit of the number
            reverse = reverse * 10 + remainder;
            number = number / 10; // remove the last digit when we divide by 10
        }
        return reverse;
    }

    // sum of two numbers
    public static int sumOf(int n, int m) {
        return n + m;
    }

    public static int repeatPalinAndAdd(int number) {

        int sum = number;
        int reverse = reverse(number);
        System.out.println("Intermediate sums:");
        while (!palin(sum)) {
            System.out.println(sum + " + " + reverse + " = " + sumOf(sum, reverse));
            sum = sumOf(sum, reverse);
            reverse = reverse(sum);
        }
        return sum;
    }
}
