package apna_college;

import java.util.*;

public class PQ_STudent_priority {
    static class student implements Comparable<student> {
        String name;
        int rank;

        public student(String name, int rank) {
            this.name = name;
            this.rank = rank;
        }

        @Override
        public int compareTo(student s2) {
            return this.rank - s2.rank;
        }
    }

    public static void main(String[] args) {
        PriorityQueue<student> pq = new PriorityQueue<>();
        pq.add(new student("A", 4));
        pq.add(new student("C", 6));
        pq.add(new student("B", 5));
        while (!pq.isEmpty()) {
            System.out.println(pq.peek().name + "=" + pq.peek().rank);
            pq.remove();
        }
    }
}
//if you want output to decreasing order or reverse order then write{{ "Comparator.reverseOrder()"}}
