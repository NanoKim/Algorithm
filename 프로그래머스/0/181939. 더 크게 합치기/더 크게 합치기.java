class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String strA = a + "" + b;
        String strB = b + "" + a;
        
        if(Integer.parseInt(strA) >= Integer.parseInt(strB)){
            answer = Integer.parseInt(strA);
        }else{
            answer = Integer.parseInt(strB);
        }
        
        return answer;
    }
}