package apna_college;
import java.util.Stack;
public class StackUsingJCF {
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
//        System.out.println("top element "+s.peek());
//        s.pop();
//        System.out.println("top after pop"+s.peek());
//        System.out.println("stack is empty"+s.isEmpty());
    }
}
