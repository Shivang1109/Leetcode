class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        int open = 0;
        int close = 0;
        for(char ch:s.toCharArray()){
            if(ch == '('){
                sb.append(ch);
                open++;
            }
            else{
                sb.append(ch);
                close++;
            }
            if(open == close){
                sb.append('+');
                open = 0;
                close = 0;
            }
        }
        //System.out.println(sb);
        String res = sb.toString();
        StringBuilder ans = new StringBuilder();
        for(int i=1;i<res.length()-1;i++){
            if(res.charAt(i)=='+'){
                i+=2;
            }
            if(res.charAt(i+1)!='+'){
                ans.append(res.charAt(i));
            }
        }
        //System.out.println(ans);
        return ans.toString();
    }
}