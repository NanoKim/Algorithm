import java.util.Arrays;
class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        
        char[] arr = before.toCharArray();
        char[] arr2 = after.toCharArray();
        
        Arrays.sort(arr);
        Arrays.sort(arr2);
        
        String str = new String(arr);
        String str2 = new String(arr2);
        
        if(str.equals(str2)){
            return 1;
        }else{
            return 0;
        }
    }
}