package apna_college;
public class TRicks {
    public static void main(String[] args) {

        int arr[] = {1, 5, 99, 5, 3, 6, 7, 3};

        System.out.println("Original array:");
        printarr(arr);

        int reversed1[] = reverse(arr);
        System.out.println("Reversed array:");
        printarr(reversed1);

        int sumArray[] = sum(arr, reversed1);
        System.out.println("Sum of original and reversed array:");
        printarr(sumArray);
    }

    public static void printarr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int[] reverse(int[] arr) {
        int first = 0;
        int last = arr.length - 1;
        while (first < last) {
            int temp = arr[last];
            arr[last] = arr[first];
            arr[first] = temp;
            first++;
            last--;
        }
        return arr;
    }

//    public static int[] sum(int[] a, int[] b) {
//        int[] result = new int[a.length];
//        for (int i = 0; i < a.length; i++) {
//            result[i] = a[i] + b[i];
//        }
//        return result;
//    }
public static int[] sum(int[] a, int[] b) {
    int[] result = new int[a.length];
    for (int i = 0; i < a.length; i++) {
        result[i] = a[i] + b[i];
    }
    return result;
}

}
