package apna_college;

public class Arrays2D_sum_of {
    public static void main(String[] args) {
        int array[][] = {{1, 4, 3}, {4, 5, 6}, {6, 4, 2}};
        int sum = 0;
        int sum1 = 0;
        int sum2 = 0;
        for (int j = 0; j < array.length; j++) {
            sum = sum + array[0][j];
        }
        System.out.println("sum of element of 1st row " + sum);

        for (int j = 0; j < array.length; j++) {
            sum1 = sum1 + array[1][j];
        }
        System.out.println("sum of element of 2nd row " + sum1);

        for (int j = 0; j < array.length; j++) {
            sum2 = sum2 + array[2][j];
        }
        System.out.println("sum of element of 3rd row " + sum2);
    }
}
