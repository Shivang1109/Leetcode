class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder org=new StringBuilder();
        StringBuilder rev=new StringBuilder();
        int n=s.length();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if((ch>='A' && ch<='Z')||(ch>='a' && ch<='z')||(ch>='0' && ch<='9')){
                org.append(ch);
            }
        }
        for(int i=n-1;i>=0;i--){
            char ch=s.charAt(i);
            if((ch>='A' && ch<='Z')||(ch>='a' && ch<='z')||(ch>='0' && ch<='9')){
                rev.append(ch);
            }
        }
        String s1=org.toString();
        String s2=rev.toString();
        if(s1.equalsIgnoreCase(s2.toString())){
            return true;
        }
        else{
            return false;
        }
        
    }
}