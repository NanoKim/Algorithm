import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        Arrays.sort(array);
        int max = array[array.length-1];
        int[] arr = new int[max+1];
        
        for(int i = 0; i < array.length; i++){
            arr[array[i]]++;
        }
        
        int max2 = arr[0];
        
        for(int i = 1; i < arr.length; i++){
            if(max2 < arr[i]){
                max2 = arr[i];
                answer = i;
            }else if(max2 == arr[i]){
                answer = -1;
            }
        }
        
        return answer;
    }
}