package apna_college;

import java.util.LinkedList;

public class LinkedLIst1 {
    public static void main(String[] args) {
        LinkedList<Integer> ll=new LinkedList<>();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        System.out.println("your ll is "+ll);
        ll.remove(1);
        System.out.println(ll);
    }
}
