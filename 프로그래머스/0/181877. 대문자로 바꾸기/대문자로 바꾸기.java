class Solution {
    public String solution(String myString) {
        String answer = "";
        int num = 0;
        
        for(int i = 0; i < myString.length(); i++){
            num = (int)myString.charAt(i);
            
            if((96 < num) && (num < 123)){
                answer += (char)(num - 32);
            }else {
                answer += (char)num;
            }
        }
        return answer;
    }
}