class Solution {
    public int minInsertions(String s) {
        Stack<Character> st = new Stack<>();
        int insert = 0; 
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == '('){
                st.push(ch);
            }
            else{
                if(i+1>=s.length() || s.charAt(i+1)!=')'){
                    insert++;
                }
                else{
                    i++;
                }
                if(!st.isEmpty()){
                    st.pop();
                }
                else{
                    insert++;
                }
            }
        }
        insert += st.size()*2;
        return insert;
    }
}