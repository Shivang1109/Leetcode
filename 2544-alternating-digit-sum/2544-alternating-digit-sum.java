class Solution {
    public int alternateDigitSum(int n) {
        int evenSum=0;
        int oddSum=0;
        String s=String.valueOf(n);
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(i%2==0){
                evenSum=evenSum+c-'0';
            }
            else{
                oddSum=oddSum+c-'0';
            }
        }
        return evenSum-oddSum;
        
    }
}