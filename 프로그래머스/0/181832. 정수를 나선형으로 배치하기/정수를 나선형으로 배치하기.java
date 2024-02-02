class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        
        int row = 0; 
        int col = 0; 
        
        int num1 = 1;
        int num2 = 0;

        while (num1 <= n * n) {
            answer[row][col] = num1++;

            if (num2 == 0) {
                if (col == n - 1 || answer[row][col + 1] != 0) {
                    num2 = 1;
                    row++;
                } else {
                    col++;
                }
            } else if (num2 == 1) {
                if (row == n - 1 || answer[row + 1][col] != 0) {
                    num2 = 2;
                    col--;
                } else {
                    row++;
                }
            } else if (num2 == 2) {
                if (col == 0 || answer[row][col - 1] != 0) {
                    num2 = 3;
                    row--;
                } else {
                    col--;
                }
            } else if (num2 == 3) {
                if (row == 0 || answer[row - 1][col] != 0) {
                    num2 = 0;
                    col++;
                } else {
                    row--;
                }
            }
        }

        return answer;
    }
}