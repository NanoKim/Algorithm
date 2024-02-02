import java.util.*;
class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> list = new ArrayList<>();
        
        for (String v : intStrs) {
            int i = Integer.parseInt(v.substring(s, s + l));
            if (i > k) {
                list.add(i);
            }
        }
        
        return list.stream().mapToInt(i->i).toArray();
    }
}