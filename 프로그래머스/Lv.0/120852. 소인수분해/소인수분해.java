import java.util.ArrayList;
class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> list = new ArrayList();
        int[] arr = null;
        int index = 0;
        
        for(int i = 2; i <= n; i++){
            if(n % i == 0){
                while(n % i == 0){
                    n /= i;
                }
                list.add(i);
            }
        }
        
        arr = new int[list.size()];
        
        for(int v : list){
            arr[index++] = v;
        }
        
        return arr;
    }
}