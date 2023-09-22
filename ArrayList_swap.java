package apna_college;

import java.util.ArrayList;

public class ArrayList_swap {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<Integer>();
        list.add(5);
        list.add(6);
        System.out.println("before swapping");
        System.out.println(list);
        System.out.println("after swapping");
        swap(list,0,1);
        System.out.println(list);
    }
    public static void swap(ArrayList<Integer> list,int indx1,int indx2){
        int temp= list.get(indx1);
        list.set(indx1,list.get(indx2));
        list.set(indx2,temp);
    }
}
