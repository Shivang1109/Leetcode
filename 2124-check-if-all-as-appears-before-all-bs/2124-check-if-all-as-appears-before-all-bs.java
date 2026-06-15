class Solution {
    public boolean checkString(String s) {
        int indB=s.length();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='b'){
                indB=i;
                break;
            }
        }
        int indA=s.lastIndexOf('a');
        if(indA>indB){
            return false;
        }
        else{
            return true;
        }
    }
}