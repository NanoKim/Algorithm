class Solution {
    public String[] solution(String[] picture, int k) {
        int row = picture.length;
        int col = picture[0].length();

        int newRow = row * k;
        int newCol = col * k;

        String[] newPicture = new String[newRow];

        for (int i = 0; i < newRow; i++) {
            StringBuilder sb = new StringBuilder();
            
            int num1 = i / k;

            for (int j = 0; j < newCol; j++) {
                int num2 = j / k;
                char ch = picture[num1].charAt(num2);
                sb.append(ch);
            }

            newPicture[i] = sb.toString();
        }

        return newPicture;
    }
}