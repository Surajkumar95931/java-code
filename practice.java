package apna_college;

import java.net.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Scanner;

public class practice {
    static class Student {
        String name;
        String stream;
        int roll;
        int age;

        public Student(String name, String stream, int roll, int age) {
            this.name = name;
            this.stream = stream;
            this.roll = roll;
            this.age = age;
        }

        public void Input() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter student name: ");
            name = scanner.nextLine();

            System.out.print("Enter student stream: ");
            stream = scanner.nextLine();

            System.out.print("Enter student roll number: ");
            roll = scanner.nextInt();

            System.out.print("Enter student age: ");
            age = scanner.nextInt();
            //scanner.nextLine();
        }
        public void updateDetails() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Which student detail do you want to update?");
            System.out.println("1. Name");
            System.out.println("2. Stream");
            System.out.println("3. Roll ");
            System.out.println("4. Age");


            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Update student name: ");
                    name = scanner.nextLine();
                    break;
                case 2:
                    System.out.print("Update student stream: ");
                    stream = scanner.nextLine();
                    break;
                case 3:
                    System.out.print("Update student roll number: ");
                    roll = scanner.nextInt();
                    break;
                case 4:
                    System.out.print("Update student age: ");
                    age = scanner.nextInt();
                    break;

                default:
                    System.out.println("Invalid choice. No details updated.");
                    break;
            }

        }
        public void deleteField() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Which student detail do you want to delete?");
            System.out.println("1. Name");
            System.out.println("2. Stream");
            System.out.println("3. Roll");
            System.out.println("4. Age");

            int choose = sc.nextInt();
            sc.nextLine();

            switch (choose) {
                case 1:
                    name = null;
                    break;
                case 2:
                    stream = null;
                    break;
                case 3:
                    roll = 0;
                    break;
                case 4:
                    age = 0;
                    break;
                default:
                    System.out.println("Invalid choice. No field deleted.");
                    break;
            }
        }
        //@Override
        public String toString() {
            return "Name: " + name + ", Stream: " + stream + ", Roll: " + roll + ", Age: " + age;
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student("", "", 0, 0);
        s1.Input();
        System.out.println("Student Details:");
        System.out.println(s1.toString());
        s1.updateDetails();
        System.out.println(s1.toString());
        s1.deleteField();
        System.out.println(s1.toString());

    }
}
