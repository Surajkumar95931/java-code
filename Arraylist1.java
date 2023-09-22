package apna_college;
import java.util.ArrayList;
public class Arraylist1 {


        public static void main(String[] args) {
            ArrayList<Integer> numbers = new ArrayList<>();

            numbers.add(10);
            numbers.add(20);
            numbers.add(30);
            numbers.add(40);

            System.out.println("Original ArrayList: " + numbers);

            numbers.add(1, 15);

            System.out.println("ArrayList after adding an element: " + numbers);

            numbers.remove(3);

            System.out.println("ArrayList after removing an element: " + numbers);

            int element = numbers.get(2);
            System.out.println("Element at index 2: " + element);

            int size = numbers.size();
            System.out.println("Size of the ArrayList: " + size);

            boolean isEmpty = numbers.isEmpty();
            System.out.println("Is the ArrayList empty? " + isEmpty);
        }
    }


