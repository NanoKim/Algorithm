import java.util.*;
class Solution {
    public int[] solution(int n) {
        int countA = 0;
        int countB = 0;
        
        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                countA++;
            }
        }
        
        int[] answer = new int[countA];
        
        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                answer[countB++] = i;
            }
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
}