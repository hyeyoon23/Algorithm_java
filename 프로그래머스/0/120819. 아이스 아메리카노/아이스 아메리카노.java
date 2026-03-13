class Solution {
    public int[] solution(int money) {
        
        int glass = money / 5500;
        int change = money % 5500;
        
        int[] answer = {glass, change};
            
        return answer;
    }
}