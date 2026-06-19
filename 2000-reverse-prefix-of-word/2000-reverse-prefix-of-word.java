class Solution {
    public String reversePrefix(String word, char ch) {
        int count=0;
        StringBuilder sb = new StringBuilder();
        for(char c:word.toCharArray()){
            if(c!=ch){
                sb.append(c);
            }
            else{
                if(count<1){
                    sb.append(c);
                    count++;
                    sb.reverse();
                }
                else{
                    sb.append(c);
                }
            }
        }
        return sb.toString();
    }
}