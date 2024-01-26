class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        String str = String.valueOf(k);
        
        for (int l = i; l <= j; l++) {
            String str2 = String.valueOf(l);
            if (str2.contains(str)) {
                String[] array = str2.split("");
                for (String v : array) {
                    if (v.equals(str)) answer++;
                }
            }
        }
        
        return answer;
    }
}