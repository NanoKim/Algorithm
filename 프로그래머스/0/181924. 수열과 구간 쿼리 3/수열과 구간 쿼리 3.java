class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int v;
        
        for(int i = 0; i < queries.length; i++){
            v = arr[queries[i][0]];
            arr[queries[i][0]] = arr[queries[i][1]];
            arr[queries[i][1]] = v;
        }
        
        return arr;
    }
}