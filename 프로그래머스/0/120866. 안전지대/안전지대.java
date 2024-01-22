class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        int[][] arr = new int[board.length+2][board.length+2];
        
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                if(board[i][j] == 1){
                    for(int a=i;a<=i+2;a++){
                        for(int b=j;b<=j+2;b++){
                            if(arr[a][b] != 1){
                                arr[a][b] = 2;
                            }
                        }
                    }
                }
            }
        }
        
        for(int i = 1;i<arr.length-1;i++){
            for(int j = 1;j<arr.length-1;j++){
                if(arr[i][j] == 0){
                    answer++;
                }
            }
        }
        
        return answer;
    }
}