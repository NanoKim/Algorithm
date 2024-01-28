class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String strA = a + "" + b;
        int ab2 = 2 * a * b;
        
        if(Integer.parseInt(strA) >= ab2){
            answer = Integer.parseInt(strA);
        }else{
            answer = ab2;
        }
        
        
        return answer;
    }
}