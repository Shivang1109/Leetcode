class Solution {
    public boolean checkRecord(String s) {
        int absent=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='A'){
                absent++;
            }
        }
        if(absent>=2){
            return false;
        }
        else{
            if(s.contains("LLL")){
                return false;
            }
            else{
                return true;   
            }
    }
}
}