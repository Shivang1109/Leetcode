class Solution {
    public int mostWordsFound(String[] sentences) {
        int max=0;
        for(String sentence : sentences){
            int count=0;
            for(String word : sentence.split(" ")){
                count++;
            }
            max=Math.max(count,max);
        }
        return max;
    }
}