import java.util.Arrays;
class Solution {
    public int[] solution(String my_string) {
        String str = my_string.replaceAll("[a-z]","");
        
        String[] arr = str.split("");
        int[] answer = new int[arr.length];
        
        for(int i = 0; i < arr.length; i++){
            answer[i] = Integer.parseInt(arr[i]);
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
}