import java.util.*;
class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        int result = numbers[0] * numbers[1];
        int result2 = numbers[numbers.length - 1] * numbers[numbers.length-2];
        
        return result > result2 ? result : result2;
    }
}