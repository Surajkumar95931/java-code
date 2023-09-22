package apna_college;

public class Arrays2D_Count_of {
    public static void main(String[] args) {
        int twoD[][] = {{1, 2, 3, 3, 3, 4}, {4, 6, 7, 3, 6, 3}};
        int find = 0;
        for (int i = 0; i < twoD.length; i++) {
            for (int j = 0; j < twoD[0].length; j++) {
                if (twoD[i][j] == 3)
                {
                    find++;
                }
            }
        }
        System.out.println("total 3 present in 2d array is " + find);
    }
}
