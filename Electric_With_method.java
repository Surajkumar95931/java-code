package apna_college;
import java.util.*;
public class Electric_With_method {
    public static void main(String[] args) {
        Electric();
        System.out.println("Do you want to see details with id");

    }
    public static void Electric(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter user id");
        int id=sc.nextInt();
        System.out.println("Enter flat no");
        int flat=sc.nextInt();
        System.out.println("Enter Monthly reading");
        int read=sc.nextInt();
        System.out.println("Enter your name");
        String name=sc.next();
    }
}
