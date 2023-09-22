package apna_college;

public class Array_Even_Odd_Finder {

    public static void main(String[] args) {
        int number[] = {1, 2, 3, 4, 5};
        int even[] = new int[number.length];
        int odd[] = new int[number.length];
        int evenIndx = 0;
        int oddIndx = 0;
        for (int i = 0; i < number.length; i++) {
            if (number[i] % 2 == 0) {
                even[evenIndx] = number[i];
                evenIndx++;
            } else {
                odd[oddIndx] = number[i];
                oddIndx++;
            }
        }
        System.out.println("even array is");
        for (int i = 0; i < evenIndx; i++) {
            System.out.print(even[i] + " \n");
        }
        System.out.println("odd array is");
        for (int i = 0; i < oddIndx; i++) {
            System.out.print(odd[i] + " ");
        }
    }
}