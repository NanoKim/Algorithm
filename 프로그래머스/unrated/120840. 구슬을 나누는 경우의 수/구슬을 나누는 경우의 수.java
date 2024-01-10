class Solution {
    public int solution(int balls, int share) {
        long answer = 1;
        int count = 1;
        
        for(int i = share+1; i <= balls; i++){
            answer *= i;
            answer /= count++;
        }
        return (int)answer;
    }
}