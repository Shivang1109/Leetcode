class Solution {
    public int minimumPushes(String word) {
        int res=0;
        int n=word.length();
        int rem=n%8;
        int div=n/8;
        for(int i=1;i<=div;i++){
            res+=i*8;
        }
        res+=rem*(div+1);
        return res;
    }
}