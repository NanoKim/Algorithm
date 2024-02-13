class Solution {
    public int[] solution(String myString) {
        String[] arr = myString.split("x", -1);
        int[] arr2 = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[i].length();
        }

        return arr2;
    }
}