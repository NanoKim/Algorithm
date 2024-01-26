class Solution {
    public int solution(int chicken) {
        int add = 10;
        int answer = 0;

        int ck = chicken / add;
        int coupon = ck + chicken % add;

        while (true) {
            answer += ck;

            if (coupon < add) {
                break;
            }

            ck = coupon / add;
            coupon = ck + coupon % add;
        }
        return answer;
    }
}