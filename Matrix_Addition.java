package apna_college;

import java.util.Scanner;

public class Matrix_Addition {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        System.out.println("enter the row");
        int row = sca.nextInt();
        System.out.println("enter the col");
        int col = sca.nextInt();
        int mat1[][] = new int[row][col];
        int mat2[][] = new int[row][col];

        input(mat1, mat2, row, col);
        print(mat1, mat2, row, col);
        add(mat1, mat2, row, col);
    }

    public static void input(int mat1[][], int mat2[][], int row, int col) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements of first matrix");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                mat1[i][j] = sc.nextInt();

            }
        }
        System.out.println("Enter elements of second matrix");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                mat2[i][j] = sc.nextInt();
            }
        }

    }

    public static void print(int mat1[][], int mat2[][], int row, int col) {
        System.out.println("your first matrix is:---");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(mat1[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("your Second matrix is:---");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(mat2[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void add(int mat1[][], int mat2[][], int row, int col) {
        System.out.println("addition of your matrix is");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                int i1 = mat1[i][j] + mat2[i][j];
                System.out.print(i1 + "  ");
            }
            System.out.println();
        }
    }
}