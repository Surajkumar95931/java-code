package apna_college;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int fact=sc.nextInt();

        int result=factorial(fact);
        System.out.println(result);
    }
    public static int factorial(int num){
            int fact = 1;
            for (int i = 1; i <= num; i++) {
                fact =fact* i;
            }
            return fact;
        }
    }

