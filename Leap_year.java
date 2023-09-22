package apna_college;

import java.util.Scanner;

public class Leap_year {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year");
        int y = sc.nextInt();

        boolean x=(y%4==0);
        boolean z=(y%100!=0);
        boolean n= ((y%100==0) && (y%400==0));

        if(x && (z || n)){
            System.out.println(y+"leap year");
        }else{
            System.out.println(y+"not a leap year");
        }
    }
}
