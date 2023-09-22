package apna_college;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your body temperature");
        double temp=sc.nextDouble();
        if(temp>100){
            System.out.println("you are in fever");
        }else{
            System.out.println("you don't have a fever");
        }
    }
}
