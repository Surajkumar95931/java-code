package apna_college;

import java.util.Scanner;

public class sum_of_num {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       // int i=1;
        int sum=0;
        System.out.println("Enter a number");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            if (i%2==0){
            sum=sum+i;}

        }
        System.out.println("The sum of "+n+" number is "+ sum);
    }
}
