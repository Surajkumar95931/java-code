package apna_college;

import java.util.Scanner;

public class bill {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the price of pen");
        int pen=sc.nextInt();
        System.out.println("Enter the price of pencil");
        int pencil=sc.nextInt();
        System.out.println("Enter the price of ink");
        int ink=sc.nextInt();
        int total =pen+pencil+ink;
        System.out.println("The total price of pen pencil ink is "+total);
        int gst=total+total*18/100;
        System.out.println("your bill including 18 % gst is "+gst);
    }
}
