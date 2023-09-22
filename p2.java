package apna_college;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;
//import java.util.Collection;

public class p2 {
    public static void main(String[] args) {
//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(5);
//        list.add(4);
//        list.add(6);
//        list.add(48);
//        list.add(99);
//        Collections.sort(list);
//        System.out.println(list);

        ArrayList<Integer> list=new ArrayList<Integer>();
        for (int i=1;i<=20;i++){
            list.add(i*2);
        }
        System.out.println(list);
        for (int i=0;i< list.size();i++){
            int num= list.get(i);
            if (num%2==0){
                System.out.println(num);
            }
        }
    }
}