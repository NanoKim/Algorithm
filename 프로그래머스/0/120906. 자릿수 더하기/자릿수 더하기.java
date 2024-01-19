class Solution {
    public int solution(int n) {
        int answer = 0;
        String size = n + "";
        
        for(int i = 0; i < size.length(); i++){
            answer += n%10;
            n/=10;
        }
        
        return answer;
    }
}