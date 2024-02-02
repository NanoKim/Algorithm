class Solution {
    public int[][] solution(int[][] arr) {
        int row = arr.length;
        int col = arr[0].length;

        if (row > col) {
            int[][] arr2 = new int[row][row];
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    arr2[i][j] = arr[i][j];
                }
                arr2[i][col] = 0;
            }
            return arr2;
        } else if (col > row) {
            int[][] arr2 = new int[col][col];
            for (int i = 0; i < col; i++) {
                for (int j = 0; j < row; j++) {
                    arr2[j][i] = arr[j][i];
                }
                arr2[row][i] = 0;
            }
            return arr2;
        } else {
            return arr;
        }
    }
}