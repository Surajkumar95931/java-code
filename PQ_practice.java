package apna_college;

import java.util.*;

public class PQ_practice {
    static class student implements Comparable<student> {
        String name;
        int id;

        public student(String name, int id) {
            this.name = name;
            this.id = id;
        }

        @Override
        public int compareTo(student s2) {
            return this.id - s2.id;
        }
    }

    public static void main(String[] args) {
        PriorityQueue<student> pq = new PriorityQueue<>();
        Scanner sc = new Scanner(System.in);
//        System.out.println("how many numbers you want to add in pq");
//        int n = sc.nextInt();
//
//        int value[] = new int[n];
//        System.out.println("Enter your number");
//        for (int i = 0; i < n; i++) {
//            int val = sc.nextInt();
//            pq.add(val);
//            value[i] = val;
//        }
//        System.out.println("your value is");
//        for (int i = 0; i < value.length; i++) {
//            System.out.print(value[i] + " ");
//        }
//        System.out.println();
//
//        System.out.println("final answer");
//        while (!pq.isEmpty()){
//            System.out.println(pq.peek());
//            pq.remove();
//        }
        pq.add(new student("suraj", 5));
        pq.add(new student("harshal", 6));
        pq.add(new student("aayush", 3));
        while (!pq.isEmpty()){
            System.out.println(pq.peek().name+" "+pq.peek().id);
            pq.remove();
        }
    }
}
