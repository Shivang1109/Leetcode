class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        int num1=0;
        int num2=0;
        int target=0;
        for(int i=0; i<firstWord.length(); i++) {
            char ch = firstWord.charAt(i);
            int rem=ch-'a';
            num1=num1*10+rem;

        }
        for(int i=0; i<secondWord.length(); i++) {
            char ch = secondWord.charAt(i);
            int rem = ch - 'a';
            num2 = num2 * 10 + rem;
        }
        for(int i=0; i<targetWord.length(); i++) {
            char ch = targetWord.charAt(i);
            int rem = ch - 'a';
            target = target*10 + rem;
        }
        if(num1+num2==target) {
           return true;
        }
        else {
            return false;
        }
    }
}