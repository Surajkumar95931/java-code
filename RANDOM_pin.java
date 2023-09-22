package apna_college;
import java.util.*;
public class RANDOM_pin {


    public static void main(String[] args) {
        Random r = new Random();
        int pin = r.nextInt(10000); // Generate a random number between 0 and 9999
        System.out.printf("Random 4-digit PIN: %05d%n", pin);

    }
}

