class Solution {
    public String reverseOnlyLetters(String s) {
        int i=0;
        int j=s.length()-1;
        StringBuilder sb=new StringBuilder(s);
        while(i<j){
            char ch=sb.charAt(i);
            char ch1=sb.charAt(j);
            if(!Character.isLetter(ch1)){
                j--;
            }
             else if(!Character.isLetter(ch)){
                i++;
            }
            else{
                sb.setCharAt(j,ch);
                sb.setCharAt(i,ch1);
                i++;
                j--;
            }

        }
        return sb.toString();
    }
}