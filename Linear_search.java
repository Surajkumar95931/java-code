package apna_college;
public class Linear_search {
    public static int Linear_search(int numbers[], int key) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int numbers[] = {12, 10, 5, 14, 62};
        int key = 62;
        int index = Linear_search(numbers, key);
        if (index != -1) {
            System.out.println("Found your index at " + index);
        } else {
            System.out.println("Not found");
        }
    }
}
