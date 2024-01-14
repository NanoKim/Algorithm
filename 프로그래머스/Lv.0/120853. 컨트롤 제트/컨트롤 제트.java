class Solution {
    public int solution(String s) {
        int sum = 0;
        String[] arr = s.split(" ");
        for(int i = 0; i < arr.length; i++){
            if(!arr[i].equals("Z")){
                sum = sum + Integer.parseInt(arr[i]);
            }else{
                sum = sum - Integer.parseInt(arr[i-1]);
            }
        }
        return sum;
    }
}