class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        
        char[] arr = new char[my_string.length()];
        
        for(int i = 0; i < my_string.length(); i++){
            arr[i] = my_string.charAt(i);
        }
        
        for(int i = 0; i < my_string.length(); i++){
            for(int j = 0; j < n; j++){
                answer += arr[i];
            }
        }
        
        return answer;
    }
}