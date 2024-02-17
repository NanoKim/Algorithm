import java.util.*;
class Solution {
    public int[] solution(int[] num_list) {
        int[] arr = new int[num_list.length - 5];
        Arrays.sort(num_list);
        
        for (int i = 5; i < num_list.length; i++) {
            arr[i - 5] = num_list[i];
        }
        
        return arr;
    }
}