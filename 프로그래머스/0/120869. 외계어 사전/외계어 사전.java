import java.util.*;

class Solution {
    public int solution(String[] spell, String[] dic) {
        // spell 정렬
        Arrays.sort(spell);
        String target = String.join("", spell);
        
        for (String word : dic) {
            String[] arr = word.split("");
            Arrays.sort(arr);
            String sortedWord = String.join("", arr);
            
            if (target.equals(sortedWord)) {
                return 1;
            }
        }
        
        return 2;
    }
}