class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int sum = 0;
        int sum2 = 0;
        
        for (int num : arr1) {
            sum += num;
        }
        
        for (int num : arr2) {
            sum2 += num;
        }
        
        if (arr1.length > arr2.length || (arr1.length == arr2.length && sum > sum2)) {
            return 1;
        } else if (arr1.length < arr2.length || (arr1.length == arr2.length && sum < sum2)) {
            return -1;
        } else {
            return 0;
        }
    }
}