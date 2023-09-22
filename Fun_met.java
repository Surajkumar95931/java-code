package apna_college;

import java.util.Scanner;

public class Fun_met {
    public static int mul(int a,int b) {
        int c=a*b;
        return c;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int pro=mul(a,b);
        System.out.println(pro);
    }
}
