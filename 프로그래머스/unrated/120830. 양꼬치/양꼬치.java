class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        int service = 0;
        
        if(n > 9){
            service = n/10;
        }
        
        answer = 12000*n + 2000*(k-service);
        
        return answer;
    }
}