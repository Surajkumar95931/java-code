package apna_college;

import java.util.Scanner;

public class Even_Word_Print {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String name = sc.nextLine();
        printEvenWords(name);
    }

    public static void printEvenWords(String a) {

        String[] words = a.split("\\s+");
       // int count = words.length;

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (word.length() % 2 == 0) {
                System.out.println(word);
            }
        }
    }
}
