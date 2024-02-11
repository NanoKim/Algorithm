import java.util.*;
class Solution {
    public int[] solution(int[] arr, int k) {
        HashSet<Integer> hs = new HashSet<>();
        int[] answer = new int[k];
        
        int count = 0;
        for(int i = 0; i < arr.length; i++) {
            if(!hs.contains(arr[i])) {
                hs.add(arr[i]);
                answer[count] = arr[i];
                count++;
            }
            if(count == k) {
                break;
            }
        }
        for(int i = count; i < k; i++) {
            answer[i]=-1;
        }
        return answer;
    }
}