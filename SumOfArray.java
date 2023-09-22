package apna_college;

import java.util.Scanner;

public class SumOfArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        System.out.println("enter a number");
//        int n=sc.nextInt();
//        int sum=0;
//        for (int i=2;i<=n;i++){
//            if (i%2==0){
//                System.out.println(i);
//                 sum=sum+i;
//            }
//
//        }
//        System.out.println(sum);
        System.out.println("enter a table name");
        int table=sc.nextInt();
        for (int i=10;i>=1;i--){
            System.out.println(table+"*"+i+"="+i*table);
        }
    }
}
