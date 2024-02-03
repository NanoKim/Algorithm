class Solution {
    public String solution(String my_string, int[][] queries) {
        char[] arr = my_string.toCharArray();
        
        for (int[] v : queries) {
            int start = v[0];
            int end = v[1];
            
            while (start < end) {
                char ch = arr[start];
                arr[start] = arr[end];
                arr[end] = ch;
                
                start++;
                end--;
            }
        }
        
        return new String(arr);
    }
}