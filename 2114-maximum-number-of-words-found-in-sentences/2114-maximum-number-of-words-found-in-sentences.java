class Solution {
    public int mostWordsFound(String[] sentences) {
        int max=0;
        for(String sentence : sentences){
            int count=sentence.split(" ").length;
            
            max=Math.max(count,max);
        }
        return max;
    }
}