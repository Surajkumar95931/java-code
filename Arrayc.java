package apna_college;

import java.util.Scanner;

public class Arrayc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int marks[]=new int[50];
//        marks[0]=sc.nextInt();
//        marks[1]=sc.nextInt();
//        marks[2]=sc.nextInt();
//        System.out.println("phy marks "+marks[0]);
//
//        System.out.println("maths marks "+marks[1]);
//
//        System.out.println("chem marks "+marks[2]);
//        marks[2]=marks[2]+5-1;
//        System.out.println("updated marks of chem is "+marks[2]);
        for(int i=1;i<=4;i++){

            marks[i]=sc.nextInt();

        }
        marks[2]=65;
        System.out.println(marks[2]);
    }
}
