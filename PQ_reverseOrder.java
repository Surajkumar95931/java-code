package apna_college;

import java.util.*;

public class PQ_reverseOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PriorityQueue<Integer> p=new PriorityQueue<>(Comparator.reverseOrder());
        System.out.println("how many elements you entered");
        int n = sc.nextInt();
        int arr[]=new int[n];

        System.out.println("enter your elements");
        for (int i = 0; i < n; i++) {
            int val=sc.nextInt();
            p.add(val);
            arr[i]=val;
        }

        System.out.println("your entered elements");
        for (int i=0;i< arr.length;i++){
            System.out.println(arr[i]+" ");
        }

        System.out.println("elements in reverse order");
        while (!p.isEmpty()){
            System.out.println(p.peek()+" ");
            p.remove();
        }
    }
}