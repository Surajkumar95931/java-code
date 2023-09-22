package apna_college;

import java.util.*;

public class HASHMAP_majority_val {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int arr[] = {1, 1, 1, 1, 2, 3, 6, 5, 4, 4, 4, 4, 4, 4, 4,4, 5};

        for(int i=0;i< arr.length;i++){
            if (map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }else{
                map.put(arr[i],1);
            }
        }
        //  Set<Integer> keyset = map.keySet();
        for (Integer key: map.keySet()){
            if (map.get(key)> arr.length/3){
                System.out.println(key+" is present "+ map.get(key)+" times in your array");
            }
        }

    }
}