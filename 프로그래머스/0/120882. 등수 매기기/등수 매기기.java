class Solution {
    public int[] solution(int[][] score) {
        int n = score.length;
        int[] answer = new int[n];
        
        for (int i = 0; i < n; i++) {
            int rank = 1;
            int avg1 = score[i][0] + score[i][1];
            
            for (int j = 0; j < n; j++) {
                int avg2 = score[j][0] + score[j][1];
                
                if (avg2 > avg1) {
                    rank++;
                }
            }
            
            answer[i] = rank;
        }
        
        return answer;
    }
}