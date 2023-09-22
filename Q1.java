package apna_college;

import java.util.LinkedList;

import java.util.LinkedList;
import java.util.Queue;

public class Q1 {


    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        q.add(40);
        q.add(10);
        q.add(20);
        q.add(30);;

        int dequeuedElement = q.remove();

        int frontElement = q.peek();
        System.out.println("Front element: " + frontElement);

        boolean isEmpty = q.isEmpty();
        System.out.println("Is queue empty? " + isEmpty);

        int size = q.size();
        System.out.println("Queue size: " + size);
    }
}


