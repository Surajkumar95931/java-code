package apna_college;

import java.util.Scanner;

public class Class_and_object_details {
    static class user{
        public static void addDetails(){
            Scanner sc=new Scanner(System.in);
            System.out.println("enter your name");
            String name= sc.nextLine();
            System.out.println("Enter age");
            int age=sc.nextInt();
        }
        public static void updateDetails(){
            Scanner sc=new Scanner(System.in);
            System.out.println("enter your name");
            String name= sc.nextLine();
            System.out.println("Enter age");
            int age=sc.nextInt();
        }
    }
    public static void main(String[] args) {

    }
}
