package apna_college;
import java.util.*;
import java.sql.SQLOutput;
import java.util.Scanner;
import java.io.*;
public class Number_To_Character {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int a = sc.nextInt();
        NC(String.valueOf(a));

    }

    public static void NC(String a) {
        for (int i = 0; i < a.length(); i++) {
            switch (a.charAt(i)) {

                // Case 1
                case '1':
                    System.out.print("one ");

                    // Break statement to hault
                    // normal execution of the program
                    break;

                // Case 2
                case '2':
                    System.out.print("two ");
                    break;

                // Case 3
                case '3':
                    System.out.print("three ");
                    break;

                // Case 4
                case '4':
                    System.out.print("four ");
                    break;

                // Case 5
                case '5':
                    System.out.print("five ");
                    break;

                // Case 6
                case '6':
                    System.out.print("six ");
                    break;

                // Case 7
                case '7':
                    System.out.print("seven ");
                    break;

                // Case 8
                case '8':
                    System.out.print("eight ");
                    break;

                // Case 9
                case '9':
                    System.out.print("nine ");
                    break;

                // Case 10
                case '0':
                    System.out.print("zero ");
                    break;

                // Default case
                default:
                    System.out.print("InValid ");
                    break;
            }
        }
    }
}
