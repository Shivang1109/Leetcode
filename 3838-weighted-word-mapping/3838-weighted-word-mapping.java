class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<words.length;i++){
            int sum=0;
            for(char ch:words[i].toCharArray()){
                sum+=weights[ch-'a'];
            }
            int rem=sum%26;
            sb.append((char)('z'-rem));
        }
        String s=sb.toString();
        return s;
    }
}