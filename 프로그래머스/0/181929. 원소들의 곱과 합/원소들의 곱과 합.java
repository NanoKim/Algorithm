class Solution {
    public int solution(int[] num_list) {
        int sum = 0;
        int mul = 1;
        
        for(int v : num_list){
            sum += v;
            mul *= v;
        }
        
        if(sum*sum > mul){
            return 1;
        }else{
            return 0;
        }
    }
}