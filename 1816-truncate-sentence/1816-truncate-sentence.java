class Solution {
    public String truncateSentence(String s, int k) {
        StringBuilder sb = new StringBuilder();
        String[] arr = s.split(" ");
        for(int i = 0; i < k; i++){
            sb.append(arr[i]);
            sb.append(" ");
        }
        String res= sb.toString().trim();
        return res;
    }
}