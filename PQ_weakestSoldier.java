package apna_college;

import java.util.*;

public class PQ_weakestSoldier {
    static class Row implements Comparable<Row> {
        int soldier;
        int indx;

        public Row(int soldier, int indx) {
            this.soldier = soldier;
            this.indx = indx;
        }
        public int compareTo(Row r2) {
            if (this.soldier == r2.soldier) {
                return this.indx - r2.indx;
            } else {
                return r2.indx - this.indx;
            }
        }
    }
    public static void main(String[] args) {
        int arr[][] = {{1, 0, 0, 0}, {1, 1, 1, 1}, {1, 0, 0, 0}, {1, 0, 0, 0}};
        int k = 2;//k means how many row you want to print
        PriorityQueue<Row> pq = new PriorityQueue<>();
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr[0].length; j++) {
                count += arr[i][j] == 1 ? 1 : 0;
            }
            pq.add(new Row(count, i));
        }
        for (int i = 0; i < k; i++) {
            System.out.println("R = " + pq.remove().indx);
        }
    }

}
