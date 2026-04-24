class Solution {
    public int solution(String my_string) {
        int sum = 0;
        String num = "";
        
        for (char c : my_string.toCharArray()) {
            // 숫자인 경우
            if (Character.isDigit(c))
                num += c; // 숫자 이어붙임
            else {
                // 숫자 끝나면
                if (!num.equals("")) {
                    sum += Integer.parseInt(num); // 정수로 변환해서 합
                    num = "";
                }
            }
        }
        
        // 마지막 숫자 처리
        if (!num.equals(""))
            sum += Integer.parseInt(num);
        
        return sum;
    }
}