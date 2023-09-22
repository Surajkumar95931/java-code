package apna_college;

import java.util.ArrayList;

public class Stack {
    static class Stack1 {
        static ArrayList<Integer> list = new ArrayList<>();

        public static boolean isEmpty() {
            return list.size() == 0;
        }

        //push operation done here
        public static void push(int data) {
            list.add(data);
        }

        //pop operation done here
        public static int pop() {
            if (isEmpty()) {
                return -1;
            }
            int top = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return top;
        }

        //peek code
        public static int peek() {
            return list.get(list.size() - 1);
        }
    }

    public static void main(String[] args) {
        Stack1 s = new Stack1();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();

        }
    }
}
