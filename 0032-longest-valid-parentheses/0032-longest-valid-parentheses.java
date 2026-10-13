class Solution {
    public int longestValidParentheses(String s) {
        int open = 0;
        int close = 0;
        int ans1 = 0;
        //left to right
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == '('){
                open++;
            }
            else{
                close++;
            }
            if(open == close){
                ans1 = Math.max(ans1,2*close);
            }
            if(close > open){
                open = 0;
                close = 0;
            }
        }
        open = 0;
        close = 0;
        int ans2 = 0;
        //right to left
        for(int i=s.length()-1;i>=0;i--){
            char ch = s.charAt(i);
            if(ch == '('){
                open++;
            }
            else{
                close++;
            }
            if(open == close){
                ans2 = Math.max(ans2,2*open);
            }
            if(open > close){
                open = 0;
                close = 0;
            }
        }
        return Math.max(ans1,ans2);
    }
}