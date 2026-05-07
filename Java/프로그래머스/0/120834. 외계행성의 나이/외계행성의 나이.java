class Solution {
    public String solution(int age) {
        String result = "";
        for (char c : String.valueOf(age).toCharArray()) {
            result += (char)('a' + (c - '0'));
        }
        return result;
    }
}