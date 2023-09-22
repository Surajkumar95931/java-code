package apna_college;

import java.util.ArrayList;

public class ArrayList_pair {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println(list);
        pair(list);
        //System.out.println(list);
    }
    public static void pair(ArrayList<Integer> list){
        for (int i=0;i<list.size();i++){
            int a=list.get(i);
            for (int j=i+1;j<list.size();j++){
                int b= list.get(j);
                System.out.println(a +" "+b+"="+sum(a,b));
            }
        }

    }
    public static int sum(int a,int b){
        return a+b;
    }
}
