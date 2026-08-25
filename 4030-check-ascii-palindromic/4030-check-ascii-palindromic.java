class Solution {
    public boolean isPalindromic(String s) {
        StringBuilder res = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            int ascii = (int)ch;
            String binary = String.format("%8s",Integer.toBinaryString(ascii)).replace(' ', '0');
            res.append(binary);
        }
        String ans = res.toString();
        int i=0;
        int j=ans.length()-1;
        while(i<=j){
            if(ans.charAt(i)!=ans.charAt(j)){
                return false;
            }
            else{
                i++;
                j--;
            }
        }
        return true;
        
    }
}