import java.util.*;
class Solution {
    public int solution(int[] sides) {
        Arrays.sort(sides);
        int max = sides[1];
        int min = sides[0];

        int a = max - min;
        int b = max + min;

        return b - a - 1;
    }
}