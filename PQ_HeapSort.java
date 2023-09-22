package apna_college;
import java.util.Arrays;
public class PQ_HeapSort {

    public static void main(String[] args) {
        int arr[] = {1, 2, 4, 5, 3};
        System.out.println("original array" + Arrays.toString(arr));
        heapsort(arr);
        System.out.println("sorted array" + Arrays.toString(arr));
    }
    public static void heapify(int arr[], int n, int size) {
        int maxIndx = size;
        int left = 2 * size + 1;
        int right = 2 * size + 2;

        if (left < n && arr[left] > arr[maxIndx]) {
            maxIndx = left;
        }
        if (right < n && arr[right] > arr[maxIndx]) {
            maxIndx = right;
        }
        if (maxIndx != size) {
            int swap = arr[size];
            arr[size] = arr[maxIndx];
            arr[maxIndx] = swap;
            heapify(arr, n, maxIndx);
        }
    }

    public static void heapsort(int arr[]) {
        int n = arr.length;
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }
        // One by one extract from heap
        for (int i = n - 1; i > 0; i--) {
            int temp = arr[i];
            arr[i] = arr[0];
            arr[0] = temp;
            heapify(arr, i, 0);
        }
    }
}
