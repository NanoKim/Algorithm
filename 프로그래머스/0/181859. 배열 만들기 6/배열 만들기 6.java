import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        int[] answer = array(arr);
        
        if(answer.length == 0) {
            return new int[]{-1};
        }
        
        return answer;
    }
    
    private static int[] array(int[] arr){
        Stack<Integer> stk = new Stack<>();
        for(int i = 0; i < arr.length; i++){
            if(stk.isEmpty() || stk.peek() != arr[i]) {
                stk.push(arr[i]);
            }else{
                stk.pop();
            }
        }
        int[] arr2 = new int[stk.size()];
        int idx = arr2.length - 1;
        while(!stk.isEmpty()){
            arr2[idx] = stk.pop();
            idx--;
        }
        return arr2;
    }
}