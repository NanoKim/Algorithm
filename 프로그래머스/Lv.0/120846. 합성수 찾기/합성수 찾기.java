class Solution {
    public int solution(int n) {
        int count = 0;
        int[] arr = new int[n];
        
        for(int i = 0; i < n; i++){
            arr[i] = i+1;
        }
        
        for(int i = 3; i < n; i++){
            for(int j = 2; j < i; j++){
                if(arr[i] % j == 0){
                    count++;
                    break;
                }
            }
        }
        
        return count;
    }
}