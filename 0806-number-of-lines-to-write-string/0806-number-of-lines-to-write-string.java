class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        int lines=1;
        int currWidth=0;
        for(int i=0;i<s.length();i++){
            int w=widths[s.charAt(i)-'a'];
            if(currWidth+w<=100){
                currWidth+=w;
            }
            else{
                lines++;
                currWidth=w;
            }
        }
        int[] ans={lines,currWidth};
        return ans;

    }
}