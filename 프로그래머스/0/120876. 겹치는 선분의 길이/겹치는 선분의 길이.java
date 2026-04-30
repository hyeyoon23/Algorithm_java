class Solution {
    public int solution(int[][] lines) {
        int[] count = new int[201];
        
        for (int i = 0; i < lines.length; i++) {
            int start = lines[i][0];
            int end = lines[i][1];
            
            for (int j = start; j < end; j++) {
                count[j + 100]++;
            }
        }
        
        int answer = 0;
        for (int i = 0; i < count.length; i++) {
            if (count[i] >= 2)
                answer++;
        }
        
        return answer;
    }
}