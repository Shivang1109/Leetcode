class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(char ch: s.toCharArray()){
            if(ch == 'a') {
                stack.push(ch);
            }
            else if(ch == 'b'){
                if(stack.isEmpty() || stack.peek()!='a'){
                    return false;
                }
                stack.push(ch);
            }
            else if(ch == 'c') {
                if(stack.isEmpty() || stack.peek()!='b'){
                    return false;
                }
                stack.pop();
                if(stack.isEmpty() || stack.peek()!='a'){
                    return false;
                }
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}