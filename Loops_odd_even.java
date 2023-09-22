package apna_college;

public class Loops_odd_even {
    public static void main(String[] args) {
        int arr[] = {2, 3, 5, 6, 7, 8, 9, 10};

        System.out.println("even number");
        int even = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");
                even += arr[i];
            }
        }
        System.out.println("\nsum of even no =" + even);
        System.out.println("\nodd number");
        int odd = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                System.out.print(arr[i] + " ");
                odd += arr[i];
            }
        }
        System.out.println("\nsum of odd no =" + odd);
    }
}
