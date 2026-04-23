class Solution {
    public int[] solution(int n) {
        int[] answer = new int[(n+1)/2];
        int idx = 0;
         for (int i=1; i<=n; i++){
            switch(i%2) {
                case 0:
                    break;
                case 1:
                    answer[idx]= i;
                        idx++;
                    break;  
            }
         }
        return answer;
    }
        
}