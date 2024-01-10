class Solution {
    public int solution(int hp) {
        int answer = 0;
        int a = 0;
        int b = 0;
        int c = 0;
        int sum = a+b+c;
        
        if(hp >= 5 && sum != hp){
            a = (hp/5)*5;
            answer += a/5;
            hp -= a;
        }
        
        if(hp >= 3 && sum != hp){
            b = (hp/3)*3;
            answer += b/3;
            hp -= b;
        }
        
        if(sum != hp){
            c = (hp/1)*1;
            answer += c/1;
            hp -= c;
        }
        
        return answer;
    }
}