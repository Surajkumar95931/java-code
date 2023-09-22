package apna_college;
import java.util.Scanner;

public class largest_3 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a");
        int a=sc.nextInt();
        System.out.println("Enter b");
        int b=sc.nextInt();
        System.out.println("Enter c");
        int c=sc.nextInt();

        if(a>b && a>c){
            System.out.println("A is largest number among three number");
        } else if (b>a &&b>c) {
            System.out.println("b is largest");

        }else{
            System.out.println("c is largest");
        }
    }
}
