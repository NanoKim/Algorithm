class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int minus = 0;
        int min = Integer.MAX_VALUE;
        
        for(int i = 0; i < array.length; i++){
            minus = Math.abs(n - array[i]);
            
            if(minus < min){
                min = minus;
                answer = array[i];
            }else if(minus == min && array[i] < answer){
                answer = array[i];
            }
        }
         
        return answer;
    }
}