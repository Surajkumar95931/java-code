package apna_college;

import java.util.Scanner;

public class Income_Tax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please Enter your monthly Income");
        int a = sc.nextInt();
        int annual = a * 12;

        System.out.println("your Annual income is = " + annual);
        int tax = 0;
        if (annual > 250000 && annual < 500000) {
            tax = annual * 5 / 100;
            System.out.println("your annual tax is =" + tax);
        } else if (annual > 500000 && annual < 1000000) {
            tax = annual * 20 / 100;
            System.out.println("your annual tax is =" + tax);
        } else {
            tax = annual * 30 / 100;
        }
        System.out.println("your annual tax is" + tax);


        while (true) {
            System.out.println("do you want to see monthly taxes say yes or no");
            String ab = sc.next();
            if (ab.equals("yes")) {
                int monthly = tax / 12;
                System.out.println("monthly tax is =" + monthly);
            } else if (ab.equals("no")) {
                break;
            } else {
                System.out.println("Invalid input");
            }

        }
        System.out.println("thank you");
    }
}

