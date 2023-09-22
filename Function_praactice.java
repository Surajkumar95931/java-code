package apna_college;
import java.util.Scanner;
public class Function_praactice {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        System.out.println(sum(num));
        //System.out.println(factorial(num));
    }
    public static int sum(int num){
        int sum=0;

        while (num>0){
            int find=num%10;
            sum=sum+find;
            num=num/10;
        }
        return sum;
    }
    public static int factorial(int num){
       int fact=1;
       for (int i=1;i<num;i++){
           fact=fact+fact*i;
       }
       return fact;
    }
}
