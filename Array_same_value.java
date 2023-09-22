package apna_college;

public class Array_same_value {
    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 2, 1, 5, 6, 6, 3, 7, 4};

       // boolean a = false;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                   // a = true;
                    System.out.println("Duplicate value: " + arr[i]);
                }
            }
        }

//        if (!a) {
//            System.out.println("No duplicate values found.");
//        }
    }
}
