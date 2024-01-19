class Solution {
    public int[] solution(int n, int[] numlist) {
        int countA = 0;
        int countB = 0;
        
        for(int i = 0; i < numlist.length; i++){
            if(numlist[i] % n == 0){
                countA++;
            }
        }
        
        int[] arr = new int[countA];
        
        for(int i = 0; i < numlist.length; i++){
            if(numlist[i] % n == 0){
                arr[countB++] = numlist[i];
            }
        }
        
        return arr;
    }
}