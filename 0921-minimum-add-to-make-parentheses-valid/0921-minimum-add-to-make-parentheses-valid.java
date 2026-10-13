class Solution {
    public int minAddToMakeValid(String s) {
        int add = 0;
        Stack<Character> st = new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch == '('){
                st.push(ch);
            }
            else if(ch == ')'){
                if(st.isEmpty()){
                    add++;
                }
                else{
                    st.pop();
                }
            }
        }
        return st.size()+add;
    }
}