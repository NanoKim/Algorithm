class Solution {
    public String[] solution(String my_string) {
        String[] arr = my_string.trim().split("\\s+");
        String[] answer = new String[arr.length];
        
        for (int i = 0; i < arr.length; i++) {
            answer[i] = arr[i];
        }
        return answer;
    }
}