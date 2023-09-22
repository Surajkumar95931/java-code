package apna_college;

import java.util.HashSet;

public class HASHSET_UNIon_inter {
    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        int arr1[] = {7, 3, 9};
        int arr2[] = {6, 3, 9, 2, 9, 4};

        for (int i = 0; i < arr1.length; i++) {
            set1.add(arr1[i]);
        }

        for (int i = 0; i < arr2.length; i++) {
            set2.add(arr2[i]);
        }

        HashSet<Integer> union = new HashSet<>(set1);
        union.addAll(set2);

        HashSet<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);

        System.out.println("Union Elements: " + union);
        System.out.println("Intersection Elements: " + intersection);
    }
}
