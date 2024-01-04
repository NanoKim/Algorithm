class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int numer = 0;
        int denom = 0;
        int size = 0;
        boolean flag = true;
        
        if(denom1 % denom2 == 0){
            denom = denom1;
            numer = (denom1/denom2)*numer2 + numer1;
        }else if(denom2 % denom1 == 0){
            denom = denom2;
            numer = (denom2/denom1)*numer1 + numer2;
        }else{
            denom = denom1 * denom2;
            numer = denom2 * numer1 + denom1 * numer2;
        }
        
        if(numer > denom){
            size = numer;
        }else{
            size = denom;
        }
        
        while(flag){
            for(int i = 2; i <= size; i++){
                if((numer % i == 0) && (denom % i == 0)){
                    numer /= i;
                    denom /= i;
                    break;
                }else{
                    if(i == size){
                        flag = false;
                    }
                }
            }
        }
        
        int[] answer = {numer, denom};
        return answer;
    }
}