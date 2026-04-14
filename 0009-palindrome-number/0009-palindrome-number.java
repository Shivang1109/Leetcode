class Solution {
    public boolean isPalindrome(int x) {
        
        
            
            int original=x;
            int y=0;
            if(x<0){
                return false;
            }
            else{
                while(original!=0){
                int digit=original%10;
                y=y*10+digit;
                original=original/10;
            }
            if(x==y){
                return true;
            }
            else{
                return false;
            }
            }

    }
}