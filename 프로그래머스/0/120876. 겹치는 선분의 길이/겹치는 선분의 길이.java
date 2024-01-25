class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        
        int[] count = new int[201];
        
        for(int[] v : lines){
            int first = v[0]+100;
            int finish = v[1]+100;
            
            for(int j = first; j < finish; j++){
                count[j] += 1;
            }
        }
        
        for(int i = 0; i < count.length; i++){
            if(count[i] > 1) answer++;
        }
        
        return answer;
    }
}