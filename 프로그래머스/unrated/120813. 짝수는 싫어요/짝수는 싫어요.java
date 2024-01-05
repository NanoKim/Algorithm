class Solution {
    public int[] solution(int n) {
        int size = 0;
        int count = 0;
        
        if(n % 2 == 1){
            size = n / 2 + 1;
        }else{
            size = n / 2;
        }
        
        int[] arr = new int[size];
        for(int i = 0; i <= n; i++){
            if(i%2==1){
                arr[count] = i;
                count++;
            }
        }
        
        int[] answer = arr;
        return answer;
    }
}