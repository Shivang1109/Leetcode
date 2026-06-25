class Solution {
    public boolean detectCapitalUse(String word) {
        boolean isUpper = true;
        boolean isLower = true;
        for(Character c : word.toCharArray()) {
            if(!Character.isUpperCase(c)) {
                isUpper = false;
            }
            if(!Character.isLowerCase(c)) {
                isLower = false;
            }
        }
        if(isUpper || isLower) {
            return true;
        }
        if(Character.isUpperCase(word.charAt(0))){
            for(int i=1; i<word.length(); i++) {
                char ch=word.charAt(i);
                if(!Character.isLowerCase(ch)) {
                    return false;
                }
            }
            return true;
        }

        return false;

    }
}