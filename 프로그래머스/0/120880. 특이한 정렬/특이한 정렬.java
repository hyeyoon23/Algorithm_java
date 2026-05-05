class Solution {
    public int[] solution(int[] numlist, int n) {
        
        for (int i = 0; i < numlist.length - 1; i++) {
            for (int j = i + 1; j < numlist.length; j++) {
                
                int diff1 = Math.abs(numlist[i] - n);
                int diff2 = Math.abs(numlist[j] - n);
                
                if (diff1 > diff2) {
                    int temp = numlist[i];
                    numlist[i] = numlist[j];
                    numlist[j] = temp;
                }
                
                else if (diff1 == diff2 && numlist[i] < numlist[j]) {
                    int temp = numlist[i];
                    numlist[i] = numlist[j];
                    numlist[j] = temp;
                }
            }
        }
        
        return numlist;
    }
}