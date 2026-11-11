class Solution {
    public long countValidSubstrings(String s) {
        int lastA = -1;
        int bestAB = -1;
        int lastBadStart = -1;

        long count = 0;
        for(int right=0;right<s.length();right++){
            char ch = s.charAt(right);
            if(ch == 'a'){
                lastA = right;
            }
            else if(ch == 'b'){
                if(lastA != -1){
                    bestAB = lastA;
                }
            }
            else if(ch =='c'){
                if(bestAB != -1){
                    lastBadStart = Math.max(lastBadStart,bestAB);
                }
            }
            count += right - lastBadStart;
        }
        return count;   
    }
}