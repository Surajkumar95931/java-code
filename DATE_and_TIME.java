package apna_college;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class DATE_and_TIME {
    public static void main(String[] args) {
        //To display the current time (hour, minute, second, and nanoseconds)
        LocalTime myObj = LocalTime.now();
        System.out.println(myObj);

        //to print date and day
        Date d = new Date();
        System.out.println(d);

        //date and time in format manner
        LocalDateTime myDateObj = LocalDateTime.now();
        System.out.println("Before formatting: " + myDateObj);
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        String formattedDate = myDateObj.format(myFormatObj);
        System.out.println("After formatting: " + formattedDate);
    }
}
