package apna_college;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Snack_Water_gun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String snake = "snake";
        String gun = "gun";
        String water = "water";

        System.out.println("please only type\n" +
                "1.snake" +
                "2.water" +
                "3.gun");
        System.out.println("your turn");
        String user1 = sc.nextLine();
        System.out.println("your friend turn");
        String user2 = sc.nextLine();

        if (user1.equals(snake)) {
            if (user2.equals(gun)) {
                System.out.println("User 2 wins");
            } else if (user2.equals(water)) {
                System.out.println("User 1 wins");
            } else {
                System.out.println("It's a tie");
            }
        } else if (user1.equals(water)) {
            if (user2.equals(snake)) {
                System.out.println("User 2 wins");
            } else if (user2.equals(gun)) {
                System.out.println("User 1 wins");
            } else {
                System.out.println("It's a tie");
            }
        } else if (user1.equals(gun)) {
            if (user2.equals(water)) {
                System.out.println("User 2 wins");
            } else if (user2.equals(snake)) {
                System.out.println("User 1 wins");
            } else {
                System.out.println("It's a tie");
            }
        } else {
            System.out.println("Invalid input for user 1");
        }

       /* if (user2.equals(snake)) {
            if (user1.equals(gun)) {
                System.out.println("User 1 wins");
            } else if (user1.equals(water)) {
                System.out.println("User 2 wins");
            } else {
                System.out.println("It's a tie");
            }
        } else if (user2.equals(water)) {
            if (user1.equals(snake)) {
                System.out.println("User 1 wins");
            } else if (user1.equals(gun)) {
                System.out.println("User 2 wins");
            } else {
                System.out.println("It's a tie");
            }
        } else if (user2.equals(gun)) {
            if (user1.equals(water)) {
                System.out.println("User 1 wins");
            } else if (user1.equals(snake)) {
                System.out.println("User 2 wins");
            } else {
                System.out.println("It's a tie");
            }
        } else {
            System.out.println("Invalid input for user 2");
        }*/
    }
}





