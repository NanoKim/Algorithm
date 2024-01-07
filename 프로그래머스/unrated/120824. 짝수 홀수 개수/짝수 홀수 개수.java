class Solution {
    public int[] solution(int[] num_list) {
        int countA = 0;
        int countB = 0;
        
        for(int i = 0; i < num_list.length; i++){
            if(num_list[i] % 2 == 0){
                countA++;
            }else{
                countB++;
            }
        }
        
        int[] answer = {countA, countB};
        return answer;
    }
}