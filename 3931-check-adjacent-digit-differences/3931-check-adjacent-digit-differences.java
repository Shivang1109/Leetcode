class Solution {
    public boolean isAdjacentDiffAtMostTwo(String s) {
        int abs=0;
        for(int i = 0; i < s.length()-1; i++) {
            int diff=Math.abs(s.charAt(i+1)-s.charAt(i));
            abs=Math.max(abs,diff);

        }
        if(abs>2){
            return false;
        }
        else{
            return true;
        }
        
    }
}
