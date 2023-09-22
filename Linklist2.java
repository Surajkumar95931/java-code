package apna_college;
import java.util.LinkedList;
import java.util.*;
public class Linklist2 {
    public static void main(String[] args) {
        LinkedList<Integer> ll=new LinkedList<>();
        ll.addLast(3);
        ll.addLast(5);
        ll.addFirst(1);
        System.out.println(ll);
        ll.remove(1);
        System.out.println(ll);
    }
}
