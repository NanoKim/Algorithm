class Solution {
    public int solution(String binomial) {
        int answer = 0;
        String[] arr = binomial.split(" "); 
        
        if (arr[1].equals("+")) {
            answer = Integer.valueOf(arr[0]) + Integer.valueOf(arr[2]);
        } else if (arr[1].equals("-")) {
            answer = Integer.valueOf(arr[0]) - Integer.valueOf(arr[2]);
        } else if (arr[1]. equals("*")) {
            answer = Integer.valueOf(arr[0]) * Integer.valueOf(arr[2]);
        }
        
        return answer;
    }
}