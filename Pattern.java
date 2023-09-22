package apna_college;

public class Pattern {

    public static void rot_half_pyramid(int n) {
        for (int i = 1; i <= n; i++) {
            //spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            //stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        rot_half_pyramid(5);
    }
}
