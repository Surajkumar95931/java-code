package apna_college;

import java.util.*;

public class HASHSET_UNION_INTR {

    public static void main(String[] args) {
        // Create two HashSet instances to store elements from two arrays
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        // Arrays to be used for union and intersection
        int arr1[] = {7, 3, 9};
        int arr2[] = {6, 3, 9, 2, 9, 4};

        // Add elements from arr1 to set1
        for (int i = 0; i < arr1.length; i++) {
            set1.add(arr1[i]);
        }

        // Add elements from arr2 to set2
        for (int i = 0; i < arr2.length; i++) {
            set2.add(arr2[i]);
        }

        // Calculate Union using HashSet
        HashSet<Integer> union = new HashSet<>(set1); // Create a copy of set1
        union.addAll(set2); // Add all elements from set2 to the union

        // Calculate Intersection using HashSet
        HashSet<Integer> intersection = new HashSet<>(set1); // Create a copy of set1
        intersection.retainAll(set2); // Retain only elements that are common between set1 and set2

        // Print the union and intersection elements
        System.out.println("Union Elements: " + union);
        System.out.println("Intersection Elements: " + intersection);
    }
}
