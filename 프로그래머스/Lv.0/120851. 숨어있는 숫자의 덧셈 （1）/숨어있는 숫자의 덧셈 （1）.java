class Solution {
    public int solution(String my_string) {
        my_string = my_string.replaceAll("[a-zA-Z]","");
        
        String[] arr = my_string.split("");
        int[] arr2 = new int[my_string.length()];
        
        int sum = 0;
        
        for(int i = 0; i < my_string.length(); i++){
            arr2[i] = Integer.parseInt(arr[i]);
            sum+=arr2[i];
        }
        
        return sum;
    }
}