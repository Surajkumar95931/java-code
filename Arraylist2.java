package apna_college;

import java.util.ArrayList;

public class Arraylist2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        max(list);
        System.out.println("All element in arraylist is " + list);
        reverse(list);
        System.out.println("reverse list is" + list);
    }

    public static void max(ArrayList<Integer> list) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < list.size(); i++) {
            if (max < list.get(i)) {
                max = list.get(i);
            }
        }
        System.out.println(max + " is the maximum element");
    }

    public static void reverse(ArrayList<Integer> list) {
        int first = 0;
        int last = list.size() - 1;
        for (int i = 0; i < list.size(); i++) {
            while (first < last) {
                int temp = list.get(last);
                list.set(last, list.get(first));
                list.set(first, temp);
                first++;
                last--;
            }
        }

    }
}

