package apna_college;
import java.util.ArrayList;
import java.util.*;
import java.util.Stack;
public class StackUsing {

        public static void main(String[] args) {
            Stack<Integer> stack = new Stack<>();

            stack.push(10);
            stack.push(20);
            stack.push(30);

            System.out.println("Top element: " + stack.peek());

            stack.pop();
            System.out.println("Top element after pop: " + stack.peek());
            stack.pop();

            System.out.println("Top element after pop: " + stack.peek());

            System.out.println("Is stack empty? " + stack.isEmpty());
        }
    }


