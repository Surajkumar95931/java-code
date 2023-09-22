package apna_college;

import java.util.Scanner;

public class Iseven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("number dal");
        int a=sc.nextInt();
        Isevens(a);
    }
    public static void Isevens(int num){
        if (num%2==0){
            System.out.println("True");
        }
       else{
            System.out.println("false");
        }
    }
}
