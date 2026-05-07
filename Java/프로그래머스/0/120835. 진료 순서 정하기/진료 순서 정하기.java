import java.util.Arrays;
class Solution {
    public int[] solution(int[] emergency) {
        int[] sorted = emergency.clone();
        Arrays.sort(sorted);
        
        int[] result = new int[emergency.length]; //결과배열
        for (int i = 0; i < emergency.length; i++) {
            result[i] = sorted.length - Arrays.binarySearch(sorted, emergency[i]);
        }
        return result;
        
    }
}