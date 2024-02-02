import java.util.Arrays;

class Solution {
    public String[] solution(String my_string) {
        int size = my_string.length();
        String[] arr = new String[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = my_string.substring(i);
        }

        Arrays.sort(arr);

        return arr;
    }
}