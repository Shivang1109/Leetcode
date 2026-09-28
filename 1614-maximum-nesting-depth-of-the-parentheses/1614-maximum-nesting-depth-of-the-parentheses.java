class Solution {
    public int maxDepth(String s) {
        int res = 0;
        int max = 0;
        for(char ch : s.toCharArray()){
            if(ch == '('){
                res++;
                max = Math.max(max,res);
            }
            else if(ch == ')'){
                res--;
            }

        }
        
        return max;
        
    }
}