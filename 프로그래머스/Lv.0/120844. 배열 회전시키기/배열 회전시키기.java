class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        int lIndex = numbers.length-1;
        
        for(int i = 0; i < lIndex; i++){
            if(direction.equals("right")){
                answer[i+1] = numbers[i];
                answer[0] = numbers[lIndex];
            }else if(direction.equals("left")){
                answer[i] = numbers[i+1];
                answer[lIndex] = numbers[0];
            }
        }
        
        return answer;
    }
}