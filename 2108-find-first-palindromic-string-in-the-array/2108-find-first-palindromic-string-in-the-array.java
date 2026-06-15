class Solution {

     boolean isPalindrome(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public String firstPalindrome(String[] words) {
         StringBuilder sb=new StringBuilder();
        for(int i=0; i<words.length; i++){
            if(isPalindrome(words[i])){
                sb.append(words[i]);
                break;
            }
        }
        return sb.toString();
        
    }
}