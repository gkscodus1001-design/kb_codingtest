import java.util.*;
class Solution {
    public int solution(int[] array) {
        
        //array 최대값 구하기
        int max=0;
        for (int num : array) {
            if (max < num) 
                max = num;
        }
        
        int[] count = new int[max+1];
        
        //횟수 구하기
        for (int num : array) {
            count[num] += 1;
        }
        
        //최대 횟수 찾기
        int maxCount = 0;
        int answer = 0;
        for (int i=0; i<count.length; i++){
            if (count[i]>maxCount) {
                maxCount = count[i];
                answer = i;
        }else if(count[i]==maxCount){
                answer=-1;
            }
        
        }
        return answer;
    }
}
