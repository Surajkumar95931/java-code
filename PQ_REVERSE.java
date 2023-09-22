package apna_college;

import java.util.*;

public class PQ_REVERSE {
    public static void main(String[] args) {
        PriorityQueue<Integer> p = new PriorityQueue<>(Comparator.reverseOrder());
        p.add(3);
        p.add(5);
        p.add(8);
        p.add(7);
        while (!p.isEmpty()){
            System.out.println(p.peek());
            p.remove();
        }
    }
}
