class Solution {
    public int[] solution(int[][] score) {
        float[] arr = new float[score.length];
        int[] answer = new int[score.length];
        
        for(int i = 0; i < score.length; i++) {
            arr[i] = (float)((score[i][0] + score[i][1]) / 2.0);
        }
        
        for(int j = 0; j < score.length; j++) {
            int order = 1;
            for(int k = 0; k < score.length; k++) {
                if(arr[j] < arr[k]) {
                    order++;
                }
                answer[j] = order;
            }
        }
        return answer;
    }
}