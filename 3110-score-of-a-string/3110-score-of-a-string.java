class Solution {
    public int scoreOfString(String s) {
        int sum=0;
        for(int i=0;i<s.length()-1;i++){
            char ch=s.charAt(i);
            char ch2=s.charAt(i+1);
            int diff=Math.abs(ch-ch2);
            sum+=diff;
        }
        return sum;
    }
}