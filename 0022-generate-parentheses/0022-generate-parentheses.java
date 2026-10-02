class Solution {
    public void backtrack(String s, int open, int close, int n, List<String> ans) {
        // Base case
        if (s.length() == 2 * n) {
            ans.add(s);
            return;
        }
        // Choice 1: add '('
        if (open < n) {
            backtrack(s + "(", open + 1, close, n, ans);
        }
        // Choice 2: add ')'
        if (close < open) {
            backtrack(s + ")", open, close + 1, n, ans);
        }
    }
    public List<String> generateParenthesis(int n) {
        
    List<String> ans = new ArrayList<>();

        backtrack("", 0, 0, n, ans);

        return ans;
    }

    
}