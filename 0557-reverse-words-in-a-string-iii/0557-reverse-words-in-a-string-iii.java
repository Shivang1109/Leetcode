class Solution {
    public String reverseWords(String s) {
        StringBuilder sb1 = new StringBuilder();

        for(String s1 : s.split(" ")){
            StringBuilder sb = new StringBuilder();
           for(int i = 0; i < s1.length(); i++){
               char ch = s1.charAt(i);
               sb.append(ch);
           }
           sb.reverse();
           sb1.append(sb);
           sb1.append(" ");
        }
        String res= sb1.toString();
        res=res.trim();
        return res;
    }
}