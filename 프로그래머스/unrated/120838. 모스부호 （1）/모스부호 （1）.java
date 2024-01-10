import java.util.HashMap;
class Solution {
    public String solution(String letter) {
        String answer = "";
        
        String[] arr = {".-","-...","-.-.","-..",".","..-.",
                        "--.","....","..",".---","-.-",".-..",
                        "--","-.","---",".--.","--.-",".-.",
                        "...","-","..-","...-",".--","-..-",
                        "-.--","--.."};
        HashMap<String, Character> hm = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            hm.put(arr[i], (char) ('a' + i));
        }

        String[] arr2 = letter.split(" ");

        for (int i = 0; i < arr2.length; i++) {
            if (hm.containsKey(arr2[i])) {
                answer += hm.get(arr2[i]);
            }
        }
        return answer;
    }
}