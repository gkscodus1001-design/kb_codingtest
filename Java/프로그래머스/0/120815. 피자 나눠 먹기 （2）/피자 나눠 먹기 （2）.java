class Solution {
    public int solution(int n) {
        // 6과 n의 최소공배수 구하기
        for (int i = 1; ; i++) {
            if ((6 * i) % n == 0) {  // 6의 배수가 n으로 나누어 떨어지면
                return i;             // 그게 최소 판 수
            }
        }
    }
}