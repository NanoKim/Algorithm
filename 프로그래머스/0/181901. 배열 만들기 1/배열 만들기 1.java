import java.util.*;
class Solution {
    public List<Integer> solution(int n, int k) {
        List<Integer> list = new ArrayList<>();
        
        for (int i = 1; k * i <= n; i++) {
            list.add(k*i);
        }
        
        return list;
    }
}