package apna_college;

import java.util.Scanner;

public class Vowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string");
        String name = sc.nextLine();
        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);
            if (Vowel(ch)) {
                System.out.println("your letter of vowel is " + ch);
            }
        }
    }

    public static boolean Vowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
    }
}

