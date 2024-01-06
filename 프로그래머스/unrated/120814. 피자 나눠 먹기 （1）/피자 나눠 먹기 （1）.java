class Solution {
    public int solution(int n) {
        int size = 7;
        int answer = 0;
        
        if(n%size == 0){
            answer = n/size;    
        }else if(n < size) {
            answer = 1;
        }else {
            answer = n/size + 1; 
        }

        return answer;
    }
}