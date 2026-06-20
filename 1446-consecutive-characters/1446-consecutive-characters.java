class Solution {
    public int maxPower(String s) {
        int l=0;
        int r=0;
        int max=0;
        while(r<s.length()){
            char ch = s.charAt(l);
            char c = s.charAt(r);
            if(ch==c){
                r++;
            }
            else{
                max=Math.max(max,r-l);
                l=r;
                r++;
            }
        }
        max=Math.max(max,r-l);
        return max;
    }
}