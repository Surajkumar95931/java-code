package apna_college;

public class Array2D_transpose {
    public static void main(String[] args) {
        int row = 2;
        int col = 3;
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}};


        System.out.println("Main matrix");
        print(matrix);

        int[][] transpose = new int[col][row];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        System.out.println("Transpose matrix");
        print(transpose);
    }


    public static void print(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j] + "  ");
            }
            System.out.println();
        }

    }
}
