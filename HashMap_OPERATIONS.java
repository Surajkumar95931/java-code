package apna_college;

import java.util.*;

public class HashMap_OPERATIONS {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();

        //put()-for enter value in hashmap
        hm.put("china", 100);
        hm.put("India", 130);
        hm.put("US", 33);
        hm.put("mexico", 93);
        System.out.println(hm);
        //get(key)- to get value from hashmap
        int population = hm.get("India");
        System.out.println(population);
        //ContainsKey-
        System.out.println(hm.containsKey("India"));//true
        System.out.println(hm.containsKey("indonesia"));//it should return false
        //remove()-
        System.out.println(hm.remove("china"));
        System.out.println(hm);
        //size()-
        System.out.println(hm.size());
        //isEmpty()-to check hashmap is empty or not
        System.out.println(hm.isEmpty());

        //iterations
        Set<String> find = hm.keySet();
        System.out.println(find);

        for (String k : find) {
            System.out.println("key is = " + k + ", value is = " + hm.get(k));
        }

    }
}
