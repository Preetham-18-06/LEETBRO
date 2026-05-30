class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[] rows = new int[m];
        int[] cols = new int[n];

        // Toggle parity of affected rows and columns
        for (int[] index : indices) {
            rows[index[0]] ^= 1;
            cols[index[1]] ^= 1;
        }

        int oddRows = 0, oddCols = 0;

        for (int row : rows) {
            oddRows += row;
        }

        for (int col : cols) {
            oddCols += col;
        }

        return oddRows * (n - oddCols)
             + (m - oddRows) * oddCols;
    }
}