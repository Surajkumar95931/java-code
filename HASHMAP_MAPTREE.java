package apna_college;

import java.util.*;
import java.util.Scanner;
import java.util.TreeMap;

public class HASHMAP_MAPTREE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeMap<Integer, String> tm = new TreeMap<>();
        System.out.println("print how many value you want to add");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("enter "+i+" integer value");
            int a = sc.nextInt();
            sc.nextLine();

            System.out.println("enter "+i+" string value");
            String b = sc.nextLine();
            tm.put(a, b);
        }
        System.out.println("your values is"+tm);
        System.out.println( tm.remove("6"));
    }
}
