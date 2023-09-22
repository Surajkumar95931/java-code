package apna_college;
public class ArrayPair {
    public static void Pair(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            int current = numbers[i];
            for (int j = i + 1; j < numbers.length; j++) {
                int sum = current + numbers[j];
                System.out.println("(" + current + "," + numbers[j] + ")" + " =" + sum + ",");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int numbers[] = {5, 3, 4, 5, 4, 9};
        Pair(numbers);
    }

}

