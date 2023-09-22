package apna_college;

public class Pattern_righthalfpyramid {
    public static void main(String[] args) {
        for (int i = 0; i <= 5; i++) {

            for (int a = 0; a < 5 - 1; a++) {
                System.out.print(" ");
                for (int j = 0; j < i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
}
