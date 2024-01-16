class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        for(int i = 0; i < my_string.length(); i++){
            char ch = my_string.charAt(i);
            String str = ch+"";
            if(str==str.toUpperCase()){
                answer+=str.toLowerCase();
            }else{
                answer+=str.toUpperCase();
            }
        }
        
        return answer;
    }
}