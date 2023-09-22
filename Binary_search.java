package apna_college;

public class Binary_search {



            public static void main(String[] args) {
                int harshal[] = {1, 65, 1, 56, 85, 32, 45};
                int target = 65;
                int index = Binary(harshal, target);
                if (index != -1) {
                    System.out.println(target + " found at index " + index + " in the array.");
                } else {
                    System.out.println(target + " not found in the array.");
                }
            }

            public static int Binary(int arr[], int target) {
                int start = 0;
                int end = arr.length - 1;
                while (start <= end) {
                    int mid = (start + end) / 2;
                    if (arr[mid] == target) {
                        return mid; // Return the index where the target was found
                    } else if (arr[mid] < target) {
                        start = mid + 1;
                    } else {
                        end = mid - 1;
                    }
                }
                return -1; // Return -1 if the target was not found
            }
        }


